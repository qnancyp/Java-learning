package java_data_types;

import java.util.Scanner;

public class Day05_Scanner {

	public static void main(String[] args) {
		// create an object / instance of the class
		
		//classname objectname = new classname();
		Scanner getInput = new Scanner (System.in);
		//getInput in the object of the Scanner class.	
		System.out.println("Enter the first value : ");
		// scanner class has methods which take the int value as input
		int aa = getInput.nextInt();
		
		System.out.println("Enter the second value : ");
		int bb = getInput.nextInt();
		System.out.println("Enter the third value : ");
		int cc = getInput.nextInt();
		int dd = aa*bb*cc;
		
		System.out.println("The product is : "+dd);
		
		System.out.println("enter first value : ");
		int x = getInput.nextInt();
		System.out.println("enter the second value : ");
		int y = getInput.nextInt();
		int z = x+y;
		System.out.println("The sum is : " +z);
		
		
		
		
	
		
		

	}

}
