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

    @Autowired
    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    /**
     * Retrieves a review by its ID.
     *
     * @param id The ID of the review to retrieve.
     * @return The review with the specified ID.
     */
    public Review getReviewById(Long id) {
        Optional<Review> optionalReview = reviewRepository.findById(id);
        return optionalReview.orElse(null);
    }

    /**
     * Creates a new review.
     *
     * @param review The review object containing review details.
     * @return The newly created review.
     */
    public Review createReview(Review review) {
        // Additional logic can be added here before saving
        return reviewRepository.save(review);
    }

    /**
     * Updates an existing review.
     *
     * @param id     The ID of the review to update.
     * @param review The updated review object.
     * @return The updated review.
     */
    public Review updateReview(Long id, Review review) {
        // Check if the review exists
        Optional<Review> optionalExistingReview = reviewRepository.findById(id);
        if (optionalExistingReview.isPresent()) {
            // Update the existing review with the new data
            review.setId(id); // Ensure the ID matches the path variable
            return reviewRepository.save(review);
        }
        return null; // Review not found
    }

    /**
     * Deletes a review by its ID.
     *
     * @param id The ID of the review to delete.
     */
    public void deleteReview(Long id) {
        reviewRepository.deleteById(id);
    }

    /**
     * Retrieves all reviews.
     *
     * @return A list of all reviews.
     */
    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }
}

