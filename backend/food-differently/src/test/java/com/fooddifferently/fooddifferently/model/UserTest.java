package com.fooddifferently.fooddifferently.model;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class UserTest {

    @Test
    public void testUserConstructorAndGetters() {
        User user = new User("iyana_cross", "password123", "iyana@example.com", "iyana", "cross", "123 Main St", "1234567890");
        
        assertEquals("iyana_cross", user.getUsername());
        assertEquals("password123", user.getPassword());
        assertEquals("iyana@example.com", user.getEmail());
        assertEquals("iyana", user.getFirstName());
        assertEquals("cross", user.getLastName());
        assertEquals("123 Main St", user.getAddress());
        assertEquals("1234567890", user.getPhoneNumber());
    }

    @Test
    public void testUserIdSetter() {
        User user = new User();
        user.setUserId(1L);
        
        assertEquals(1L, user.getUserId());
    }

    @Test
    public void testUsernameSetter() {
        User user = new User();
        user.setUsername("iyana_cross");
        
        assertEquals("iyana_cross", user.getUsername());
    }

    @Test
    public void testEmailSetter() {
        User user = new User();
        user.setEmail("iyana@example.com");
        
        assertEquals("iyana@example.com", user.getEmail());
    }

    @Test
    public void testPhoneNumberSetter() {
        User user = new User();
        user.setPhoneNumber("9876543210");
        
        assertEquals("9876543210", user.getPhoneNumber());
    }
}