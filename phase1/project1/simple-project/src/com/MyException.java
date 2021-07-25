package com;

public class MyException {
	public static void main(String[] args) {
		  searchforName();
		}

		   private static void searchForName() throws FileNotFoundException {
		    File file = new File("leaders.txt");
		    Scanner kb = new Scanner(System.in);
		    Scanner input = new Scanner(file);

		    System.out.println("Please enter the name you would like to search for: ");
		    String name = kb.nextLine();


		    while(input.hasNextLine()) {
		        System.out.println(input.next(name));
		    }
		}
}
//class MyException extends Exception {}

//if (condition){
     //throw new MyException();
//}