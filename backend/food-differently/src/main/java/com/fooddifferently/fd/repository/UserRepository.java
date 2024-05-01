package com.fooddifferently.fd.repository;

import com.fooddifferently.fd.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Repository class for managing users in the application
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    /**
     * Retrieves a user by their email
     *
     * @param email The email of the user to retrieve
     * @return The user with the specified email
     */
    User findByEmail(String email);

    /**
     * Retrieves a list of users whose username contains the specified string
     *
     * @param username The string to search for in the username
     * @return A list of users whose username contains the specified string
     */
    List<User> findByUsernameContaining(String username);

    /**
     * Retrieves a user by their username
     *
     * @param username The username of the user to retrieve
     * @return The user with the specified username
     */
    Optional<User> findByUsername(String username);

    /**
     * Checks if a user with the specified username exists
     *
     * @param username The username to check for
     * @return True if a user with the specified username exists, false otherwise
     */
    boolean existsByUsername(String username);

    /**
     * Checks if a user with the specified email exists
     *
     * @param email The email to check for
     * @return True if a user with the specified email exists, false otherwise
     */
    boolean existsByEmail(String email);

    /**
     * Retrieves a list of users whose first name contains the specified string
     *
     * @param firstName The string to search for in the first name
     * @return A list of users whose first name contains the specified string
     */
    List<User> findByFirstNameContaining(String firstName);

    /**
     * Retrieves a list of users whose last name contains the specified string
     *
     * @param lastName The string to search for in the last name
     * @return A list of users whose last name contains the specified string
     */
    List<User> findByLastNameContaining(String lastName);

    /**
     * Retrieves a list of users whose email contains the specified string
     *
     * @param email The string to search for in the email
     * @return A list of users whose email contains the specified string
     */
    List<User> findByEmailContaining(String email);
}