package com;

public class Testfinally {
public static void main(String[] args) {
	int a = 10;
	int b = 10;
	
	try {
		int c = a/b;
		System.out.println("c="+c);
	} catch(NumberFormatException e) {
		e.printStackTrace();
	} finally {
		System.out.println("this is finally block");
	}
	System.out.println("end of the program");
}
}
