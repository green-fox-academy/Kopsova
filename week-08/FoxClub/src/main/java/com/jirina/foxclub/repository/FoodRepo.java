package com.jirina.foxclub.repository;

import com.jirina.foxclub.model.Food;
import com.jirina.foxclub.model.Fox;
import com.jirina.foxclub.model.NutritionType;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FoodRepo extends CrudRepository<Food, Long> {
        List<Food> findAllByNutritionType(NutritionType nutritionType); // finds all food for carnivore foxes
    }

