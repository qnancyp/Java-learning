package java_data_types;

public class Day04_NestedIf_Example2 {

	public static void main(String[] args) {
		// if the person's age is less than 18, he can apply for learner
		// and if the age is greater than 18 then he can apply for driving license
		// if the age is greater than 21 he can start working
		// if age is greater than 64 he is ready to retire
		
		
		int age = 25;
		String name = "John";
		
		if (age < 18) {
			System.out.println(name + " can apply for learner's permit.");
		}else {
			System.out.println(name + " is greater than age 18, He can applu for driving license");
			if (age < 21) {
				System.out.println(name + " is less than 21. You are not ready to work");
			}else {
				System.out.println(name + " is greater than 21. You can star work" );
				if (age < 65) {
					System.out.println(name + " can continue to work");
				}else {
					System.out.println(name + " is ready to retire");
				}
			}
		}
		

		int score = 75;
		if (score >= 90) {
			System.out.println("score is A");
		}else {
			System.out.println("score is less than 90");
			if (score  >= 80) {
				System.out.println("score is B");
			}else {
				System.out.println("score is less than 80" );
				if (score >= 70) {
					System.out.println("score is C");
				}else {
					System.out.println("score is less than 70");
				}
			}
		}
		
			

	}

}
