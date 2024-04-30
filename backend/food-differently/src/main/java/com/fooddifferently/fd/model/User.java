package com.fooddifferently.fd.model;

import jakarta.persistence.*;

/**
 * User entity class
 */
@Entity
@Table(name = "users")
public class User {

    /**
     *
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;

    /**
     *  The username of the user
     */
    @Column(nullable = false, unique = true)
    private String username;

    /**
     * The password of the user
     */
    @Column(nullable = false)
    private String password;

    /**
     * The email of the user
     */
    @Column(nullable = false, unique = true)
    private String email;

    /**
     * The first name of the user
     */
    @Column(name = "first_name", nullable = false)
    private String firstName;

    /**
     * The last name of the user
     */
    @Column(name = "last_name", nullable = false)
    private String lastName;

    /**
     * The address of the user
     */
    @Column(nullable = false)
    private String address;

    /**
     * The phone number of the user
     */
    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;


    /**
     * Default constructor
     */
    public User() {
    }

    /**
     *
     * @param username
     * @param password
     * @param email
     * @param firstName
     * @param lastName
     * @param address
     * @param phoneNumber
     */
    public User(String username, String password, String email, String firstName, String lastName, String address, String phoneNumber) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    /**
     * Getter for userId
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * Setter for userId
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * Getter for username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Setter for username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Getter for password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Setter for password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Getter for email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Setter for email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Getter for firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Setter for firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Getter for lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Setter for lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Getter for address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Setter for address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Getter for phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Setter for phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
