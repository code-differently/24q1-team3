package com.fooddifferently.fd.repository;

import com.fooddifferently.fd.model.Review;
import lombok.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {

    /**
     * Retrieves a review by its ID.
     *
     * @param id The ID of the review to retrieve.
     * @return The review with the specified ID, or null if not found.
     */
    @Override
    Optional<Review> findById(Long id);

    /**
     * Deletes a review by its ID.
     *
     * @param id The ID of the review to delete.
     */
    @Override
    void deleteById(@NonNull Long id);

    /**
     * Retrieves all reviews associated with a specific restaurant.
     *
     * @param restaurantId The ID of the restaurant.
     * @return A list of reviews for the specified restaurant.
     */
    List<Review> findByRestaurantId(String restaurantId);

    /**
     * Retrieves all reviews submitted by a specific user.
     *
     * @param userId The ID of the user.
     * @return A list of reviews submitted by the specified user.
     */
    List<Review> findByUserId(String userId);

    /**
     * Retrieves all reviews with a specified rating.
     *
     * @param rating The rating value to search for.
     * @return A list of reviews with the specified rating.
     */
    List<Review> findByRating(int rating);

    /**
     * Retrieves all reviews containing a specific keyword in the comment.
     *
     * @param keyword The keyword to search for in the comment.
     * @return A list of reviews containing the specified keyword in the comment.
     */
    List<Review> findByCommentContaining(String keyword);
}
