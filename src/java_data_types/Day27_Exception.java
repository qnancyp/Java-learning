package java_data_types;

import java.util.Scanner;

public class Day27_Exception {

	public static void main(String[] args) {
		System.out.println("Program Started");
		Scanner sc = new Scanner (System.in);
		try {
			System.out.println("Enter the value of a ");
			int a = sc.nextInt();
			System.out.println("The value of a is "+ a);
			System.out.println("Enter the value of b ");
			int b = sc.nextInt();
			System.out.println("The value of b is "+ b);
			int c = a / b;
			System.out.println("The division is "+ c);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("The program ended");
		
		
		
	

	}

}
