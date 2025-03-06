package com.weekdaysarray;

import java.util.Scanner;
import java.util.*;

public class Weekdayarray extends Exception {

	public static void main(String[] args) {
		
		String weekday[] = {"Sunday", "Monday", "Tuesday", "Wednesday","Thursday", "Friday", "Saturday"};
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number to get the day of the week");
		int n = sc.nextInt();
		
		try {
			for(int i=0; i<6; i++)
			{
				i=n;
				System.out.println("You selected " +weekday[i]);
				break;
			};
		}
		catch(Exception e){
			System.out.println("Number should be between 0 to 6");
		}
}
}


//Output:
//	
//	Enter number to get the day of the week
//	10
//	Number should be between 0 to 6
