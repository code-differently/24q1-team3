package com.fooddifferently.fooddifferently.model;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.fooddifferently.fooddifferently.dto.MenuItemDTO;
import com.fooddifferently.fooddifferently.dto.RestaurantDTO;

public class RestaurantDTOTest {

    @Test
    public void testSetAndGetId() {
        RestaurantDTO restaurant = new RestaurantDTO();
        Long id = 1L;
        restaurant.setId(id);
        assertEquals(id, restaurant.getId());
    }

    @Test
    public void testSetAndGetName() {
        RestaurantDTO restaurant = new RestaurantDTO();
        String name = "Sample Restaurant";
        restaurant.setName(name);
        assertEquals(name, restaurant.getName());
    }

    @Test
    public void testSetAndGetAddress() {
        RestaurantDTO restaurant = new RestaurantDTO();
        String address = "123 Main St, City, Country";
        restaurant.setAddress(address);
        assertEquals(address, restaurant.getAddress());
    }

    @Test
    public void testSetAndGetTypeOfFood() {
        RestaurantDTO restaurant = new RestaurantDTO();
        String typeOfFood = "Italian";
        restaurant.setTypeOfFood(typeOfFood);
        assertEquals(typeOfFood, restaurant.getTypeOfFood());
    }

    @Test
    public void testSetAndGetMenuItems() {
        RestaurantDTO restaurant = new RestaurantDTO();
        // Assuming MenuItemDTO is tested separately and available for use
        MenuItemDTO menuItem1 = new MenuItemDTO();
        MenuItemDTO menuItem2 = new MenuItemDTO();
        // Add some items to the menu
        restaurant.setMenuItems(List.of(menuItem1, menuItem2));
        assertEquals(2, restaurant.getMenuItems().size());
    }
}