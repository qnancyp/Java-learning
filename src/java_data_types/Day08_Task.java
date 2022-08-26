package java_data_types;

import java.util.Scanner;

public class Day08_Task {

	public static void main(String[] args) {
		
		// this is the object of the scanner class
		Scanner monthInput = new Scanner (System.in);
		for (int a = 0; a < 3; a++) {
		System.out.println("Enter the month you were born in : ");	
		String monthName = monthInput.next();
		if (monthName.equalsIgnoreCase("Jan") || monthName.equalsIgnoreCase("Feb") || monthName.equalsIgnoreCase("Mar")) {
			System.out.println("Winter");
		} else if (monthName.equalsIgnoreCase("Apr") || monthName.equalsIgnoreCase("May") || monthName.equalsIgnoreCase("Jun")) {
			System.out.println("Spring");
		} else if (monthName.equalsIgnoreCase("Jul") || monthName.equalsIgnoreCase("Aug") || monthName.equalsIgnoreCase("Sep")) {
			System.out.println("Summer");
		} else if (monthName.equalsIgnoreCase("Oct") || monthName.equalsIgnoreCase("Nov") || monthName.equalsIgnoreCase("Dec")) {
			System.out.println("Fall");
		} else {
			System.out.println("Provide the valid month");
		}

		}
		}

}
