package com.fooddifferently.fd.repository;

import com.fooddifferently.fd.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

    /**
     * @param name
     * @return a list of restaurants by name
     */
    List<Restaurant> findByName(String name);

    /**
     * @param address
     * @return a list of restaurants by address
     */
    List<Restaurant> findByAddress(String address);

    /**
     * @param typeOfFood
     * @return a list of restaurants by type of food
     */
    List<Restaurant> findByTypeOfFood(String typeOfFood);

    /**
     * @param name
     * @param address
     * @return a list of restaurants by name and address
     */
    List<Restaurant> findByNameAndAddress(String name, String address);

    /**
     * @param keyword
     * @return a list of restaurants by name containing keyword
     */
    List<Restaurant> findByNameContaining(String keyword);
}
