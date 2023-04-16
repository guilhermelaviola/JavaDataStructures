package com.java.data_structures.linear;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArrayWithFile {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("integers.txt");
		Scanner line = new Scanner(file);
		int[] array = new int[100];
		int index = 0;
		
		while (index < array.length && line.hasNextInt()) {
			array[index] = line.nextInt();
			System.out.println("Line read: " + index);
			index++;
		}
		
		for (int x=0; x<index; x++) {
			System.out.println("Value of array: " + array[x]);
		}
		System.out.println("Index: " + index);
	}
}
