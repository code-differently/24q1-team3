package com.fooddifferently.fooddifferently.dto;

import com.fooddifferently.fd.dto.DishDTO;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class DishDTOTest {

    @Test
    public void testConstructorAndGetters() {
        Long id = 1L;
        String name = "Spaghetti Carbonara";
        String description = "Creamy pasta with bacon and cheese";
        double price = 12.99;
        Long restaurantId = 10L;

        DishDTO dishDTO = new DishDTO(id, name, description, price, restaurantId);

        assertEquals(id, dishDTO.getId());
        assertEquals(name, dishDTO.getName());
        assertEquals(description, dishDTO.getDescription());
        assertEquals(price, dishDTO.getPrice());
        assertEquals(restaurantId, dishDTO.getRestaurantId());
    }

    @Test
    public void testSetters() {
        DishDTO dishDTO = new DishDTO();

        dishDTO.setId(1L);
        dishDTO.setName("Pizza Margherita");
        dishDTO.setDescription("Classic Italian pizza with tomato sauce and mozzarella");
        dishDTO.setPrice(10.99);
        dishDTO.setRestaurantId(5L);

        assertEquals(1L, dishDTO.getId());
        assertEquals("Pizza Margherita", dishDTO.getName());
        assertEquals("Classic Italian pizza with tomato sauce and mozzarella", dishDTO.getDescription());
        assertEquals(10.99, dishDTO.getPrice());
        assertEquals(5L, dishDTO.getRestaurantId());
    }

    @Test
    public void testDefaultConstructor() {
        DishDTO dishDTO = new DishDTO();

        assertNull(dishDTO.getId());
        assertNull(dishDTO.getName());
        assertNull(dishDTO.getDescription());
        assertEquals(0.0, dishDTO.getPrice());
        assertNull(dishDTO.getRestaurantId());
    }

    @Test
    public void testToString() {
        Long id = 1L;
        String name = "Burger";
        String description = "Juicy beef burger with cheddar cheese";
        double price = 8.99;
        Long restaurantId = 2L;

        DishDTO dishDTO = new DishDTO(id, name, description, price, restaurantId);

        String expectedToString = "DishDTO{id=1, name='Burger', description='Juicy beef burger with cheddar cheese', price=8.99, restaurantId=2}";
        assertEquals(expectedToString, dishDTO.toString());
    }

    @Test
    public void testSetNullValues() {
        DishDTO dishDTO = new DishDTO();

        dishDTO.setId(null);
        dishDTO.setName(null);
        dishDTO.setDescription(null);
        dishDTO.setPrice(0.0);
        dishDTO.setRestaurantId(null);

        assertNull(dishDTO.getId());
        assertNull(dishDTO.getName());
        assertNull(dishDTO.getDescription());
        assertEquals(0.0, dishDTO.getPrice());
        assertNull(dishDTO.getRestaurantId());
    }
}
