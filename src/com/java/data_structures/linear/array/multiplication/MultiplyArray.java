package com.java.data_structures.linear.array.multiplication;

import java.awt.event.ActionEvent;

import javax.swing.JFrame;

public class MultiplyArray extends JFrame {
	
	/**
     * Creates new form MultiplicarMatrizes
     */
	public MultiplyArray() {
		initComponents();
	}
	
	int [][] a;
	int [][] at;
	int [][] res;
	
	public void createTransposed(int[][] a, int[][] at) {
		for (int row = 0; row < a.length; row++) {
			for (int column = 0; column < a.length; column++) {
				at[column][row] = a[row][column];
			}
		}
	}
	
	public int calculateScalarProduct(int[] a, int[] b) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i] * b[i];
		}
		return sum;
	}
	
	public void calculateArrayProduct(int[][] a, int[][] at, int[][] res) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				res[i][j] = calculateScalarProduct(a[i], at[j]);
			}
		}
	}
	
	private void jButtonActionPerformed(ActionEvent event) {
		
	}
}
