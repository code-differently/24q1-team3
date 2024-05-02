package com.fooddifferently.fd.dto;

/**
 * Represents a dish DTO (Data Transfer Object) used for transferring dish data.
 */
public class DishDTO {

    private Long id;
    private String name;
    private String description;
    private double price;
    private Long restaurantId;

    /**
     * Default constructor.
     */
    public DishDTO() {
    }

    /**
     * Constructor for creating a dish DTO.
     *
     * @param id The ID of the dish.
     * @param name The name of the dish.
     * @param description The description of the dish.
     * @param price The price of the dish.
     * @param restaurantId The ID of the restaurant that serves the dish.
     */
    public DishDTO(Long id, String name, String description, double price, Long restaurantId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.restaurantId = restaurantId;
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
     * Get the ID of the restaurant that serves the dish.
     *
     * @return The ID of the restaurant that serves the dish.
     */
    public Long getRestaurantId() {
        return restaurantId;
    }

    /**
     * Set the ID of the restaurant that serves the dish.
     *
     * @param restaurantId The ID of the restaurant that serves the dish.
     */
    public void setRestaurantId(Long restaurantId) {
        this.restaurantId = restaurantId;
    }
}
