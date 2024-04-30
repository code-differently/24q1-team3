package com.fooddifferently.fooddifferently.service;

import com.fooddifferently.fooddifferently.model.User;
import com.fooddifferently.fooddifferently.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 */
@Service
public class UserServiceImpl implements UserService {

    /**
     *  @param userRepository
     */
    private final UserRepository userRepository;

    /**
     *
     * @param userRepository
     * constructor for UserServiceImpl
     */
    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * @return a list of all users
     */
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    /**
     * @param userId
     * @return a user by userId
     */
    @Override
    public User getUserById(Long userId) {
        return userRepository.findById(userId).orElse(null);
    }

    /**
     * @param user
     * @return a new user
     */
    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    /**
     * @param userId
     * @param user
     * @return an updated user
     */
    @Override
    public User updateUser(Long userId, User user) {
        User existingUser = userRepository.findById(userId).orElse(null);
        if (existingUser != null) {
            user.setUserId(userId);
            return userRepository.save(user);
        }
        return null;
    }

    /**
     * @param userId
     * @return delete a user by userId
     */
    @Override
    public boolean deleteUser(Long userId) {
        if (userRepository.existsById(userId)) {
            userRepository.deleteById(userId);
            return true;
        }
        return false;
    }
}
