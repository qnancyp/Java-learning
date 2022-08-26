package java_data_types;

public class Day12_MoreReturnMethods {

	public static void main(String[] args) {
		int sum = task();//95
		if (sum%2==0) {
			System.out.println("The sum is even");
		}else {
			System.out.println("The sum is odd");
		}

		
		int sum2 = task2(4,3);//7
		System.out.println(sum2);
		
		boolean a = isRaining();
		System.out.println(a);
	}
	
	// non void method without parameters
	// write a method which is going to return the sum of 2 values
	// which is a=5 b=90 if the mod is 0 we can print the sum is even number
	// if we need a return do not use void//
	//this example is static
	public static int task() {
		int a = 5;
		int b = 90;
		int sum = a + b;
		return sum;	
	}
	
	//this example is dynamic = parameters 
	public static int task2 (int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	//boolean
	public static boolean isRaining() {
		return true;
	}
}
