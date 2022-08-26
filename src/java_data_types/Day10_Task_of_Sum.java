package java_data_types;

import java.util.Scanner;

public class Day10_Task_of_Sum {

	public static void main(String[] args) {
	int In, i, Sum = 0;
	Scanner Input_for_Sum = new Scanner (System.in);
	
	System.out.println("How many values do you want to sum? ");
	In = Input_for_Sum.nextInt();
	int[] x = new int [In];
	
	System.out.println("Enter the " + In + " values :");
	//int sum =0;
	//x[]= Input_for_Sum.nextInt();
	for (i=0; i<In; i++) {
		x[i]= Input_for_Sum.nextInt();
	}
	for (i = 0; i<In; i++) {
		Sum = Sum + x[i];
	}
	System.out.println("The sum of all the values is :"+ Sum);
		
	}
	
	// waqas example
	//Scanner getInput = new Scanner(System.in);
	//System.out.println("How many values do you need to do a sum for: ");
	//int values = getInput.nextInt();
	
	//int [] arr = new int [values];
	//int sum = 0;
	
	//for (int i=0; i< arr.length; i++) {
	//	System.out.println("Enter the"+(i+1)= "value : ");
	//	arr[i] = getInput.nextlnt();
	//	sum = sum = arr[i];
	//}
	//System.out.println(THe sum of"+arr.length+  "values is : "+sum);
	//}

}
