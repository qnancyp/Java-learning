package java_data_types;

public class Day05_SwitchCase {

	public static void main(String[] args) {
		// starts here
		String day = "january";

		switch (day) {

		case "monday":
			System.out.println("1st day of the week");
			break;
		case "tuesday":
			System.out.println("2nd day of the week");
			break;
		case "wednesday":
			System.out.println("3rd day of the week");
			break;
		case "thursday":
			System.out.println("4th day of the week");
			break;
		case "friday":
			System.out.println("5th day of the week");
			break;
		case "saturday":
			System.out.println("6th day of the week");
			break;
		case "sunday":
			System.out.println("7th day of the week");
			break;
		default:
			System.out.println("You have entered an invalid day.");
		}
// ends here 
		int age = 4;
		switch (age) {
		case 1:
			System.out.println("the value is 1");
			break;
		case 2:
			System.out.println("the value is 2");
			break;
		case 3:
			System.out.println("the value is 3");
			break;
		case 4:
			System.out.println("the value is 4");
			break;
		case 5:
			System.out.println("the value is 5");
			break;
		default:
			System.out.println("the value is something else");
		}
		// ends here
		String red_meat = "fish";

		switch (red_meat) {

		case "beef":
			System.out.println("Beef is a type of red meat.");
			break;
		case "lamb":
			System.out.println("Lamb is a type of red meat.");
			break;
		case "veal":
			System.out.println("Veal is a type of red meat.");
			break;
		case "venison":
			System.out.println("Venison is a type of red meat.");
			break;
		case "goat":
			System.out.println("Goat is a type of red meat.");
			break;
		case "mutton":
			System.out.println("Mutton is a type of red meat.");
			break;
		case "pork":
			System.out.println("Pork is a type of red meat.");
			break;
		default:
			System.out.println("This is not a red meat type.");
		}
		// ends here
		

	}

}
