package com.fooddifferently.fooddifferently.service;

import com.fooddifferently.fooddifferently.dto.RestaurantDTO;
import com.fooddifferently.fooddifferently.model.Restaurant;
import com.fooddifferently.fooddifferently.repository.RestaurantRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Implementation of the RestaurantService interface.
 */
@Service
public class RestaurantServiceImpl implements RestaurantService {

    private final RestaurantRepository restaurantRepository;
    private final ModelMapper modelMapper;

    /**
     * Constructor for RestaurantServiceImpl.
     *
     * @param restaurantRepository The repository for managing restaurants.
     * @param modelMapper          The mapper for mapping between DTOs and entities.
     */
    @Autowired
    public RestaurantServiceImpl(RestaurantRepository restaurantRepository, ModelMapper modelMapper) {
        this.restaurantRepository = restaurantRepository;
        this.modelMapper = modelMapper;
    }

    /**
     * Create a new restaurant.
     *
     * @param restaurantDTO The DTO representing the restaurant to be created.
     * @return The DTO representing the created restaurant.
     */
    @Override
    public RestaurantDTO createRestaurant(RestaurantDTO restaurantDTO) {
        Restaurant restaurant = modelMapper.map(restaurantDTO, Restaurant.class);
        restaurant = restaurantRepository.save(restaurant);
        return modelMapper.map(restaurant, RestaurantDTO.class);
    }

    /**
     * Get a restaurant by its ID.
     *
     * @param id The ID of the restaurant to retrieve.
     * @return The DTO representing the retrieved restaurant.
     */
    @Override
    public RestaurantDTO getRestaurantById(Long id) {
        Optional<Restaurant> restaurantOptional = restaurantRepository.findById(id);
        return restaurantOptional.map(value -> modelMapper.map(value, RestaurantDTO.class)).orElse(null);
    }

    /**
     * Get all restaurants.
     *
     * @return A list of DTOs representing all restaurants.
     */
    @Override
    public List<RestaurantDTO> getAllRestaurants() {
        List<Restaurant> restaurants = restaurantRepository.findAll();
        return restaurants.stream()
                .map(restaurant -> modelMapper.map(restaurant, RestaurantDTO.class))
                .collect(Collectors.toList());
    }

    /**
     * Update a restaurant.
     *
     * @param id            The ID of the restaurant to update.
     * @param restaurantDTO The DTO representing the updated restaurant.
     * @return The DTO representing the updated restaurant.
     */
    @Override
    public RestaurantDTO updateRestaurant(Long id, RestaurantDTO restaurantDTO) {
        Optional<Restaurant> existingRestaurantOptional = restaurantRepository.findById(id);
        if (existingRestaurantOptional.isPresent()) {
            Restaurant existingRestaurant = existingRestaurantOptional.get();
            modelMapper.map(restaurantDTO, existingRestaurant);
            existingRestaurant.setId(id); // Ensure the correct ID is set
            existingRestaurant = restaurantRepository.save(existingRestaurant);
            return modelMapper.map(existingRestaurant, RestaurantDTO.class);
        } else {
            return null;
        }
    }

    /**
     * Delete a restaurant by its ID.
     *
     * @param id The ID of the restaurant to delete.
     */
    @Override
    public void deleteRestaurant(Long id) {
        restaurantRepository.deleteById(id);
    }
}
