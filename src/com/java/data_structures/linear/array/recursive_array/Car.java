package com.java.data_structures.linear.array.recursive_array;

public class Car {
	public String brand;
	public String model;
	public double price;
	
	public Car() {
		
	}
	
	public Car(String brand, String model, double price) {
		this.brand = brand;
		this.model = model;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}
	
	public String getModel() {
		return model;
	}

	public double getPrice() {
		return price;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setModel(String model) {
		this.model = model;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
