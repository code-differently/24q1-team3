package com.fooddifferently.fd.repository;

import com.fooddifferently.fd.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Repository interface for managing Restaurant entities.
 */
@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

    /**
     * Find a restaurant by its ID.
     *
     * @param id The ID of the restaurant to find.
     * @return The restaurant with the specified ID, or null if not found.
     */
    Optional<Restaurant> findById(Long id);

    /**
     * Find all restaurants by name containing the specified term (case-insensitive) and address containing the specified location (case-insensitive).
     *
     * @param name     The term to search for in the restaurant name.
     * @param address  The location to search for in the restaurant address.
     * @return A list of restaurants matching the search criteria.
     */
    List<Restaurant> findAllByNameContainingIgnoreCaseAndAddressContainingIgnoreCase(String name, String address);
}
