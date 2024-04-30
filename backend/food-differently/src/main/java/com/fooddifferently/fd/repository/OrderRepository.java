package com.fooddifferently.fd.repository;

import com.fooddifferently.fd.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    /**
     * Retrieves an order by its ID.
     *
     * @param id The ID of the order to retrieve.
     * @return The order with the specified ID, or null if not found.
     */
    Optional<Order> findById(Long id);

    /**
     * Retrieves all orders associated with a specific user.
     *
     * @param userId The ID of the user.
     * @return A list of orders for the specified user.
     */
    List<Order> findByUserId(Long userId);

    /**
     * Retrieves all orders associated with a specific restaurant.
     *
     * @param restaurantId The ID of the restaurant.
     * @return A list of orders for the specified restaurant.
     */
    List<Order> findByRestaurantId(Long restaurantId);

    /**
     * Retrieves all orders associated with a specific user and restaurant.
     *
     * @param userId The ID of the user.
     * @param restaurantId The ID of the restaurant.
     * @return A list of orders for the specified user and restaurant.
     */
    List<Order> findByUserIdAndRestaurantId(Long userId, Long restaurantId);

}
