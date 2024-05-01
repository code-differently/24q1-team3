package com.fooddifferently.fd.model;

import jakarta.persistence.*;

/**
 * Represents a user in the system.
 */
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private int age;

    public User() {
    }

    public User(String username, String password, String email, String firstName, String lastName, int age) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    /**
     * Get the ID of the user.
     *
     * @return The ID of the user.
     */
    public Long getId() {
        return id;
    }

    /**
     * Set the ID of the user.
     *
     * @param id The ID of the user.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Get the username of the user.
     *
     * @return The username of the user.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Set the username of the user.
     *
     * @param username The username of the user.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Get the password of the user.
     *
     * @return The password of the user.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Set the password of the user.
     *
     * @param password The password of the user.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Get the email address of the user.
     *
     * @return The email address of the user.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set the email address of the user.
     *
     * @param email The email address of the user.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Get the first name of the user.
     *
     * @return The first name of the user.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Set the first name of the user.
     *
     * @param firstName The first name of the user.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Get the last name of the user.
     *
     * @return The last name of the user.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Set the last name of the user.
     *
     * @param lastName The last name of the user.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Get the age of the user.
     *
     * @return The age of the user.
     */
    public int getAge() {
        return age;
    }

    /**
     * Set the age of the user.
     *
     * @param age The age of the user.
     */
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
