package com.jirina.foxclub.repository;

import com.jirina.foxclub.model.NutritionType;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface NutritionTypeRepo extends CrudRepository <NutritionType, Long> {
 //   List<NutritionType> findAllByFoxesEquals(NutritionType nutritionType); // finds all carnivore foxes

}
