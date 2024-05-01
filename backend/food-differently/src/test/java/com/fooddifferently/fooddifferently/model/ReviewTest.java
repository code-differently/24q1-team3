package com.fooddifferently.fooddifferently.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;

import com.fooddifferently.fd.model.Review;

public class ReviewTest {

    @Test
    public void testConstructorAndGetters() {
        Review review = new Review("item123", "user456", 4, "Great product!");

        assertEquals("item123", review.getItemId());
        assertEquals("user456", review.getReviewerId());
        assertEquals(4, review.getRating());
        assertEquals("Great product!", review.getComment());
    }

    @Test
    public void testSetters() {
        Review review = new Review();
        review.setItemId("item789");
        review.setReviewerId("user987");
        review.setRating(5);
        review.setComment("Excellent service!");

        assertEquals("item789", review.getItemId());
        assertEquals("user987", review.getReviewerId());
        assertEquals(5, review.getRating());
        assertEquals("Excellent service!", review.getComment());
    }

    @Test
    public void testIdSetterGetter() {
        Review review = new Review();
        review.setId(123L);

        assertEquals(123L, review.getId());
    }

    @Test
    public void testDefaultConstructor() {
        Review review = new Review();

        assertNull(review.getItemId());
        assertNull(review.getReviewerId());
        assertEquals(0, review.getRating());
        assertNull(review.getComment());
    }

    @Test
    public void testParameterizedConstructor() {
        Review review = new Review("item123", "user456", 4, "Great product!");

        assertNotNull(review.getItemId());
        assertNotNull(review.getReviewerId());
        assertNotEquals(0, review.getRating());
        assertNotNull(review.getComment());
    }
}
