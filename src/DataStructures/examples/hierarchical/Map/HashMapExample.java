package DataStructures.examples.hierarchical.Map;

import java.util.HashMap;

// HashMap is a list that consists of key/value pairs
public class HashMapExample {

	public static void main(String[] args) {

		// Instantiating a HashMap object
		HashMap<String, Double> products = new HashMap<String, Double>();
		
		// Adding elements into the HashMap
		products.put("Red Trench Coat", 30.00);
		products.put("Sunglasses", 12.00);
		products.put("Black Suit", 47.00);
		products.put("Blue Jeans", 15.00);

		// Printing the whole HashMap
		System.out.println("Products: " + products);

		// Printing an individual value from the HashMap
		System.out.println("Printing suit: " + products.get("Black Suit"));

		// Removing an item from the HashMap
		products.remove("Black Suit");

		// Checking whether the HashMap contains a certain key or not 
		System.out.println("Does the HashMap contains the key 'Red Jeans'? " + products.containsKey("Red Jeans"));

		// Checking whether the HashMap contains a certain value or not 
		System.out.println("Does the HashMap contains the value '30.00'? " + products.containsValue(30.00));

		// Replacing an item in the HashMap
		System.out.println(products.replace("Red Trench Coat", 25.00));

		// Printing the whole HashMap again
		System.out.println("Products: " + products);

		// Printing the keys only
		System.out.println("Products's keys: " + products.keySet());

		// Printing the values only
		System.out.println("Products's values: " + products.values());
	}

}
