package com.fooddifferently.fd.service;

import com.fooddifferently.fd.exception.UserAlreadyExistsException;
import com.fooddifferently.fd.exception.UserNotFoundException;
import com.fooddifferently.fd.model.User;
import com.fooddifferently.fd.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service class for managing User entities.
 */
@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * Retrieve all users from the database.
     *
     * @return List of all users.
     */
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    /**
     * Retrieve a user by their ID.
     *
     * @param id The ID of the user to retrieve.
     * @return The user with the specified ID.
     * @throws UserNotFoundException if no user is found with the given ID.
     */
    public User getUserById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User with ID " + id + " not found"));
    }

    /**
     * Create a new user.
     *
     * @param user The user object containing user details.
     * @return The newly created user.
     * @throws UserAlreadyExistsException if a user with the same username or email already exists.
     */
    public User createUser(User user) {
        if (userRepository.existsByUsername(user.getUsername())) {
            throw new UserAlreadyExistsException("User with username " + user.getUsername() + " already exists");
        }

        if (userRepository.existsByEmail(user.getEmail())) {
            throw new UserAlreadyExistsException("User with email " + user.getEmail() + " already exists");
        }

        // Save the new user to the database
        return userRepository.save(user);
    }

    /**
     * Update an existing user.
     *
     * @param id   The ID of the user to update.
     * @param user The updated user object.
     * @return The updated user.
     * @throws UserNotFoundException if no user is found with the given ID.
     */
    public User updateUser(Long id, User user) {
        getUserById(id);

        user.setId(id);
        return userRepository.save(user);
    }

    /**
     * Delete a user by their ID.
     *
     * @param id The ID of the user to delete.
     * @throws UserNotFoundException if no user is found with the given ID.
     */
    public void deleteUser(Long id) {
        // Check if the user exists
        getUserById(id); // This will throw UserNotFoundException if user not found

        userRepository.deleteById(id);
    }
}
