package java_data_types;

import java.util.Scanner;

public class Day07_Loops {

	public static void main(String[] args) {
		// For loop
		System.out.println("Before the loop");
		//
		for (int i=1; i<=10; i++) {
		System.out.println("Hello World");
	    }
		//
		System.out.println("After the loop");
		//
		for (int i = 10; i>=0; i--) {
			System.out.println(i);	
		}
		//task on page 354
		for (int i = 1; i<=100; i++) {
			System.out.println(i);
		}
		for (int i = 100; i>=0; i--) {
			System.out.println(i);
		}
		for (int i = 20; i <=50; i++) {
			if (i%2==0) {
			System.out.println(i);
		}
		}		
		for (int i = 20; i <=50; i++) {
			if (i%2==1) {
			System.out.println(i);
		}
		}
		//scanner
		for (int i=0; i<=2; i++) {
		Scanner UserInput = new Scanner(System.in);
		System.out.println("Enter your birth month : ");
		String month = UserInput.next();
		
		switch (month) {
		case "January" :
		case "February" :
		case "March" :
			System.out.println("You were born in Winter.");
			break;
		case "April" :
		case "May" :
		case "June" :
			System.out.println("You were born in Spring.");
			break;
		case "July" :
		case "August" :
		case "September" :
			System.out.println("You were born in Summer.");
			break;
		case "October" :
		case "November" :
		case "December" :
			System.out.println("You were born in Fall.");
			break;
			default : 
			System.out.println("The month input is invalid");
		}
		}
		
	
			
	}
}
