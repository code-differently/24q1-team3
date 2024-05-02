package com.fooddifferently.fd.dto;

import java.util.List;

/**
 * Data Transfer Object (DTO) representing a restaurant.
 */
public class RestaurantDTO {

    private Long id;
    private String name;
    private String address;
    private String typeOfFood;
    private List<DishDTO> dishes;

    /**
     * Default constructor for RestaurantDTO.
     */
    public RestaurantDTO() {
    }

    /**
     * Constructor with parameters for RestaurantDTO.
     *
     * @param id         The ID of the restaurant.
     * @param name       The name of the restaurant.
     * @param address    The address of the restaurant.
     * @param typeOfFood The type of food served at the restaurant.
     * @param dishes     The list of dishes offered at the restaurant.
     */
    public RestaurantDTO(Long id, String name, String address, String typeOfFood, List<DishDTO> dishes) {
        this.id = id;
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
    public List<DishDTO> getDishes() {
        return dishes;
    }

    /**
     * Set the list of dishes offered at the restaurant.
     *
     * @param dishes The list of dishes to set.
     */
    public void setDishes(List<DishDTO> dishes) {
        this.dishes = dishes;
    }

    /**
     * Override of the toString method to provide a string representation of the RestaurantDTO object.
     *
     * @return A string representation of the RestaurantDTO object.
     */
    @Override
    public String toString() {
        return "RestaurantDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", typeOfFood='" + typeOfFood + '\'' +
                ", dishes=" + dishes +
                '}';
    }
}
