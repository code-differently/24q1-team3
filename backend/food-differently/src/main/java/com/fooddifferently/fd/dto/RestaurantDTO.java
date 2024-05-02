package com.fooddifferently.fd.dto;

import java.util.List;

/**
 * Data Transfer Object (DTO) for transferring restaurant data.
 */
public class RestaurantDTO {

    private Long id;
    private String name;
    private String address;
    private List<DishDTO> dishes;

    public RestaurantDTO() {
    }

    public RestaurantDTO(Long id, String name, String address, List<DishDTO> dishes) {
        this.id = id;
        this.name = name;
        this.address = address;
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
     * Get the list of dishes in the restaurant.
     *
     * @return The list of dishes.
     */
    public List<DishDTO> getDishes() {
        return dishes;
    }

    /**
     * Set the list of dishes in the restaurant.
     *
     * @param dishes The list of dishes.
     */
    public void setDishes(List<DishDTO> dishes) {
        this.dishes = dishes;
    }
}
