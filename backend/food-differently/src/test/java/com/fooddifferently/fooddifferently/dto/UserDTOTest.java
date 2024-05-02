package com.fooddifferently.fooddifferently.dto;

import com.fooddifferently.fd.dto.UserDTO;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UserDTOTest {

    @Test
    public void testSetAndGetId() {
        Long userId = 1L;
        UserDTO userDTO = new UserDTO();
        userDTO.setId(userId);

        assertEquals(userId, userDTO.getId());
    }

    @Test
    public void testSetAndGetUsername() {
        String username = "john_doe";
        UserDTO userDTO = new UserDTO();
        userDTO.setUsername(username);

        assertEquals(username, userDTO.getUsername());
    }

    @Test
    public void testSetAndGetEmail() {
        String email = "john@example.com";
        UserDTO userDTO = new UserDTO();
        userDTO.setEmail(email);

        assertEquals(email, userDTO.getEmail());
    }

    @Test
    public void testSetAndGetFirstName() {
        String firstName = "John";
        UserDTO userDTO = new UserDTO();
        userDTO.setFirstName(firstName);

        assertEquals(firstName, userDTO.getFirstName());
    }

    @Test
    public void testSetAndGetLastName() {
        String lastName = "Doe";
        UserDTO userDTO = new UserDTO();
        userDTO.setLastName(lastName);

        assertEquals(lastName, userDTO.getLastName());
    }

    @Test
    public void testSetAndGetPhoneNumber() {
        String phoneNumber = "1234567890";
        UserDTO userDTO = new UserDTO();
        userDTO.setPhoneNumber(phoneNumber);

        assertEquals(phoneNumber, userDTO.getPhoneNumber());
    }

    @Test
    public void testSetAndGetAddress() {
        String address = "123 Main St";
        UserDTO userDTO = new UserDTO();
        userDTO.setAddress(address);

        assertEquals(address, userDTO.getAddress());
    }

    @Test
    public void testSetAndGetAge() {
        Integer age = 30;
        UserDTO userDTO = new UserDTO();
        userDTO.setAge(age);

        assertEquals(age, userDTO.getAge());
    }
}
