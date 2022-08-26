package java_data_types;

public class Day09_Arrays {

	public static void main(String[] args) {

		int a; // declare the variable
		a = 50; // initialize the variable

		// int[] rollNumber; // declare an array variable
		// rollNumber = new int [5];
		// the number [0], [1]... is index value
		int[] _rollNumber = new int[5];
		_rollNumber[0] = 500;
		_rollNumber[1] = 300;
		_rollNumber[2] = 100;
		_rollNumber[3] = 400;
		_rollNumber[4] = 200;

		System.out.println(_rollNumber[4]);

		String[] _StudentNames = new String[5];
		_StudentNames[0] = "Alex";
		_StudentNames[1] = "Mary";
		_StudentNames[2] = "Steve";
		_StudentNames[3] = "Jeff";
		_StudentNames[4] = "Zaid";
		System.out.println(_StudentNames[2]);

		// another way to declare array variable
		int[] rollNum = { 100, 200, 300, 400, 500 };
		System.out.println(rollNum[3]);
		String[] StudName = { "Alex", "Mary", "Steve", "Jeff", "Zaid" };
		System.out.println(StudName[4]);
		// to find the length of the array in line 32
		System.out.println(rollNum.length);
		// to find the length of the array in line 34
		System.out.println(StudName.length);
		// to print all the values within the array 
		// remember to put i in the end of rollNum
		// if you do not know the length of the array use length method
		for (int i=0; i<5;i++) {
			System.out.println(rollNum[i]);
		}
		for (int i=0;i<rollNum.length;i++) {
			System.out.println(rollNum[i]);
		}
		// to print the string example
		for (int i=0;i<StudName.length;i++) {
			System.out.println(StudName[i]);
		}
		
		//char[] x = new char[5];
		char[] x = {'a','b','c','d','e','f'};
		System.out.println(x.length);
		for (int i=0;i<x.length;i++) {
			System.out.println(x[i]);
		}
		
	
	
	}
}
