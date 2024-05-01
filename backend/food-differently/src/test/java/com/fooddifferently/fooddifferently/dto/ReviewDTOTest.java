package com.fooddifferently.fooddifferently.dto;

import com.fooddifferently.fd.dto.ReviewDTO;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class ReviewDTOTest {

    @Test
    public void testCreateReviewDTOWithDefaultConstructor() {
        ReviewDTO reviewDTO = new ReviewDTO();
        Assert.assertNotNull(reviewDTO);
        assertNull(reviewDTO.getId());
        assertNull(reviewDTO.getRestaurantId());
        assertNull(reviewDTO.getUserId());
        assertEquals(0, reviewDTO.getRating());
        assertNull(reviewDTO.getComment());
    }

    @Test
    public void testGetAndSetReviewDTOProperties() {
        ReviewDTO reviewDTO = new ReviewDTO();
        reviewDTO.setId(1L);
        reviewDTO.setRestaurantId("123");
        reviewDTO.setUserId("456");
        reviewDTO.setRating(4);
        reviewDTO.setComment("Great experience!");

        assertEquals(1L, (long) reviewDTO.getId());
        assertEquals("123", reviewDTO.getRestaurantId());
        assertEquals("456", reviewDTO.getUserId());
        assertEquals(4, reviewDTO.getRating());
        assertEquals("Great experience!", reviewDTO.getComment());
    }

    @Test
    public void testCreateReviewDTOWithParameterizedConstructor() {
        Long id = 1L;
        String restaurantId = "123";
        String userId = "456";
        int rating = 4;
        String comment = "Nice ambiance.";

        ReviewDTO reviewDTO = new ReviewDTO(id, restaurantId, userId, rating, comment);

        assertEquals(id, reviewDTO.getId());
        assertEquals(restaurantId, reviewDTO.getRestaurantId());
        assertEquals(userId, reviewDTO.getUserId());
        assertEquals(rating, reviewDTO.getRating());
        assertEquals(comment, reviewDTO.getComment());
    }

    @Test
    public void testNullValuesInReviewDTO() {
        ReviewDTO reviewDTO = new ReviewDTO();

        assertNull(reviewDTO.getId());
        assertNull(reviewDTO.getRestaurantId());
        assertNull(reviewDTO.getUserId());
        assertEquals(0, reviewDTO.getRating());
        assertNull(reviewDTO.getComment());
    }

    @Test
    public void testSetReviewDTOProperties() {
        ReviewDTO reviewDTO = new ReviewDTO();
        reviewDTO.setId(1L);
        reviewDTO.setRestaurantId("123");
        reviewDTO.setUserId("456");
        reviewDTO.setRating(4);
        reviewDTO.setComment("Nice place!");

        assertEquals(1L, (long) reviewDTO.getId());
        assertEquals("123", reviewDTO.getRestaurantId());
        assertEquals("456", reviewDTO.getUserId());
        assertEquals(4, reviewDTO.getRating());
        assertEquals("Nice place!", reviewDTO.getComment());

        // Test updating values
        reviewDTO.setId(2L);
        reviewDTO.setRestaurantId("456");
        reviewDTO.setUserId("789");
        reviewDTO.setRating(5);
        reviewDTO.setComment("Excellent service!");

        assertEquals(2L, (long) reviewDTO.getId());
        assertEquals("456", reviewDTO.getRestaurantId());
        assertEquals("789", reviewDTO.getUserId());
        assertEquals(5, reviewDTO.getRating());
        assertEquals("Excellent service!", reviewDTO.getComment());
    }
}
