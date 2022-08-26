package java_data_types;

public class Day16_Constructor {

	Day16_Constructor() {
		System.out.println("Login as admin");//this is the constructor(default), has same class name and ();
	}
	Day16_Constructor(String name){				//this and below are parameterized constructors
		System.out.println("Logged in as : "+name);
	}
	Day16_Constructor(String name, String env){
		System.out.println("Logged in as : "+name);
		System.out.println("Logged in to :"+env);
	}
	Day16_Constructor(int value) {
		System.out.println("The value is : "+value);
	}
	void hello() {
		System.out.println("This is hello method");//this is just a regular method
	}
}
