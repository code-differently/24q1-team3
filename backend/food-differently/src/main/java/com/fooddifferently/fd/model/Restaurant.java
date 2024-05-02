package com.fooddifferently.fd.model;

import jakarta.persistence.*;
import java.util.List;

/**
 * Entity class representing a restaurant.
 */
@Entity
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String address;

    @Column
    private String typeOfFood;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Dish> dishes;

    /**
     * Default constructor for Restaurant.
     */
    public Restaurant() {
    }

    /**
     * Constructor with parameters for Restaurant.
     *
     * @param name       The name of the restaurant.
     * @param address    The address of the restaurant.
     * @param typeOfFood The type of food served at the restaurant.
     * @param dishes     The list of dishes offered at the restaurant.
     */
    public Restaurant(String name, String address, String typeOfFood, List<Dish> dishes) {
        this.name = name;
        this.address = address;
        this.typeOfFood = typeOfFood;
        this.dishes = dishes;
    }

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
     * @param id The ID of the restaurant to set.
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
     * @param name The name of the restaurant to set.
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
     * @param address The address of the restaurant to set.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Get the type of food served at the restaurant.
     *
     * @return The type of food.
     */
    public String getTypeOfFood() {
        return typeOfFood;
    }

    /**
     * Set the type of food served at the restaurant.
     *
     * @param typeOfFood The type of food to set.
     */
    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = typeOfFood;
    }

    /**
     * Get the list of dishes offered at the restaurant.
     *
     * @return The list of dishes.
     */
    public List<Dish> getDishes() {
        return dishes;
    }

    /**
     * Set the list of dishes offered at the restaurant.
     *
     * @param dishes The list of dishes to set.
     */
    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }

    /**
     * Override of the toString method to provide a string representation of the Restaurant object.
     *
     * @return A string representation of the Restaurant object.
     */
    @Override
    public String toString() {
        return "Restaurant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", typeOfFood='" + typeOfFood + '\'' +
                ", dishes=" + dishes +
                '}';
    }
}
