package com.fooddifferently.fd.model;

import jakarta.persistence.*;

 */
@Entity
@Table(name = "restaurants")
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String address;

     *
     * @return The ID of the restaurant.
     */
    public Long getId() {
        return id;
    }

    /**

     */
    public void setId(Long id) {
        this.id = id;
    }

    /**

     *
     * @return The name of the restaurant.
     */
    public String getName() {
        return name;
    }

    /**

     */
    public void setName(String name) {
        this.name = name;
    }

    /**

     *
     * @return The address of the restaurant.
     */
    public String getAddress() {
        return address;
    }

  
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Get the menu of the restaurant.
     *
     * @return The menu of the restaurant.
     */
    public List<Dish> getMenu() {
        return dishes;
    }

    /**
     * Set the menu of the restaurant.
     *
     * @param menu The menu of the restaurant.
     */
    public void setMenu(List<Dish> menu) {
        this.dishes = dishes;
    }

=======
     * Retrieves the type of food served by the restaurant.
     *
     * @return The type of food served by the restaurant.
     */
    public String getTypeOfFood() {
        return typeOfFood;
    }

    /**
     * Sets the type of food served by the restaurant.
     *
     * @param typeOfFood The type of food to set.
     */
    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = typeOfFood;
    }

    /**
     * Retrieves the list of menu items offered by the restaurant.
     *
     * @return The list of menu items offered by the restaurant.
     */
    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    /**
     * Sets the list of menu items offered by the restaurant.
     *
     * @param menuItems The list of menu items to set.
     */
    public void setMenuItems(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }
}
