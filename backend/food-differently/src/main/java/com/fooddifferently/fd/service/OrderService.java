package com.fooddifferently.fd.service;

import com.fooddifferently.fd.exception.OrderNotFoundException;
import com.fooddifferently.fd.model.Order;
import com.fooddifferently.fd.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    /**
     * Retrieves an order by its ID.
     *
     * @param orderId The ID of the order to retrieve.
     * @return The order with the specified ID.
     * @throws OrderNotFoundException if the order with the specified ID is not found.
     */
    public Order getOrderById(Long orderId) {
        return orderRepository.findById(orderId)
                .orElseThrow(() -> new OrderNotFoundException("Order with ID " + orderId + " not found"));
    }


    /**
     * Deletes an order by its ID.
     *
     * @param orderId The ID of the order to delete.
     * @throws OrderNotFoundException if the order with the specified ID is not found.
     */
    public void deleteOrder(Long orderId) {
        Order order = orderRepository.findById(orderId)
                .orElseThrow(() -> new OrderNotFoundException("Order with ID " + orderId + " not found"));

        orderRepository.delete(order);
    }

    /**
     * Updates an existing order.
     *
     * @param orderId      The ID of the order to update.
     * @param updatedOrder The updated order object.
     * @return The updated order.
     * @throws OrderNotFoundException if the order with the specified ID is not found.
     */
    public Order updateOrder(Long orderId, Order updatedOrder) {
        Order existingOrder = orderRepository.findById(orderId)
                .orElseThrow(() -> new OrderNotFoundException("Order with ID " + orderId + " not found"));


        if (updatedOrder.getRestaurant() != null) {
            existingOrder.setRestaurant(updatedOrder.getRestaurant());
        }
        if (updatedOrder.getUser() != null) {
            existingOrder.setUser(updatedOrder.getUser());
        }
        if (updatedOrder.getOrderDate() != null) {
            existingOrder.setOrderDate(updatedOrder.getOrderDate());
        }



        /**
         * Update the order timestamp.

         */
        existingOrder.setUpdatedAt(new Date());

        /**
         * Save the updated order.
         */
        return orderRepository.save(existingOrder);
    }

    /**
     * Retrieves all orders.
     *
     * @return A list of all orders.
     */
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
}
