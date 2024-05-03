package com.fooddifferently.fd.service;

import com.fooddifferently.fd.model.Restaurant;
import com.fooddifferently.fd.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class RestaurantService {

    private final RestaurantRepository restaurantRepository;
    private final YelpApiService yelpApiService;

    @Autowired
    public RestaurantService(RestaurantRepository restaurantRepository, YelpApiService yelpApiService) {
        this.restaurantRepository = restaurantRepository;
        this.yelpApiService = yelpApiService;
    }

    public Restaurant getRestaurantById(Long id) {
        return restaurantRepository.findById(id).orElse(null);
    }

    public Restaurant createRestaurant(Restaurant restaurant) {
        return restaurantRepository.save(restaurant);
    }

    public Restaurant updateRestaurant(Long id, Restaurant restaurant) {
        if (restaurantRepository.existsById(id)) {
            restaurant.setId(id);
            return restaurantRepository.save(restaurant);
        }
        return null;
    }

    public void deleteRestaurant(Long id) {
        restaurantRepository.deleteById(id);
    }

    public List<Restaurant> getAllRestaurants() {
        return restaurantRepository.findAll();
    }

    public List<Restaurant> searchRestaurants(String term, String location) {
        List<Restaurant> restaurantResults = new ArrayList<>();
        List<Map<String, Object>> businesses = yelpApiService.searchBusinesses(term, location);

        for (Map<String, Object> business : businesses) {
            Restaurant restaurant = mapYelpBusinessToRestaurant(business);
            if (restaurant != null) {
                restaurantResults.add(restaurant);
            }
        }

        return restaurantResults;
    }


    private Restaurant mapYelpBusinessToRestaurant(Map<String, Object> business) {
        Restaurant restaurant = new Restaurant();
        restaurant.setName((String) business.get("name"));

        Map<String, Object> location = (Map<String, Object>) business.get("location");
        if (location != null) {
            StringBuilder addressBuilder = new StringBuilder();
            if (location.containsKey("address1")) {
                addressBuilder.append(location.get("address1")).append(", ");
            }
            if (location.containsKey("city")) {
                addressBuilder.append(location.get("city")).append(", ");
            }
            if (location.containsKey("state")) {
                addressBuilder.append(location.get("state")).append(" ");
            }
            if (location.containsKey("zip_code")) {
                addressBuilder.append(location.get("zip_code"));
            }
            restaurant.setAddress(addressBuilder.toString());
        }

        return restaurant;
    }
}