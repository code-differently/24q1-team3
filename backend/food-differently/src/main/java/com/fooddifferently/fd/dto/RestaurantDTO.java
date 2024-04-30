package com.fooddifferently.fooddifferently.dto;

import java.util.List;

/**
 * Data Transfer Object (DTO) for representing restaurant information.
 */
public class RestaurantDTO {

    private Long id;
    private String name;
    private String address;
    private String typeOfFood;
    private List<MenuItemDTO> menuItems;

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
    public List<MenuItemDTO> getMenuItems() {
        return menuItems;
    }

    /**
     * Sets the list of menu items offered by the restaurant.
     *
     * @param menuItems The list of menu items to set.
     */
    public void setMenuItems(List<MenuItemDTO> menuItems) {
        this.menuItems = menuItems;
    }
}
