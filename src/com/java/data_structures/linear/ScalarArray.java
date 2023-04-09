package com.java.data_structures.linear;

public class ScalarArray {
	
	public static void main(String[] args) {
		double[][] arr = {{2, 4, 6}, {3, 6, 9}, {4, 8, 12}};
		displayArray(arr);
		if (arr[1][1] != 0) {
			double[] temp = divideArrayByScalar(arr[1], arr[1][2]);
			for (int i = 0; i < arr[0].length; i++) {
				arr[1][i] = temp[i];
			}
		}
		displayArray(arr);
	}
	
	public static void displayArray(double[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.println(arr[i][j] + " ");
			}
			System.out.println("");
		}
	}
	
	public static double[] divideArrayByScalar(double[] arr, double scalar) {
		double[] array = new double[arr.length];
		for (int i = 0; i < arr.length; i++) {
			array[i] = arr[i] / scalar;
		}
		return array;
	}
}
