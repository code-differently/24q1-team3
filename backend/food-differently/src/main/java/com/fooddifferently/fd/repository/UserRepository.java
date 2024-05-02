package com.fooddifferently.fd.repository;

import com.fooddifferently.fd.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Repository interface for managing User entities.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    /**
     * Find a user by their username.
     *
     * @param username The username to search for.
     * @return An Optional containing the user if found, or empty if not found.
     */
    Optional<User> findByUsername(String username);

    /**
     * Find a user by their email address.
     *
     * @param email The email address to search for.
     * @return The user with the specified email address.
     */
    User findByEmail(String email);

    /**
     * Check if a user exists with the given username.
     *
     * @param username The username to check.
     * @return True if a user with the specified username exists, otherwise false.
     */
    boolean existsByUsername(String username);

    /**
     * Check if a user exists with the given email address.
     *
     * @param email The email address to check.
     * @return True if a user with the specified email address exists, otherwise false.
     */
    boolean existsByEmail(String email);
}
