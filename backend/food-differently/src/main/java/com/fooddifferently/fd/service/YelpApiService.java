package com.fooddifferently.fd.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Collections;
import java.util.Map;

@Service
public class YelpApiService {

    @Value("${yelp.api.url}")
    private String apiUrl;

    @Value("${yelp.api.key}")
    private String apiKey;

    private final RestTemplate restTemplate;

    public YelpApiService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Map<String, Object> searchBusinesses(String term, String location) {
        String url = apiUrl + "/businesses/search?term=" + term + "&location=" + location;
        return callYelpApi(url);
    }

    private Map<String, Object> callYelpApi(String url) {
        String authHeader = "Bearer " + apiKey;
        return restTemplate.getForObject(url, Map.class, Collections.singletonMap("Authorization", authHeader));
    }
}