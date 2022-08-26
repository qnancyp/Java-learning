package java_data_types;

import java.util.Scanner;

public class Day18_Task {

	public static void main(String[] args) {

		Scanner getInput = new Scanner(System.in);
		System.out.println("How many values do you need to calculate?");
		int Values = getInput.nextInt();
		int[] arr = new int [Values];

	}

	static void addition(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	static void multiply(int a, int b, int c) {
		System.out.println(a * b * c);
	}

	static void subtraction(int a, int b, int c) {
		System.out.println(a - b - c);
	}

	static void division(int a, int b, int c) {
		System.out.println(a % b % c);
	}

	
}
