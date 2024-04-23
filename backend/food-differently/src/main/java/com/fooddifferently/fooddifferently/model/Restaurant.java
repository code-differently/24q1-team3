package com.fooddifferently.fooddifferently.model;

import jakarta.persistence.*;
import java.util.List;

/**
 * Represents a restaurant entity.
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

    @Column(name = "type_of_food", nullable = false)
    private String typeOfFood;

    @OneToMany(mappedBy = "restaurant", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<MenuItem> menuItems;

    /**
     * Retrieves the ID of the restaurant.
     *
     * @return The ID of the restaurant.
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the ID of the restaurant.
     *
     * @param id The ID to set.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Retrieves the name of the restaurant.
     *
     * @return The name of the restaurant.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the restaurant.
     *
     * @param name The name to set.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves the address of the restaurant.
     *
     * @return The address of the restaurant.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the address of the restaurant.
     *
     * @param address The address to set.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Retrieves the type of food served by the restaurant.
     *
     * @return The type of food served by the restaurant.
     */
    public String getTypeOfFood() {
        return typeOfFood;
    }

    /**
     * Sets the type of food served by the restaurant.
     *
     * @param typeOfFood The type of food to set.
     */
    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = typeOfFood;
    }

    /**
     * Retrieves the list of menu items offered by the restaurant.
     *
     * @return The list of menu items offered by the restaurant.
     */
    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    /**
     * Sets the list of menu items offered by the restaurant.
     *
     * @param menuItems The list of menu items to set.
     */
    public void setMenuItems(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }
}
