package DataStructures.examples.linearQueue;

import java.util.*;

//Stack follows the FIFO logic: First In, First Out
public class QueueExample {
	
	// Test
	public static void main(String[] args) {
		// Instantiating a Queue object
		Queue<String> names = new LinkedList<>();

		// Adding elements into the Queue
		names.add("Andrea");
		names.add("Ciro");
		names.add("Marco");
		names.add("Matteo");
		names.add("Nicolo");

		// Printing the Queue
		System.out.println(names);

		// Removing an element from the Queue
		names.remove("Ciro");

		// Printing the Queue again
		System.out.println(names);

		// Printing the Queue size
		System.out.println("The names size is: " + names.size());

		// Printing whether the Queue contains a certain element or not
		System.out.println("Does names queue contains the element 'Matteo'? " + names.contains("Matteo"));
		
		// Clearing the Queue
		System.out.println("Clearing the Queue...");
		names.clear();
		
		// Printing the Queue once again
		System.out.println(names);
	}

}
