package com.fooddifferently.fd.dto;

/**
 * Data Transfer Object (DTO) representing a review.
 */
public class ReviewDTO {

    private Long id;
    private String restaurantId;
    private String userId;
    private int rating;
    private String comment;

    public ReviewDTO() {
    }

    public ReviewDTO(Long id, String restaurantId, String userId, int rating, String comment) {
        this.id = id;
        this.restaurantId = restaurantId;
        this.userId = userId;
        this.rating = rating;
        this.comment = comment;
    }

    /**
     * Get the ID of the review.
     *
     * @return The ID of the review.
     */
    public Long getId() {
        return id;
    }

    /**
     * Set the ID of the review.
     *
     * @param id The ID of the review.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Get the ID of the restaurant associated with the review.
     *
     * @return The ID of the restaurant.
     */
    public String getRestaurantId() {
        return restaurantId;
    }

    /**
     * Set the ID of the restaurant associated with the review.
     *
     * @param restaurantId The ID of the restaurant.
     */
    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    /**
     * Get the ID of the user who submitted the review.
     *
     * @return The ID of the user.
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Set the ID of the user who submitted the review.
     *
     * @param userId The ID of the user.
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * Get the rating given in the review.
     *
     * @return The rating.
     */
    public int getRating() {
        return rating;
    }

    /**
     * Set the rating for the review.
     *
     * @param rating The rating to set.
     */
    public void setRating(int rating) {
        this.rating = rating;
    }

    /**
     * Get the comment provided in the review.
     *
     * @return The comment.
     */
    public String getComment() {
        return comment;
    }

    /**
     * Set the comment for the review.
     *
     * @param comment The comment to set.
     */
    public void setComment(String comment) {
        this.comment = comment;
    }
}
