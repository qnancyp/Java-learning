package java_data_types;

public class Day12_Methods {

	public static void main(String[] args) {
		//you can use scanner too, to get the input and 
		//put the variable inside the parenthesis
		name();

		name2("John");// -("John") is called argument
		name2("Ali");
		name2("Ken");

		name3("John", 25);
		
		day() ; // in return it is going to give me String value
				// this will not work, bottom example is working
		String a = day();//Tuesday
		System.out.println(a);
		
		String b = month();//August
		System.out.println(b);
		
		int c = year();
		System.out.println(c);
		
		
		String value = topic("void and non void methods");
		System.out.println(value);
		//or
		System.out.println(topic("parameterized and non parameterized methods"));
		
		
		
		
	}
	
	// method without parameter
	public static void name() {
		System.out.println("My name is Waqas Khan");
	}

	// method with parameter-(String a) is called parameter
	public static void name2(String a) {
		System.out.println("My name is " + a);
	}

	// method with 2 parameters
	public static void name3(String name, int age) {
		System.out.println(name + " is " + age + " years old.");
	}
	//NON VOID METHOD WITHOUT PARAMETERS
	//method with return values
	//uses different data types instead of void
	public static String day() {
		String todaysDay = "Tuesday";
		return todaysDay;
	}
	
	public static String month() {
		return "August";
	}
	//my example
	public static int year() {
		return 2022;
	}
	
	// NON VOID METHOD WITH PARAMETERS
	public static String topic(String a) {
		return "Today we are learning "+a;
	}
	
	
	
	
}
