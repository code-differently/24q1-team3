package com.fooddifferently.fd.model;

import jakarta.persistence.*;
import java.util.Date;

/**
 * Represents an order in the system.
 */
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "restaurant_id", nullable = false)
    private Restaurant restaurant;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "order_date", nullable = false)
    private Date orderDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at")
    private Date updatedAt;

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
     * Get the date and time when the order was placed.
     *
     * @return The date and time when the order was placed.
     */
    public Date getOrderDate() {
        return orderDate;
    }

    /**
     * Set the date and time when the order was placed.
     *
     * @param orderDate The date and time when the order was placed.
     */
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", user=" + user +
                ", restaurant=" + restaurant +
                ", orderDate=" + orderDate +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
