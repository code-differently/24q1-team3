package com.fooddifferently.fd.model;

import jakarta.persistence.*;
import java.util.Objects;

/**
 * Represents a dish in the system.
 */
@Entity
@Table(name = "dishes")
public class Dish {

    /**
     * The ID of the dish.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * The name of the dish.
     */
    @Column(name = "name", nullable = false)
    private String name;

    /**
     * The description of the dish.
     */
    @Column(name = "description", nullable = false)
    private String description;

    /**
     * The price of the dish.
     */
    @Column(name = "price", nullable = false)
    private double price;

    /**
     * The restaurant that serves the dish.
     */
    @ManyToOne
    @JoinColumn(name = "restaurant_id", nullable = false)
    private Restaurant restaurant;

    /**
     * Create a new dish.
     */
    public Dish() {
    }

    /**
     * Create a new dish with the given name, description, and price.
     *
     * @param name        The name of the dish.
     * @param description The description of the dish.
     * @param price       The price of the dish.
     */
    public Dish(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }


    /**
     * Get the ID of the dish.
     *
     * @return The ID of the dish.
     */
    public Long getId() {
        return id;
    }

    /**
     * Set the ID of the dish.
     *
     * @param id The ID of the dish.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Get the name of the dish.
     *
     * @return The name of the dish.
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of the dish.
     *
     * @param name The name of the dish.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the description of the dish.
     *
     * @return The description of the dish.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set the description of the dish.
     *
     * @param description The description of the dish.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Get the price of the dish.
     *
     * @return The price of the dish.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Set the price of the dish.
     *
     * @param price The price of the dish.
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Get the restaurant that serves the dish.
     *
     * @return The restaurant that serves the dish.
     */
    public Restaurant getRestaurant() {
        return restaurant;
    }

    /**
     * Set the restaurant that serves the dish.
     *
     * @param restaurant The restaurant that serves the dish.
     */
    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    /**
     * Compare this dish to another object for equality.
     *
     * @param o The object to compare to.
     * @return True if the objects are equal, false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dish dish = (Dish) o;
        return Double.compare(dish.price, price) == 0 &&
                Objects.equals(id, dish.id) &&
                Objects.equals(name, dish.name) &&
                Objects.equals(description, dish.description);
    }

    /**
     * Get the hash code of the dish.
     *
     * @return The hash code of the dish.
     */
    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, price);
    }

    /**
     * Get a string representation of the dish.
     *
     * @return A string representation of the dish.
     */
    @Override
    public String toString() {
        return "Dish{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
