package com.fooddifferently.fd.controller;

import com.fooddifferently.fd.model.User;
import com.fooddifferently.fd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller class to handle HTTP requests related to users.
 */
@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    /**
     * Constructor for UserController.
     * @param userService The user service to be used by the controller.
     */
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    /**
     * Endpoint to get all users.
     * @return List of all users.
     */
    @GetMapping("/")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    /**
     * Endpoint to get a specific user by their ID.
     * @param id The ID of the user to retrieve.
     * @return The user with the specified ID.
     */
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    /**
     * Endpoint to create a new user.
     * @param user The user object containing the details of the new user.
     * @return The created user object.
     */
    @PostMapping("/")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    /**
     * Endpoint to update an existing user.
     * @param id The ID of the user to update.
     * @param user The updated user object.
     * @return The updated user object.
     */
    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        return userService.updateUser(id, user);
    }

    /**
     * Endpoint to delete a user by their ID.
     * @param id The ID of the user to delete.
     */
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }
}
