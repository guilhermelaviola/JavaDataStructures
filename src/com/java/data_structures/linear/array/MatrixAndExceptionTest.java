package com.java.data_structures.linear.array;

public class MatrixAndExceptionTest {
	
	public static void main(String[] args) {
		Array a = new Array(2, 3);
		Array b = new Array(2, 3);
		Array c = new Array(3, 2);
		
		try {
			double[][] aux = {{1, 2, 3}, {4, 5, 6}};
			a.setArray(aux);
		} catch(MyException me) {
			System.out.println(me);
		}
		try {
			double[][] aux = {{4, 5, 6}, {7, 8, 9}};
			b.setArray(aux);
		} catch(MyException me) {
			System.out.println(me);
		}
		try {
			double[][] aux = {{1, 4}, {2, 5}, {3, 6}};
			c.setArray(aux);
		} catch(MyException me) {
			System.out.println(me);
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		try {
			Array d = a.sumWith(b);
			System.out.println(d);
		} catch(MyException me) {
			System.out.println(me);
		}
		try {
			Array d = a.sumWith(c);
			System.out.println(d);
		} catch(MyException me) {
			System.out.println(me);
		}
	}
}
