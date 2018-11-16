package com.jirina.foxclub.repository;

import com.jirina.foxclub.model.Fox;
import com.jirina.foxclub.model.NutritionType;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FoxRepo extends CrudRepository<Fox, Long> {
  //  List<Fox> findAllByNutritionType(NutritionType nutritionType); // finds all carnivore foxes


}
