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
     * @param typeOfFood
     * @return a list of restaurants by type of food
     */
    List<Restaurant> findByTypeOfFood(String typeOfFood);

}
