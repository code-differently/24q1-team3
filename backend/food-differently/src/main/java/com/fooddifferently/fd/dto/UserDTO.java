package com.fooddifferently.fd.dto;

/**
 * Data Transfer Object (DTO) representing a user.
 */
public class UserDTO {

    /**
     * The unique identifier of the user.
     */
    private Long userId;

    /**
     * The username of the user.
     */
    private String username;

    /**
     * The email address of the user.
     */
    private String email;

    /**
     * The first name of the user.
     */
    private String firstName;

    /**
     * The last name of the user.
     */
    private String lastName;

    /**
     * The phone number of the user.
     */
    private String phoneNumber;

    /**
     * The address of the user.
     */
    private AddressDTO address;

    // Other properties as needed

    /**
     * Default constructor.
     */
    public UserDTO() {
    }

    /**
     * Constructs a UserDTO object with the specified parameters.
     *
     * @param userId     the unique identifier of the user
     * @param username   the username of the user
     * @param email      the email address of the user
     * @param firstName  the first name of the user
     * @param lastName   the last name of the user
     * @param phoneNumber the phone number of the user
     * @param address    the address of the user
     */
    public UserDTO(Long userId, String username, String email, String firstName, String lastName,
                   String phoneNumber, AddressDTO address) {
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    /**
     * Returns the unique identifier of the user.
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * Sets the unique identifier of the user.
     *
     * @param userId the unique identifier of the user
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * Returns the username of the user.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the username of the user.
     *
     * @param username the username of the user
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Returns the email address of the user.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email address of the user.
     *
     * @param email the email address of the user
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Returns the first name of the user.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name of the user.
     *
     * @param firstName the first name of the user
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Returns the last name of the user.
     */
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Returns the phone number of the user.
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the phone number of the user.
     *
     * @param phoneNumber the phone number of the user
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Returns the address of the user.
     */
    public AddressDTO getAddress() {
        return address;
    }

    /**
     * Sets the address of the user.
     *
     * @param address the address of the user
     */
    public void setAddress(AddressDTO address) {
        this.address = address;
    }
}
