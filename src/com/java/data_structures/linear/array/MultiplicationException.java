package com.java.data_structures.linear.array;

public class MultiplicationException extends Exception {
	public MultiplicationException(String message) {
		super("Number of columns from the first is incompatible with the rows of the second.");
	}
}
