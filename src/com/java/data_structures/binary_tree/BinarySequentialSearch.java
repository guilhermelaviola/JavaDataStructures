package com.java.data_structures.binary_tree;

import java.util.Random;

public class BinarySequentialSearch {
	
	public static void main(String[] args) {
		Random r = new Random(30);
		int[] a = new int[20];
		for (int i=0; i<20; i++) {
			a[i] = r.nextInt(100);
		}
		
		for (int i=0; i<20; i++) {
			System.out.println(a[i] + " ");
		}
		System.out.println("");
		quickSort(a);
		
		for (int i=0; i<20; i++) {
			System.out.println(a[i] + " ");
		}
		System.out.println("");
		quickSort(a);
		
		for (int i=0; i<20; i++) {
			System.out.println(a[i] + " ");
		}
		System.out.println("");
		System.out.println(binarySearch(a, 31));
		System.out.println(counter);
		System.out.println(sequentialSearchRecursive(a, 56));
	}
	
	public static int sequentialSearchRecursive(int[] v, int searched) {
		return sequentialSearchRecursive(v, 0, v.length-1, searched);
	}
	
	public static int sequentialSearchRecursive(int[] v, int start, int end, int searched) {
		if (start > end) {
			return 1;
		}if (searched == v[start]) {
			return start;
		}
		start = start+1;
		return sequentialSearchRecursive(v, start, end, searched);
	}
	
	public static int binarySearch(int[] v, int searched) {
		return binarySearch(v, 0, v.length-1, searched);
	}
	
	public static int counter = 0;
	
	public static int binarySearch(int[] v, int start, int end, int searched) {
		int pos = -1;
		int mid = (start+end)/2;
		counter++;
		if (searched == v[mid]) {
			return mid;
		}
		if (start != end) {
			if (searched < v[mid]) {
				end = mid-1;
				return binarySearch(v, start, end, searched);
			}
			start = mid+1;
			return binarySearch(v, start, end, searched);
		}
		return pos;
	}
	
	public static void quickSort(int[] v) {
		quickSort(v, 0, v.length-1);
	}
	
	public static void quickSort(int[] v, int start, int end) {
		int mid;
		if (start < end){
			mid = partition(v, start, end);
			quickSort(v, start, mid);
			quickSort(v, mid+1, end);
		}
	}
	
	public static int partition(int[] v, int start, int end) {
		int pivot = v[start];
		int top = start;
		for (int i = start+1; i <= end; i++) {
			if (v[i] < pivot) {
				v[top] = v[i];
				v[i] = v[top+1];
				top++;
			}
		}
		v[top] = pivot;
		return top;
	}
}
