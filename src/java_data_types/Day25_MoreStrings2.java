package java_data_types;

public class Day25_MoreStrings2 {

	public static void main(String[] args) {
		
		String name = "Hello World";
		char[] characters = name.toCharArray();//{'H', 'e', 'l',....
		System.out.println(characters.length);
	
	    for (int i=0; i<characters.length; i++) {
	    	System.out.println(characters[i]);
	    }
	    
	    String sentence = "Hello today we are learning more strings.";
	   //make sure to leave space in between" "
	    String[] words = sentence.split(" ");//{'Hello', 'today',...
	   
	    for (int i=0; i<words.length; i++) {
	    	System.out.println(words[i]);
	    }
	    //task convert the above sentence into char
	    
	    String sentence2 = "This is my sentence";
	    String[] words2 = sentence2.split(" ");
		for (int i=0; i<words2.length; i++) {
			System.out.println(words2[i]);
		}
		
		//waqas correct way...continuing with sentence
		for (int i=0; i<words.length; i++) {
			String word = words[i];
			char[] characs = word.toCharArray();
			for (int j = 0; j<characs.length; j++) {
				System.out.println(characs[j]);
			}
			System.out.println("**************");
		}
		
		//using waqas way for my sentence
		for (int i=0; i<words2.length; i++) {
			String palabras = words2[i];
			char[] letras = palabras.toCharArray();
			for (int x = 0; x<letras.length; x++) {
				System.out.println(letras[x]);
			}
			System.out.println("***********");
		}
		
	
	}

}
