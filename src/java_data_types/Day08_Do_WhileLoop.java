package java_data_types;

public class Day08_Do_WhileLoop {

	public static void main(String[] args) {
		//true condition
		int a = 0;
		do {
			System.out.println("Hello");
			a++;
		} while(a < 5);
		// false condition
		int b = 10;
		do {
			System.out.println("Hello");
			b++;
		} while(b < 5);
		// using break
		int c = 0;
		do {
			System.out.println("Hello");
			if (a==5) {
				System.out.println("The value of a is 5");
				break;
			}
			c++;
		} while(c <= 15);
		//do while loop will run at least once when condition is false
		//ex. if int c == 20 then while c <=15 is false so hello will print
		//if condition is true like example above 
		//if block is a separate code from do while loop
	
	}

}
