package com.fooddifferently.fd.service;

import com.fooddifferently.fd.dto.RestaurantDTO;

import java.util.List;

public interface RestaurantService {

    /**
     * Create a new restaurant.
     *
     * @param restaurantDTO The DTO representing the restaurant to be created.
     * @return The DTO representing the created restaurant.
     */
    RestaurantDTO createRestaurant(RestaurantDTO restaurantDTO);

    /**
     * Get a restaurant by its ID.
     *
     * @param id The ID of the restaurant to retrieve.
     * @return The DTO representing the retrieved restaurant.
     */
    RestaurantDTO getRestaurantById(Long id);

    /**
     * Get all restaurants.
     *
     * @return A list of DTOs representing all restaurants.
     */
    List<RestaurantDTO> getAllRestaurants();

    /**
     * Update a restaurant.
     *
     * @param id            The ID of the restaurant to update.
     * @param restaurantDTO The DTO representing the updated restaurant.
     * @return The DTO representing the updated restaurant.
     */
    RestaurantDTO updateRestaurant(Long id, RestaurantDTO restaurantDTO);

    /**
     * Delete a restaurant by its ID.
     *
     * @param id The ID of the restaurant to delete.
     */
    void deleteRestaurant(Long id);
}
