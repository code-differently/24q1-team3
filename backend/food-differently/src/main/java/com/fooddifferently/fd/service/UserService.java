package com.fooddifferently.fooddifferently.service;

import com.fooddifferently.fooddifferently.model.User;

import java.util.List;

// This interface defines the methods that the UserService class will implement.
public interface UserService {

    /**
     * @return a list of all users
     */
    List<User> getAllUsers();

    /**
     * @param userId
     * @return a user by userId
     */
    User getUserById(Long userId);

    /**
     * @param user
     * @return a new user
     */
    User createUser(User user);

    /**
     * @param userId
     * @param user
     * @return an updated user
     */
    User updateUser(Long userId, User user);

    /**
     * @param userId
     * @return a boolean value
     */
    boolean deleteUser(Long userId);
}
