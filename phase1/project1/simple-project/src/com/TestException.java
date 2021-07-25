package com;

public class TestException {
public static void main(String[] args) {
	int a = 10;
	int b = 0;
	int result = 0;
	try {
		result = calculation(a,b);
		System.out.println("Result =" +result);	
	} catch(ArithmeticException e) {
		e.printStackTrace();
	}
	System.out.println("Done...");
 }

static int calculation(int x, int y) {
	System.out.println("calculation(int,int)");
	int c = x/y;
	return c;
	
}
}
