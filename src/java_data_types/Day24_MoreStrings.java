package java_data_types;

public class Day24_MoreStrings {

	public static void main(String[] args) {
		//concat()
		String fname = "Nancy";
		String lname = "Perla";
		String fullname = fname.concat(lname);

		System.out.println(fullname);
		
		// trim()
		String day = "  Today we are learning Strings  ";
		System.out.println("Before using trim :"+ day);
		
		day = day.trim();
		System.out.println("After using trim :"+ day);
		
		if (day.equals("Today we are learning Strings")) {
			System.out.println("Yayy, the string value matched.");
		} else {
			System.out.println("The value does not match");
		}
		// it works because it trims the extra spaces at beginning and end
		
		//boolean startsWith
		String transaction = "$50.00";
		boolean dollarSymbol = transaction.startsWith("$");
		if (dollarSymbol) {
			System.out.println("The prefix is present");
		}else {
			System.out.println("It is not present");
		}
		
		//using variable day form top
		System.out.println(day.startsWith("Today"));//true
		//boolean endsWith
		//using variable String day from the top
		boolean stringPresent = day.endsWith("Strings");
		System.out.println(stringPresent); // true
		
		//char charAt
		char ret = transaction.charAt(0);
		System.out.println(ret);
		
		//int indexOf
		System.out.println(transaction.indexOf('5'));
		String email = "Hello123@gmail.com";
		System.out.println(email.indexOf('@'));
		
		//string subString
		//this will go to index 8 -only one ()-until the end
		System.out.println(email.substring(8));
		//with two arguments--similar to overloading concept
		System.out.println(email.substring(0, 8));
		
		//string replace
		String title = "Welcome to the Car dealer$hip";
		System.out.println(title);
		title = title.replace("$", "s");
		System.out.println(title);

		
		}

}
