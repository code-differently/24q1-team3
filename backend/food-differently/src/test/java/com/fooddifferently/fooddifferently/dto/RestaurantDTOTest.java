package com.fooddifferently.fooddifferently.dto;

import com.fooddifferently.fd.dto.DishDTO;
import com.fooddifferently.fd.dto.RestaurantDTO;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class RestaurantDTOTest {

    @Test
    public void testSetAndGetId() {
        Long restaurantId = 1L;
        RestaurantDTO restaurantDTO = new RestaurantDTO();
        restaurantDTO.setId(restaurantId);

        assertEquals(restaurantId, restaurantDTO.getId());
    }

    @Test
    public void testSetAndGetName() {
        String name = "Sample Restaurant";
        RestaurantDTO restaurantDTO = new RestaurantDTO();
        restaurantDTO.setName(name);

        assertEquals(name, restaurantDTO.getName());
    }

    @Test
    public void testSetAndGetAddress() {
        String address = "123 Main St";
        RestaurantDTO restaurantDTO = new RestaurantDTO();
        restaurantDTO.setAddress(address);

        assertEquals(address, restaurantDTO.getAddress());
    }

    @Test
    public void testSetAndGetDishes() {
        List<DishDTO> dishes = new ArrayList<>();
        DishDTO dish1 = new DishDTO(1L, "Pizza", "Cheese Pizza", 10.99, 1L);
        DishDTO dish2 = new DishDTO(2L, "Burger", "Beef Burger", 8.99, 1L);
        dishes.add(dish1);
        dishes.add(dish2);

        RestaurantDTO restaurantDTO = new RestaurantDTO();
        restaurantDTO.setDishes(dishes);

        assertNotNull(restaurantDTO.getDishes());
        assertEquals(2, restaurantDTO.getDishes().size());
        assertEquals("Pizza", restaurantDTO.getDishes().get(0).getName());
        assertEquals("Burger", restaurantDTO.getDishes().get(1).getName());
    }
}
