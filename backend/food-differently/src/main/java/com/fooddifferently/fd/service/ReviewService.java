package com.fooddifferently.fd.service;

import com.fooddifferently.fd.model.Review;
import com.fooddifferently.fd.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReviewService {

    private final ReviewRepository reviewRepository;
    private final YelpApiService yelpApiService;

    @Autowired
    public ReviewService(ReviewRepository reviewRepository, YelpApiService yelpApiService) {
        this.reviewRepository = reviewRepository;
        this.yelpApiService = yelpApiService;
    }

    public Review getReviewById(Long id) {
        Optional<Review> optionalReview = reviewRepository.findById(id);
        return optionalReview.orElse(null);
    }

    public Review createReview(Review review) {
        return reviewRepository.save(review);
    }

    public Review updateReview(Long id, Review review) {
        Optional<Review> optionalExistingReview = reviewRepository.findById(id);
        if (optionalExistingReview.isPresent()) {
            review.setId(id);
            return reviewRepository.save(review);
        }
        return null;
    }

    public void deleteReview(Long id) {
        reviewRepository.deleteById(id);
    }

    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }

    /**
     * Retrieve Yelp reviews for a given restaurant and merge them with existing reviews.
     *
     * @param restaurantName The name of the restaurant.
     * @param location       The location of the restaurant.
     */
    public void mergeYelpReviews(String restaurantName, String location) {
        List<String> yelpReviews = yelpApiService.getReviews(restaurantName, location);

        List<Review> existingReviews = reviewRepository.findByRestaurantNameAndLocation(restaurantName, location);

        for (String yelpReview : yelpReviews) {
            Review newReview = new Review();
            newReview.setRestaurantName(restaurantName);
            newReview.setLocation(location);
            newReview.setComment(yelpReview);
            existingReviews.add(newReview);
        }

        reviewRepository.saveAll(existingReviews);
    }
}
