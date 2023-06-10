package com.java.data_structures.linear.array.multiplication;

import com.java.data_structures.linear.array.MyException;

public class Array {
	
	private int row;
	private int column;
	private double array[][];
	
	public Array(int row, int column) {
		this.row = row;
		this.column = column;
		this.array = new double[row][column];
	}
	
	public double getArray(int row, int column) {
		return array[row][column];
	}
	
	public double[] getArrayVector(int row) {
		return array[row];
	}
	
	public int getRow() {
		return row;
	}
	
	public int getColumn() {
		return column;
	}
	
	public void setArray(double[][] a) throws MyException {
		if (row != a.length || column != a[0].length) {
			throw new MyException("Arrays with different sizes!");
		}
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				array[i][j] = a[i][j];
			}
		}
	}
	
	public void setArray(int row, int column, double value) {
		array[row][column] = value;
	}
	
	public void display() {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.println(array[i][j] + "\t");
			}
			System.out.println("\n");
		}
	}
	
	public Array multiplyBy(double d) {
		Array a = new Array(this.row, this.column);
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j ++) {
				a.setArray(i, j, array[i][j] * d);
			}
		}
		return a;
	}
	
	public double arrayScalarProduct(double [] a, double [] b) throws Exception {
		double sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i] * b[i];
		}
		return sum;
	}
	
	public Array createTranport(Array a) {
		Array at = new Array(a.array[0].length, a.array.length);
		for (int i = 0; i < a.array.length; i++) {
			for (int j = 0; j < a.array[0].length; j++) {
				at.setArray(j, i, a.getArray(i, j));
			}
		}
		return at;
	}
	
	public Array multiplyArray(Array a, Array b) throws MyException, Exception {
		Array bt = createTranport(b);
		Array at = new Array(array[0].length, array.length);
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				at.setArray(i, j, arrayScalarProduct(a.getArrayVector(i), bt.getArrayVector(j)));
			}
		}
		return at;
	}
}
