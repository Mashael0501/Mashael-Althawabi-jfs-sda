package com;
import java.util.Scanner;
public class Calculator {
	
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the first number");
		double n1=input.nextInt();
		
		System.out.println("Enter the operation: + ,-,*,/4");
		String op=input.next();
		
		System.out.println("Enter the second number");
		double n2=input.nextInt();
		
		switch(op) {
		case "+":System.out.println("The sum is " +(n1+n2));
        break;
		case "-":System.out.println("The sub is "
				+ "" +(n1-n2));
        break;
        case "*": System.out.println("The mult is " +(n1*n2));
        break;
        case "/": System.out.println("The div is " +(n1/n2));
        break;
        default: System.out.println("Error! Enter correct operator");
        return;
        
		}
		
	}
}
