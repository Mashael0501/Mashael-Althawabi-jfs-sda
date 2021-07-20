package com;

import java.io.IOException;

public class TeatCheckUncheck {
	public static void main(String[] args) {
		System.out.println("main starts");
		try {
			demo(-2);
		}catch (IOException e) {
			e.printStackTrace();
		}
	
		System.out.println("main ends");
	}
	static void demo(int x) throws IOException{
		
		if (x < 0) {
			throw new IOException();
		}
	
 	}

     static void hello(int x) {
	if(x < 0) {
		try {
			throw new IOException();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
}
