package com.java.data_structures.linear.array.recursive_array;

public class RecursiveArrayTest {
	public static void main(String[] args) {
		Car golf = new Car("Volkswagen", "Golf", 12500.00);
		Car taurus = new Car("Ford", "Taurus", 12200.00);
		Car corolla = new Car("Toyota", "Corolla", 15600.00);
		Car silverado = new Car("Chevrolet", "Silverado", 18000.00);
		
		Car[] cars = {golf, taurus, corolla, silverado};
		
		System.out.println(calculateTotalRecursive(cars, cars.length));
		System.out.println(calculateTotalIterative(cars));
	}
	
	public static double calculateTotalRecursive(Car[] c, int length) {
		if (length == 1) {
			return c[0].getPrice();
		}
		return c[length-1].getPrice() + calculateTotalRecursive(c, length-1);
	}
	
	public static double calculateTotalIterative(Car[] c) {
		double sum = 0;
		for (Car v : c) {
			sum += v.getPrice();
		}
		return sum;
	}
}
