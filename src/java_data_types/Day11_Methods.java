package java_data_types;

public class Day11_Methods {

	// main method-
	//will not be able to "Run As" para resultados without the main method 
	public static void main(String[] args) {
		sample();
		hello();
		sum();
		add(5, 4);// need values and expects them because it has parameters
				  // when you put 5, 4 the parameters are called and change name to argument
		add(20, 50);//if doesnt have values will give you error
	}

	// user defined method without a parameters
	//(when no values en () after method name--
	// will not work without the main method call it to work
	public static void sample() {
		System.out.println("Hello world");
	}
	
	public static void hello() {
		System.out.println("Hello today we are learning methods");
	}
	
	public static void sum() {
		int a = 5;
		int b = 10;
		System.out.println(a + b);
	}
	// methods with parameters
	// we made it once but called it twice by changing the parameters
	
	public static void add(int a, int b) {
		System.out.println(a+b);
	}
	
}
