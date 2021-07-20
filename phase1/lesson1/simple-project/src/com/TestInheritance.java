package com;

public class TestInheritance {
   public static void main(String[] args) {
	   person p1 = new person ();
	   p1.name = "Alex";
	   p1.updateName();
	   System.out.println("--------------");
	   Employee e1 = new Employee();
	   e1.id = 100;
	   e1.name= "Bruce";
	   e1.salary= 35000;
	   e1.updateName();
	   e1.updateSalary();
	System.out.println("--------------");
	Student s1 = new Student ();
	s1.name="Charles";
	s1.usn = "1ABC001";
	s1.grade = "A+";
	s1.updateName();
	s1.updateGrade();
	
	
   }
}
