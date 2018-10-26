package io.vipin.dtc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.vipin.dtc.model.Food;
import io.vipin.dtc.repository.FoodRepository;

@Service
public class FoodService {
	
	@Autowired
	private FoodRepository foodRepositoy;

	public Food getFoodbyId(String id) {
		// TODO Auto-generated method stub
		return foodRepositoy.findById(id).get();
	}

	public void addFood(Food food) {
		foodRepositoy.save(food);
	}

}
