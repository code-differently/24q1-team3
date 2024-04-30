package com.fooddifferently.fooddifferently.model;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;

import com.fooddifferently.fooddifferently.dto.AddressDTO;
import com.fooddifferently.fooddifferently.dto.UserDTO;

public class UserDTOTest {

    @Test
    public void testConstructorAndGetters() {
        // Arrange
        Long userId = 1L;
        String username = "john_doe";
        String email = "john@example.com";
        String firstName = "John";
        String lastName = "Doe";
        String phoneNumber = "1234567890";
        AddressDTO address = new AddressDTO();

        // Act
        UserDTO user = new UserDTO(userId, username, email, firstName, lastName, phoneNumber, address);

        // Assert
        assertEquals(userId, user.getUserId());
        assertEquals(username, user.getUsername());
        assertEquals(email, user.getEmail());
        assertEquals(firstName, user.getFirstName());
        assertEquals(lastName, user.getLastName());
        assertEquals(phoneNumber, user.getPhoneNumber());
        assertEquals(address, user.getAddress());
    }

    @Test
    public void testSetters() {
        // Arrange
        UserDTO user = new UserDTO();
        Long userId = 1L;
        String username = "john_doe";
        String email = "john@example.com";
        String firstName = "John";
        String lastName = "Doe";
        String phoneNumber = "1234567890";
        AddressDTO address = new AddressDTO();

        // Act
        user.setUserId(userId);
        user.setUsername(username);
        user.setEmail(email);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setPhoneNumber(phoneNumber);
        user.setAddress(address);

        // Assert
        assertEquals(userId, user.getUserId());
        assertEquals(username, user.getUsername());
        assertEquals(email, user.getEmail());
        assertEquals(firstName, user.getFirstName());
        assertEquals(lastName, user.getLastName());
        assertEquals(phoneNumber, user.getPhoneNumber());
        assertEquals(address, user.getAddress());
    }

    @Test
    public void testDefaultConstructor() {
        // Arrange
        UserDTO user = new UserDTO();

        // Assert
        assertNull(user.getUserId());
        assertNull(user.getUsername());
        assertNull(user.getEmail());
        assertNull(user.getFirstName());
        assertNull(user.getLastName());
        assertNull(user.getPhoneNumber());
        assertNull(user.getAddress());
    }

    @Test
public void testEqualsAndHashCode() {
    // Arrange
    AddressDTO address = new AddressDTO();
    address.setStreet("123 Main St");
    address.setCity("City");
    address.setZipCode("12345");

    UserDTO user1 = new UserDTO(1L, "john_doe", "john@example.com", "John", "Doe", "1234567890", address);
    UserDTO user2 = new UserDTO(1L, "john_doe", "john@example.com", "John", "Doe", "1234567890", address);
    UserDTO user3 = new UserDTO(2L, "jane_doe", "jane@example.com", "Jane", "Doe", "0987654321", new AddressDTO());

    // Assert
    assertEquals(user1, user2);
    assertNotEquals(user1, user3);
    assertEquals(user1.hashCode(), user2.hashCode());
    assertNotEquals(user1.hashCode(), user3.hashCode());
}

@Test
public void testToString() {
    // Arrange
    AddressDTO address = new AddressDTO();
    address.setStreet("123 Main St");
    address.setCity("City");
    address.setZipCode("12345");

    UserDTO user = new UserDTO(1L, "john_doe", "john@example.com", "John", "Doe", "1234567890", address);

    // Assert
    String expectedToString = "UserDTO{" +
            "userId=1, " +
            "username='john_doe', " +
            "email='john@example.com', " +
            "firstName='John', " +
            "lastName='Doe', " +
            "phoneNumber='1234567890', " +
            "address=AddressDTO{street='123 Main St', city='City', zipCode='12345'}" +
            "}";
    assertEquals(expectedToString, user.toString());
    }
}
