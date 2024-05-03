package com.fooddifferently.fd.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.List;
import java.util.Map;

@Entity
@Table(name = "restaurants")
public class Restaurant {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private long id;

    @NotBlank
    @Size(max = 255)
    private String name;

    @NotBlank
    @Size(max = 255)
    private String address;

    @Size(max = 20)
    @JsonProperty("display_phone")
    private String phoneNumber;

    private Double rating;

    @JsonProperty("photos")
    private List<String> photoUrls;

    public Restaurant() {
        // Default constructor
    }

    public static Restaurant mapYelpBusinessToRestaurant(Map<String, Object> business) {
        Restaurant restaurant = new Restaurant();
        restaurant.setId((int) business.get("id"));
        restaurant.setName((String) business.get("name"));
        restaurant.setAddress((String) business.get("location"));
        restaurant.setPhoneNumber((String) business.get("display_phone"));

        if (business.containsKey("rating")) {
            restaurant.setRating(Double.valueOf(business.get("rating").toString()));
        }

        if (business.containsKey("photos")) {
            restaurant.setPhotoUrls((List<String>) business.get("photos"));
        }

        return restaurant;
    }

    // Getters and Setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public List<String> getPhotoUrls() {
        return photoUrls;
    }

    public void setPhotoUrls(List<String> photoUrls) {
        this.photoUrls = photoUrls;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", rating=" + rating +
                ", photoUrls=" + photoUrls +
                '}';
    }
}
