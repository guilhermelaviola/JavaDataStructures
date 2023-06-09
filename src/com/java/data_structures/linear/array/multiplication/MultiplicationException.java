package com.java.data_structures.linear.array.multiplication;

public class MultiplicationException extends Exception {
	public MultiplicationException(String message) {
		super("Number of columns from the first is incompatible with the rows of the second.");
	}
}
