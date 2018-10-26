package io.vipin.dtc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.vipin.dtc.model.Food;
import io.vipin.dtc.service.FoodService;


@RestController
public class FoodController {
	
	@Autowired
	private FoodService foodservice;

	@RequestMapping("/{id}")
	private Food geFoodbyId(@PathVariable String id){
		return foodservice.getFoodbyId(id);
	}
	
	@PostMapping("/add/food")
	private String addBook(@RequestBody Food food) {
		foodservice.addFood(food);
		return "Food Added Successfully";
	}
	
}
