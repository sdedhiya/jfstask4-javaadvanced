package com.Hashmap;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class HashMapStudentGrade {


	   public static void main(String[] args) {

	      HashMap<String, Double> students = new HashMap<>();
	      Scanner input = new Scanner(System.in);
	      String newStudent;

	      System.out.println("Enter your students (or ENTER to finish):");

	      // Get student names and grades
	      do {

	         System.out.print("Student: ");
	         newStudent = input.nextLine();

	         if (!newStudent.equals("")) {
	            System.out.print("Grade: ");
	            Double newGrade = input.nextDouble();
	            students.put(newStudent, newGrade);

	            // Read in the newline before looping back
	            input.nextLine();
	         }

	      } while(!newStudent.equals(""));
	      
	      //print
	      for (Map.Entry<String, Double> student : students.entrySet()) {
		         System.out.println(student.getKey() + " (" + student.getValue() + ")");
	      }
		         //remove
	      System.out.println("Enter student name to remove");
	      String n=input.next();
	      Double r = students.remove(n);
	      
	      // Print 
    
	      for (Map.Entry<String, Double> student1 : students.entrySet()) {
	         System.out.println(student1.getKey() + " (" + student1.getValue() + ")");
	         
	      }
	      
	   }
	   
}

//Output:
//	
//	Enter your students (or ENTER to finish):
//		Student: sneha
//		Grade: 	90
//		Student: priya
//		Grade:  90
//		Student: pooja
//		Grade: 90
//		Student: 
//		priya (90.0)
//		pooja (90.0)
//		sneha (90.0)
//		Enter student name to remove
//		priya
//		pooja (90.0)
//		sneha (90.0)


