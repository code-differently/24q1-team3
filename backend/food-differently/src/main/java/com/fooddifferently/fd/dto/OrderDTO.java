package com.fooddifferently.fd.dto;

import com.fooddifferently.fd.model.Restaurant;
import com.fooddifferently.fd.model.User;

import java.util.Date;

/**
 * Data Transfer Object (DTO) for representing an order.
 */
public class OrderDTO {

    private Long id;
    private User user;
    private Restaurant restaurant;
    private Date orderDate;
    private Date updatedAt;

    /**
     * Default constructor.
     */
    public OrderDTO() {
    }

    /**
     * Constructor for creating an order DTO.
     *
     * @param id The ID of the order.
     * @param user The user who placed the order.
     * @param restaurant The restaurant where the order was placed.
     * @param orderDate The date the order was placed.
     * @param updatedAt The date the order was last updated.
     */
    public OrderDTO(Long id, User user, Restaurant restaurant, Date orderDate, Date updatedAt) {
        this.id = id;
        this.user = user;
        this.restaurant = restaurant;
        this.orderDate = orderDate;
        this.updatedAt = updatedAt;
    }

    /**
     * Get the ID of the order.
     *
     * @return The ID of the order.
     */
    public Long getId() {
        return id;
    }

    /**
     * Set the ID of the order.
     *
     * @param id The ID of the order.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Get the user who placed the order.
     *
     * @return The user who placed the order.
     */
    public User getUser() {
        return user;
    }

    /**
     * Set the user who placed the order.
     *
     * @param user The user who placed the order.
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * Get the restaurant where the order was placed.
     *
     * @return The restaurant where the order was placed.
     */
    public Restaurant getRestaurant() {
        return restaurant;
    }

    /**
     * Set the restaurant where the order was placed.
     *
     * @param restaurant The restaurant where the order was placed.
     */
    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    /**
     * Get the date the order was placed.
     *
     * @return The date the order was placed.
     */
    public Date getOrderDate() {
        return orderDate;
    }

    /**
     * Set the date the order was placed.
     *
     * @param orderDate The date the order was placed.
     */
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    /**
     * Get the date the order was last updated.
     *
     * @return The date the order was last updated.
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Set the date the order was last updated.
     *
     * @param updatedAt The date the order was last updated.
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
