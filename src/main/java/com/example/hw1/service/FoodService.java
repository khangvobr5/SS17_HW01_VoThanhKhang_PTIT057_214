package com.example.hw1.service;

import com.example.hw1.model.Food;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@Slf4j
public class FoodService {

    @Cacheable(value = "restaurantFoods", key = "#restaurantId")
    public List<Food> getFoodsByRestaurantId(Long restaurantId) {
        log.info("Fetching from Database for restaurantId: {}", restaurantId);
        // Simulate DB fetch
        return Arrays.asList(
                new Food(1L, "Phở Bò", 55000.0),
                new Food(2L, "Bún Chả", 60000.0)
        );
    }
}
