package com.fooddifferently.fooddifferently.dto;


import com.fooddifferently.fd.dto.OrderDTO;
import com.fooddifferently.fd.model.Restaurant;
import com.fooddifferently.fd.model.User;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class OrderDTOTest {

    @Test
    public void testOrderDTOConstructor() {
        Long orderId = 1L;
        User user = new User();
        Restaurant restaurant = new Restaurant();
        Date orderDate = new Date();
        Date updatedAt = new Date();

        OrderDTO orderDTO = new OrderDTO(orderId, user, restaurant, orderDate, updatedAt);

        assertNotNull(orderDTO);
        assertEquals(orderId, orderDTO.getId());
        assertEquals(user, orderDTO.getUser());
        assertEquals(restaurant, orderDTO.getRestaurant());
        assertEquals(orderDate, orderDTO.getOrderDate());
        assertEquals(updatedAt, orderDTO.getUpdatedAt());
    }

    @Test
    public void testSetAndGetId() {
        Long orderId = 1L;
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setId(orderId);

        assertEquals(orderId, orderDTO.getId());
    }

    @Test
    public void testSetAndGetUser() {
        User user = new User();
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setUser(user);

        assertEquals(user, orderDTO.getUser());
    }

    @Test
    public void testSetAndGetRestaurant() {
        Restaurant restaurant = new Restaurant();
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setRestaurant(restaurant);

        assertEquals(restaurant, orderDTO.getRestaurant());
    }

    @Test
    public void testSetAndGetOrderDate() {
        Date orderDate = new Date();
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setOrderDate(orderDate);

        assertEquals(orderDate, orderDTO.getOrderDate());
    }

    @Test
    public void testSetAndGetUpdatedAt() {
        Date updatedAt = new Date();
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setUpdatedAt(updatedAt);

        assertEquals(updatedAt, orderDTO.getUpdatedAt());
    }
}
