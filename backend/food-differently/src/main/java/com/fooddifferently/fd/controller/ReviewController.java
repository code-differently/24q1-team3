package com.fooddifferently.fd.controller;
import com.fooddifferently.fd.model.Review;
import com.fooddifferently.fd.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
/**
 * Controller class for handling review-related operations.
 */
@RestController
@RequestMapping("/reviews")
public class ReviewController {
    private final ReviewService reviewService;
    @Autowired
    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }
    /**
     * Retrieves a review by its ID.
     *
     * @param id The ID of the review to retrieve.
     * @return The review with the specified ID.
     */
    @GetMapping("/{id}")
    public Review getReviewById(@PathVariable Long id) {
        return reviewService.getReviewById(id);
    }
    /**
     * Creates a new review.
     *
     * @param review The review object containing review details.
     * @return The newly created review.
     */
    @PostMapping("/create")
    public Review createReview(@RequestBody Review review) {
        return reviewService.createReview(review);
    }
    /**
     * Updates an existing review.
     *
     * @param id     The ID of the review to update.
     * @param review The updated review object.
     * @return The updated review.
     */
    @PutMapping("/{id}")
    public Review updateReview(@PathVariable Long id, @RequestBody Review review) {
        return reviewService.updateReview(id, review);
    }
    /**
     * Deletes a review by its ID.
     *
     * @param id The ID of the review to delete.
     */
    @DeleteMapping("/{id}")
    public void deleteReview(@PathVariable Long id) {
        reviewService.deleteReview(id);
    }
    /**
     * Retrieves all reviews.
     *
     * @return A list of all reviews.
     */
    @GetMapping("/all")
    public List<Review> getAllReviews() {
        return reviewService.getAllReviews();
    }
}
