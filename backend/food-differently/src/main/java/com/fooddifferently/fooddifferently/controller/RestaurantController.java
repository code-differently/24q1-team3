package com.fooddifferently.fooddifferently.controller;

import com.fooddifferently.fooddifferently.dto.RestaurantDTO;
import com.fooddifferently.fooddifferently.service.RestaurantService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

/**
 * Controller class for managing Restaurant endpoints.
 */
@Path("/restaurants")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RestaurantController {

    private final RestaurantService restaurantService;

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
