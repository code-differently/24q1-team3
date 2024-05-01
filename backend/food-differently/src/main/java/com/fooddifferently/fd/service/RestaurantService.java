package com.fooddifferently.fd.service;

import com.fooddifferently.fd.model.Restaurant;
import com.fooddifferently.fd.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Service class for handling restaurant-related operations.
 */
@Service
public class RestaurantService {

    private final RestaurantRepository restaurantRepository;

    /**
     * Constructor-based dependency injection.
     *
     * @param restaurantRepository The repository for restaurant entities.
     */
    @Autowired
    public RestaurantService(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    /**
     * Retrieves a restaurant by its ID.
     *
     * @param id The ID of the restaurant to retrieve.
     * @return The restaurant with the specified ID.
     */
    public Restaurant getRestaurantById(Long id) {
        Optional<Restaurant> optionalRestaurant = restaurantRepository.findById(id);
        return optionalRestaurant.orElse(null);
    }

    /**
     * Creates a new restaurant.
     *
     * @param restaurant The restaurant object containing restaurant details.
     * @return The newly created restaurant.
     */
    public Restaurant createRestaurant(Restaurant restaurant) {

        return restaurantRepository.save(restaurant);
    }

    /**
     * Updates an existing restaurant.
     *
     * @param id         The ID of the restaurant to update.
     * @param restaurant The updated restaurant object.
     * @return The updated restaurant.
     */
    public Restaurant updateRestaurant(Long id, Restaurant restaurant) {
        Optional<Restaurant> optionalExistingRestaurant = restaurantRepository.findById(id);
        if (optionalExistingRestaurant.isPresent()) {
            restaurant.setId(id);
            return restaurantRepository.save(restaurant);
        }
        return null;
    }

    /**
     * Deletes a restaurant by its ID.
     *
     * @param id The ID of the restaurant to delete.
     */
    public void deleteRestaurant(Long id) {
        restaurantRepository.deleteById(id);
    }

    /**
     * Retrieves all restaurants.
     *
     * @return A list of all restaurants.
     */
    public List<Restaurant> getAllRestaurants() {
        return restaurantRepository.findAll();
    }
}