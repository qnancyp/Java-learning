package java_data_types;

public class Day18_MethodOverloading {

	public static void main(String[] args) {
		addition(10,20);
		addition(5,4,3);
		addition(3,5.33f);
		addition("Hello", "World");

	}

	//method overloading by changing the number of parameters
	static void addition (int a, int b) {
		System.out.println(a+b);
	}
	
	static void addition (int a, int b, int c) {
		System.out.println(a+b+c);
	}
	//method overloading by changing the data type of variables
	static void addition(int a, float b) {
		System.out.println(a+b);
	}
	static void addition(String a, String b) {
		System.out.println(a+b);
	}
}
