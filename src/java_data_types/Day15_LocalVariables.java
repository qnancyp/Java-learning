package java_data_types;

public class Day15_LocalVariables {
	//Instance/Global variable
String day = "Monday"; 
	public static void main(String[] args) {
		int age = 10;
		String name = "John";
		float temp = 45.88f;

		System.out.println(age);
		System.out.println(name);
		System.out.println(temp);

		Day15_LocalVariables a = new Day15_LocalVariables();
		a.possible();// accessing variable by calling/accessing the method of the same class

		// System.out.println(environment);//not local,-possible method- not main
		// method, so not working

		if (true) {
			// local block variable
			int b = 40;
			System.out.println(b);
		}
		// System.out.println(b); local only-local variable in the block not accessible
		// in method

	}

	public static void possible() {// method that does not return a value cause not on main
		// local variable
		String environment = "qa.codegator.us";
		String username = "test@gmail.com";
		String password = "Welcome1";

		System.out.println(environment);
		System.out.println(username);
		System.out.println(password);

	}

}
