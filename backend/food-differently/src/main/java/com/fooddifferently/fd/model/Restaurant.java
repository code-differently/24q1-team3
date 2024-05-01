package com.fooddifferently.fd.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a restaurant in the system.
 */
@Entity
@Table(name = "restaurants")
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String address;

    @OneToMany(mappedBy = "restaurant", cascade = CascadeType.ALL)
    private List<Dish> dishes = new ArrayList<>();

    // Other properties and methods

    /**
     * Get the ID of the restaurant.
     *
     * @return The ID of the restaurant.
     */
    public Long getId() {
        return id;
    }

    /**
     * Set the ID of the restaurant.
     *
     * @param id The ID of the restaurant.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Get the name of the restaurant.
     *
     * @return The name of the restaurant.
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of the restaurant.
     *
     * @param name The name of the restaurant.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the address of the restaurant.
     *
     * @return The address of the restaurant.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Set the address of the restaurant.
     *
     * @param address The address of the restaurant.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Get the menu of the restaurant.
     *
     * @return The menu of the restaurant.
     */
    public List<Dish> getMenu() {
        return dishes;
    }

    /**
     * Set the menu of the restaurant.
     *
     * @param menu The menu of the restaurant.
     */
    public void setMenu(List<Dish> menu) {
        this.dishes = dishes;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", dishes=" + dishes +
                '}';
    }
}
