package java_data_types;

import java.util.Scanner;

public class Day06_Calculator {

	public static void main(String[] args) {
		
		char operator;
		double x, y, result;
		Scanner Calculator = new Scanner(System.in);
		System.out.println("Choose an operator: +, -, *, or /");
		operator = Calculator.next().charAt(0);
		
		System.out.println("Enter the first value : ");
		double x1 = Calculator.nextDouble();
		System.out.println("You have entered the value : "+ x1);
		
		System.out.println("Enter the second value : ");
		double y1 = Calculator.nextDouble();
		System.out.println("You have entered the second value : "+ y1);
		
		
		//switch case
		
		switch (operator) {
		case '+':
			result = x1 + y1;
			System.out.println(x1 + " + " + y1 + " = " + result);
			break;	
		case '-':
			result = x1 - y1;
			System.out.println(x1 + " - " + y1 + " = " + result);
			break; 
		case '*':
			result = x1 - y1;
			System.out.println(x1 + " * " + y1 + " = " + result);
			break;	
		case '/':
			result = x1 - y1;
			System.out.println(x1 + " / " + y1 + " = " + result);
			break;	
		default:
			System.out.println("invalid operator.");
			break;
		
		}
		
	
	
		
		
		
		
		
				
	 
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
