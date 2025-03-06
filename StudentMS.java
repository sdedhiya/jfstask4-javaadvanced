package StudentManagementSystem;

import java.util.Scanner;

public class StudentMS {

	int rollno, age;
	String name, course;
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your roll no, name, age, course");
		int rollno=sc.nextInt();
		String name=sc.next();
		int age=sc.nextInt();
		String course=sc.next();
		
		Student s1 = new Student(rollno, name, age, course);
		s1.display();
		
		
	}

}


//Output
//Enter your roll no, name, age, course
//100 Sneh@ 29 BMS
//Name should not contain special symbols or numbers
//Age Should be between 15 and 21
//Roll No: 100
//Name: null
//Age: 0
//Course: BMS
