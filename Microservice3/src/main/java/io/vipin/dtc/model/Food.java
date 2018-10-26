package io.vipin.dtc.model;

import javax.validation.constraints.NotNull;

import org.springframework.data.couchbase.core.mapping.Document;

import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;

@Document
public class Food {

	@Id
	@Field
	@NotNull
	private String foodId;
	@Field
	@NotNull
	private String foodName;
	@Field
	@NotNull
	private int price;
	public String getFoodId() {
		return foodId;
	}
	public void setFoodId(String foodId) {
		this.foodId = foodId;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Food(@NotNull String foodId, @NotNull String foodName, @NotNull int price) {
		super();
		this.foodId = foodId;
		this.foodName = foodName;
		this.price = price;
	}
	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
