package com;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Project1 {

	public static void main(String[] args) {
		
		menu m = new menu();
		m.runn();

	}
	
	

}
class menu{
		Scanner in = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		
		
		public void runn() {
			String name ;
			int num ;
			while(true) {
                System.out.println("A program is made by Mashael Althawabi");
                System.out.println("Please select:");
				System.out.println(" 1 Options \n 2 Exit");
				
				
				if (in.nextInt()==2) {
					break;
					
				}else {
					
					System.out.println(" ");
					
					while(true) {
						System.out.println("Please select from the options:");
						System.out.println(" 1 Search       2 Add \n 3 Delete       4 Display \n 5 Return");
						num = in.nextInt();
						System.out.println(" ");
						
						
						
						if(num==1)

                                                        {
							
							System.out.println("Enter tha file name :");
							name = in.next();
							System.out.println(" ");
							
							if(search(list, name)) {
								System.out.println("File has been found in the list");
							}else {
								System.out.println("The file was not found");
							}
						}


						
						

						else if(num==2) {
							
							System.out.println("Enter tha new file name :");
							name = in.next();
							System.out.println(" ");
							
							if(add(list,name)) {
								System.out.println("File has been added successfully");
								
							}else {
								System.out.println("This file name already exists");
								
							}
						}
						


						
						else if(num==3) {
							
							System.out.println("Enter tha file name :");
							name = in.next();
							System.out.println(" ");
							
							if(delete(list, name)) {
								System.out.println("File has been deleted successfully");
							}else {
								System.out.println("This file dose not exist");
							}
								
						}
						


						else if (num==4) {
							if(display(list)) {
								
							}else {
								System.out.println("No files wear found");
							}
							
						}
						
						 


						else if (num==5) {
							break;
						}
						
						
						System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
					}
				}
				
			}
				
		}


		
		public boolean add(ArrayList<String> list , String item) {
			
			if(search(list,item)) {
				return false;
				
			}else {
				list.add(item);
				return true;
			}
			
		}
		
		public boolean delete(ArrayList<String> list , String item) {
			if(search(list,item)) {
				list.remove(item);
				return true;
				
			}else {				
				return false;
			}
		}
		
		public boolean display(ArrayList<String> list) {
			if(list.isEmpty()) {
				return false;
				
			}else {				
				Collections.sort(list);
				
				
				for(String s : list) {
					System.out.println(s);
				}
				
				return true;
			}
		}
		
		public boolean search(ArrayList<String> list , String item) {
			for(String s : list) {
				if(s.equals(item)) {
					return true;
				}
			}
			return false;
		}
	}
		