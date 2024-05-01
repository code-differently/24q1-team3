package com.fooddifferently.fooddifferently.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Represents a review entity.
 */
@Entity
public class Review {

    
     // Unique identifier for the review.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    
    // Identifier for the reviewed item.
     
    private String itemId;

    
    // Identifier for the reviewer.
     
    private String reviewerId;

    
    // Rating given in the review.
     
    private int rating;

    
    // Comment provided in the review.
    
    private String comment;

    
    // Default constructor for creating a Review object.
     
    public Review() {
    }

    /**
     * Constructs a review with specified attributes.
     *
     * @param itemId     The identifier of the item being reviewed.
     * @param reviewerId The identifier of the reviewer.
     * @param rating     The rating given in the review.
     * @param comment    The comment provided in the review.
     */
    public Review(String itemId, String reviewerId, int rating, String comment) {
        this.itemId = itemId;
        this.reviewerId = reviewerId;
        this.rating = rating;
        this.comment = comment;
    }

    /**
     * Retrieves the unique identifier of the review.
     *
     * @return The unique identifier of the review.
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the unique identifier of the review.
     *
     * @param id The unique identifier to set.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Retrieves the identifier of the item being reviewed.
     *
     * @return The identifier of the item being reviewed.
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * Sets the identifier of the item being reviewed.
     *
     * @param itemId The identifier to set.
     */
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    /**
     * Retrieves the identifier of the reviewer.
     *
     * @return The identifier of the reviewer.
     */
    public String getReviewerId() {
        return reviewerId;
    }

    /**
     * Sets the identifier of the reviewer.
     *
     * @param reviewerId The identifier to set.
     */
    public void setReviewerId(String reviewerId) {
        this.reviewerId = reviewerId;
    }

    /**
     * Retrieves the rating given in the review.
     *
     * @return The rating given in the review.
     */
    public int getRating() {
        return rating;
    }

    /**
     * Sets the rating given in the review.
     *
     * @param rating The rating to set.
     */
    public void setRating(int rating) {
        this.rating = rating;
    }

    /**
     * Retrieves the comment provided in the review.
     *
     * @return The comment provided in the review.
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the comment provided in the review.
     *
     * @param comment The comment to set.
     */
    public void setComment(String comment) {
        this.comment = comment;
    }
}