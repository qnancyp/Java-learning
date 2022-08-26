package java_data_types;

public class Day03_IfCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if statement
		// true statement
		if(2==2) {
		System.out.println("the valuer is 2");
		}
		System.out.println("After the if statement");
		// false statement
		if (2==3) {
			System.out.println("the value is not 2");
		}
		int a = 30;
		if (a==30) {
			System.out.println("the value of a is 30");
		} else {
			System.out.println("the value of a is not 30");
		}
		double b = 14.456789;
		double c = 13.000456; 
		if (b == c) {
			System.out.println("the statement is true");
		} else {
			System.out.println("the statement is false");
			}
		int bb = -9;
		if (bb > 0) {
			System.out.println("the value is positive");
		} else {
			System.out.println("the value is negative");
		}
		int cc = 0;
		if (cc> 0) {
			System.out.println("the value is positve");
		}else if (c < 0) {
			System.out.println("the value is negative");
		}else {
			System.out.println("the value is 0");
		}
		
		char value = 'e';
		if (value == 'a') {
			System.out.println("the value is a");
		}else if(value == 'b') {
			System.out.println("the value is b");
		}else if (value == 'c') {
			System.out.println("the value is c");
		}else if(value == 'd') {
			System.out.println("the value is d");
		}else {
			System.out.println("the value is something else");
		}
		
		
		String day = "monday";
		if (day == "monday") {
			System.out.println("the day is monday");
		}else if (day == "tuesday") {
			System.out.println("the day is tuesday");
		}else if (day == "wednesday") {
			System.out.println("the day is wednesday");
		}else if (day == "thursday") {
			System.out.println("the day is thursday");
		}else if (day == "friday") {	
			System.out.println("the day is friday");
		}else if (day == "saturday") {
			System.out.println("the day is saturday");
		}else if (day == "sunday") {
			System.out.println("the day is sunday");
		}else {
			System.out.println("the day is somthing else");
		}
			
		int day2 = 1;
		if (day2 == 1) {
			System.out.println("the day is monday");
		}else if (day2 == 2) {
			System.out.println("the day is tuesday");
		}else if (day2 == 3) {
			System.out.println("the day is wednesday");
		}else if (day2 == 4) {
			System.out.println("the day is thursday");
		}else if (day2 == 5) {	
			System.out.println("the day is friday");
		}else if (day2 == 6) {
			System.out.println("the day is saturday");
		}else if (day2 == 7) {
			System.out.println("the day is sunday");
		}else {
			System.out.println("you have entered an invalid day of the week");
		}	
			
		boolean isRaining = true;
		if (isRaining ) {
		System.out.println("It is raining");
		} else {
			System.out.println("It is not raining");
		}
		

		
		
		
		
		
	}	
}
