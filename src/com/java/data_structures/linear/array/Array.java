package com.java.data_structures.linear.array;

public class Array {
	private int row;
	private int column;
	private double[][] array;
	
	public Array(int row, int column) {
		this.row = row;
		this.column = column;
		array = new double[row][column];
	}

	public void setArray(double[][] a) throws MyException {
		if (row != a.length || column != a[0].length) {
			throw new MyException("Arrays with different sizes.");
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				array[i][j] = a[i][j];
			}
		}
	}
	
	public void setElement(double x, int i, int j) {
		array[i][j] = x;
	}
	
	public double getElement(int i, int j) {
		return array[i][j];
	}
	
	public int getRow() {
		return row;
	}
	
	public int getColumn() {
		return column;
	}
	
	public Array sumWith(Array array2) throws MyException {
		if (row != array2.getRow() || column != array2.getColumn()) {
			throw new MyException("Arrays with different sizes.");
		}
		
		Array sum = new Array(row, column);
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				sum.setElement(array[i][j] + array2.getElement(i, j), i, j);
			}
		}
		return sum;
	}
	
	public Array subtractFrom(Array array2) throws MyException {
		if (row != array2.getRow() || column != array2.getColumn()) {
			throw new MyException("Arrays with different sizes.");
		}
		
		Array subtraction = new Array(row, column);
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				subtraction.setElement(array[i][j] - array2.getElement(i, j), i, j);
			}
		}
		return subtraction;
	}
	
	public String toString() {
		String s = "";
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				s += array[i][j] + "\t";
			}
			s += "\n";
		}
		return s;
	}
}
