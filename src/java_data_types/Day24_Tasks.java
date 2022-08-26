package java_data_types;

public class Day24_Tasks {

	public static void main(String[] args) {
		String str1 = new String ("actualValue");
		String str2 = new String ("expectedValue");
		if (str1.equals(str2)) {
			System.out.println("values equal");
		} else {
			System.out.println("The values do not match");
		}
		
		month();
		day();
		
		// waqas examples
		taskOne("Hello");
		taskTwo("abcdefgh");
		System.out.println(taskThree("Waqas", "Khan"));
		
	}
	public static void month () {
		String name = "March";
		System.out.println(name);
		int name_lenght = name.length();
		int middle = name_lenght/2;
		System.out.println(middle);
		System.out.println(name.substring(middle, middle+1));	
		
		if (name.length()% 2 == 0) {
			System.out.println("Month is even");
		} else if (name.length() % 2 ==1) {
			System.out.println("Month is odd");
		}
		if (name.length() % 2 ==1) {
			System.out.println((name.substring(middle, middle+1)));
		}
	}
	
	public static void day () {
		String day = "Monday";
		System.out.println(day);
		int day_length = day.length();
		int middle2 = day_length/2 - 1;
		System.out.println(middle2);
		System.out.println(day.substring(middle2, middle2));
		
		if (day.length()% 2 == 0) {
			System.out.println("day is even");
		} else if (day.length() % 2 ==1) {
			System.out.println("day is odd");
		}
		if (day.length() % 2 ==0) {
			System.out.println((day.substring(middle2, middle2+2)));
		}
	}
	//this is waqas example it is correct
	public static void taskOne(String word) {
		
		int wordLength = word.length();
		if (wordLength >=3) {
			if (wordLength % 2 == 1) {
				int center = wordLength / 2;
				System.out.println(word.substring(center, center + 1));
			}
			
		}
		}
	
	public static void taskTwo(String word) {
		
		int wordLength = word.length();
		if (wordLength >=5) {
			if (wordLength % 2 == 0) {
				int center = wordLength / 2;
				System.out.println(word.substring(center - 1, center + 1));
			}
			
		}
		}
	
	public static boolean taskThree(String valueOne, String valueTwo) {
		return valueOne.equals(valueTwo);
	}
	
	
	
	

}
