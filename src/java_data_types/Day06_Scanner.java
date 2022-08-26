package java_data_types;

import java.util.Scanner;

public class Day06_Scanner {

	public static void main(String[] args) {
		// how to create an object
		// classname objectname = new classname();
		Scanner takeInput = new Scanner(System.in);
		System.out.println("Enter the int value : ");
		int val1 = takeInput.nextInt();
		System.out.println("The entered value is  : " + val1);

		// .nextBoolean (true,false)
		System.out.println("Is it raining outside : ");
		boolean val2 = takeInput.nextBoolean();// true or false
		System.out.println("If it is true it is raining, if it is false then it is not raining : " + val2);

		// .next (String)
		System.out.println("Enter your name : ");
		String name = takeInput.next();
		System.out.println("The name you entered is : " + name);
		// nextByte
		System.out.println("Enter your age : ");
		Byte age = takeInput.nextByte();
		System.out.println("The age you entered is :" + age);
		// nextFloat
		System.out.println("how much do you weight?");
		float weigth = takeInput.nextFloat();
		System.out.println("You have entered your weight : " + weigth);
		// nextDouble
		System.out.println("What is your weekly salary?");
		double weekly = takeInput.nextDouble();
		System.out.println("You have enterd the value of your weekly salary : " + weekly);
		// nextShort
		System.out.println("What is your monthly salary?");
		short monthly = takeInput.nextShort();
		System.out.println("You have entered the value of your montly salary :" + monthly);
		// nextLong
		System.out.println("What is your yearly salary");
		long yearly = takeInput.nextLong();
		System.out.println("You have entered the value of your yearly salary :" + yearly);

		// if else statement
		System.out.println("Enter the first value : ");
		int s = takeInput.nextInt();
		System.out.println("You have entered the value : "+ s);
		
		System.out.println("Enter the second value : ");
		int t = takeInput.nextInt();
		System.out.println("You have entered the second value : "+ t);
		
		System.out.println("Select 1 arithmetic operation (+,-,*,/)");
		String input = takeInput.next();
	
		//if else
		if (input == "+") {
			System.out.println(s+t);
		}else if (input == "-") {
			System.out.println(s-t);
		}else if (input == "*") {
			System.out.println(s*t);
		}else if (input == "s/t") {
			System.out.println(s%t);
		}else {
			System.out.println("You have entered an invalid operation");
		}
			
		
		
		

	}

}
