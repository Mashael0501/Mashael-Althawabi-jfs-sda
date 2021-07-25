package com;

public class PrimitiveTypeConversion {
	public static void main(String [] args) {
		byte a = 10;
		int b = 20;
		byte c =(byte)b; //Explicit Narrowing
		int d = a; //Auto-Widening
		
		
		System.out.println("c=" +c);
		System.out.println("d=" +d);
		
		int e = 200;
		byte f = (byte)e;
		System.out.println("f=" +f);
		
		int x = 97;
		char y = (char)x;
		System.out.println("y=" +y);
	}

}
// Assign char value to int and vice versa