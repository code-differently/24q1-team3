package com.fooddifferently.fd.service;

import com.fooddifferently.fd.exception.UserAlreadyExistsException;
import com.fooddifferently.fd.exception.UserNotFoundException;
import com.fooddifferently.fd.model.User;
import com.fooddifferently.fd.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

/**
 * Service class for managing users in the application
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    /**
     * Registers a new user in the application
     *
     * @param newUser The user to be registered
     * @return The registered user
     */
    public User registerUser(User newUser) {
        validateUser(newUser);
        return userRepository.save(newUser);
    }

    /**
     * Retrieves a user by their ID
     *
     * @param userId The ID of the user to retrieve
     * @return The user with the specified ID
     */
    public User getUserById(Long userId) {
        return userRepository.findById(userId)
                .orElseThrow(() -> new UserNotFoundException("User not found with ID: " + userId));
    }

    /**
     * Updates an existing user
     *
     * @param userId      The ID of the user to update
     * @param updatedUser The updated user object
     * @return The updated user
     */
    public User updateUser(Long userId, User updatedUser) {
        validateUser(updatedUser);
        User existingUser = getUserById(userId);
        /
        existingUser.setUsername(updatedUser.getUsername());
        existingUser.setEmail(updatedUser.getEmail());
        // Additional fields can be updated similarly

        return userRepository.save(existingUser);
    }

    /**
     * Deletes a user by their ID
     *
     * @param userId The ID of the user to delete
     */
    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }

    /**
     * Retrieves all users in the application
     *
     * @return A list of all users
     */
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    /**
     * Searches for users by their username
     *
     * @param username The username to search for
     * @return A list of users with the specified username
     */
    public List<User> searchUsersByUsername(String username) {
        return userRepository.findByUsernameContaining(username);
    }

    /**
     * Validates the user object before saving it to the database
     *
     * @param user The user to validate
     */
    private void validateUser(User user) {
        if (user.getUsername() == null || user.getUsername().isEmpty()) {
            throw new IllegalArgumentException("Username cannot be empty");
        }
    }

    /**
     * Creates a new user
     *
     * @param newUser The user to be created
     * @return The created user
     */
    public User createUser(User newUser) {
        Optional<User> existingUserByUsername = userRepository.findByUsername(newUser.getUsername());
        User existingUserByEmail = userRepository.findByEmail(newUser.getEmail());

        if (existingUserByUsername != null) {
            throw new UserAlreadyExistsException("User with username " + newUser.getUsername() + " already exists");
        }

        if (existingUserByEmail != null) {
            throw new UserAlreadyExistsException("User with email " + newUser.getEmail() + " already exists");
        }

        /**
         * If the user does not already exist, save the new user to the database
         */
        return userRepository.save(newUser);
    }
}
