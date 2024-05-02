package com.fooddifferently.fd.dto;

/**
 * Data Transfer Object (DTO) representing a review.
 */
public class ReviewDTO {

    private Long id;
    private String restaurantName;
    private String location;
    private String userId;
    private int rating;
    private String comment;

    /**
     * Default constructor.
     */
    public ReviewDTO() {
    }

    /**
     * Constructor with parameters.
     *
     * @param id             The ID of the review.
     * @param restaurantName The name of the restaurant associated with the review.
     * @param location       The location of the restaurant associated with the review.
     * @param userId         The ID of the user who submitted the review.
     * @param rating         The rating given in the review.
     * @param comment        The comment provided in the review.
     */
    public ReviewDTO(Long id, String restaurantName, String location, String userId, int rating, String comment) {
        this.id = id;
        this.restaurantName = restaurantName;
        this.location = location;
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
     * @param id The ID of the review to set.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Get the name of the restaurant associated with the review.
     *
     * @return The name of the restaurant.
     */
    public String getRestaurantName() {
        return restaurantName;
    }

    /**
     * Set the name of the restaurant associated with the review.
     *
     * @param restaurantName The name of the restaurant to set.
     */
    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    /**
     * Get the location of the restaurant associated with the review.
     *
     * @return The location of the restaurant.
     */
    public String getLocation() {
        return location;
    }

    /**
     * Set the location of the restaurant associated with the review.
     *
     * @param location The location of the restaurant to set.
     */
    public void setLocation(String location) {
        this.location = location;
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
     * @param userId The ID of the user to set.
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
