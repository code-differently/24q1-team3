
package com.fooddifferently.fd.repository;

import com.fooddifferently.fd.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *  UserRepository interface
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    /**
     * @param username
     * @return a user by username
     */
    User findByUsername(String username);

    /**
     * @param email
     * @return a user by email
     */
    User findByEmail(String email);

    /**
     * @param userId
     * @return a user by userId
     */
    User findByUserId(Long userId);

}
