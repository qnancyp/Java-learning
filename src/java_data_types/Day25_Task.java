package java_data_types;

public class Day25_Task {

	public static void main(String[] args) {
		
		String sentence = "Th is is my cra zy sen ten ce";
		System.out.println(task1(sentence));
		
		String characters = "This4321**is**my1234CRAzy&&senTENce&";
		System.out.println(task2(characters));
		
		task3();
		
		//********
		//waqas examples
		System.out.println(noSpaceSentence("Create a method that will take 1 String method as a parameter)"));
		System.out.println(returnNumberofCharacters("1234567890ahbjshdjsdbASYFEUYUWE^%$#@$%!"));
		
		String a = "Today is a good day. It is Thursday. We have a Java class. How would you find out how many sentences.";
		String[] sen = a.split("\\.");
		System.out.println(sen.length);

	}
	

	
	public static String task1 (String sentence) {
		sentence = sentence.replaceAll(" " , "");
		return sentence;
	}
	
	public static int task2 (String characters) {
		characters = characters.replaceAll("[A-Za-z0-9]", "");
		return characters.length();
	}
	
	public static void task3 () {
		String a = "This is a good day for learning. It is indeed.";
		String[] strings = a.split("\\. ");
		System.out.println(strings.length);
	System.out.println("**************");
	}
	
	//waqas example
	public static String noSpaceSentence (String sentence) {
		return sentence.replaceAll(" ", " ");
	}
	
	public static int returnNumberofCharacters (String words) {
		String specialCharacters = words.replaceAll("[A-Za-z0-9]", "");
		int specialCharacterCount = specialCharacters.length();
		return specialCharacterCount;
	}
		
		
		
		
	
	
		

}
