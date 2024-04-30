package com.fooddifferently.fd.controller;

import com.fooddifferently.fd.model.Restaurant;
import com.fooddifferently.fd.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.fooddifferently.fd.dto.RestaurantDTO;
import com.fooddifferently.fd.service.RestaurantService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

/**
 * Controller class for handling restaurant-related operations.
 */
@RestController
@RequestMapping("/restaurants")
 * Controller class for managing Restaurant endpoints.
 */
@Path("/restaurants")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RestaurantController {

    private final RestaurantService restaurantService;

    @Autowired
    /**
     * Constructor for RestaurantController.
     *
     * @param restaurantService The RestaurantService to inject.
     */
    @Inject
    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    /**
     * Retrieves a restaurant by its ID.
     *
     * @param id The ID of the restaurant to retrieve.
     * @return The restaurant with the specified ID.
     */
    @GetMapping("/{id}")
    public Restaurant getRestaurantById(@PathVariable Long id) {
        return restaurantService.getRestaurantById(id);
    }

    /**
     * Creates a new restaurant.
     *
     * @param restaurant The restaurant object containing restaurant details.
     * @return The newly created restaurant.
     */
    @PostMapping("/create")
    public Restaurant createRestaurant(@RequestBody Restaurant restaurant) {
        return restaurantService.createRestaurant(restaurant);
    }

    /**
     * Updates an existing restaurant.
     *
     * @param id          The ID of the restaurant to update.
     * @param restaurant  The updated restaurant object.
     * @return The updated restaurant.
     */
    @PutMapping("/{id}")
    public Restaurant updateRestaurant(@PathVariable Long id, @RequestBody Restaurant restaurant) {
        return restaurantService.updateRestaurant(id, restaurant);
    }

    /**
     * Deletes a restaurant by its ID.
     *
     * @param id The ID of the restaurant to delete.
     */
    @DeleteMapping("/{id}")
    public void deleteRestaurant(@PathVariable Long id) {
        restaurantService.deleteRestaurant(id);
    }

    /**
     * Retrieves all restaurants.
     *
     * @return A list of all restaurants.
     */
    @GetMapping("/all")
    public List<Restaurant> getAllRestaurants() {
        return restaurantService.getAllRestaurants();
     * GET method to retrieve all restaurants.
     *
     * @return List of RestaurantDTO objects.
     */
    @GET
    public List<RestaurantDTO> getAllRestaurants() {
        return restaurantService.getAllRestaurants();
    }

    /**
     * GET method to retrieve a restaurant by ID.
     *
     * @param id The ID of the restaurant.
     * @return RestaurantDTO object.
     */
    @GET
    @Path("/{id}")
    public RestaurantDTO getRestaurantById(@PathParam("id") Long id) {
        return restaurantService.getRestaurantById(id);
    }

    /**
     * POST method to create a new restaurant.
     *
     * @param restaurantDTO The RestaurantDTO object representing the new restaurant.
     * @return Created RestaurantDTO object.
     */
    @POST
    public RestaurantDTO createRestaurant(RestaurantDTO restaurantDTO) {
        return restaurantService.createRestaurant(restaurantDTO);
    }

    /**
     * PUT method to update an existing restaurant.
     *
     * @param id            The ID of the restaurant to update.
     * @param restaurantDTO The updated RestaurantDTO object.
     * @return Updated RestaurantDTO object.
     */
    @PUT
    @Path("/{id}")
    public RestaurantDTO updateRestaurant(@PathParam("id") Long id, RestaurantDTO restaurantDTO) {
        return restaurantService.updateRestaurant(id, restaurantDTO);
    }

    /**
     * DELETE method to delete a restaurant by ID.
     *
     * @param id The ID of the restaurant to delete.
     */
    @DELETE
    @Path("/{id}")
    public void deleteRestaurant(@PathParam("id") Long id) {
        restaurantService.deleteRestaurant(id);
    }
}
