package java_data_types;

public class Day23_Strings {

	public static void main(String[] args) {
		
		String topic = new String ("What is the topic we are learning today ?");
		int len = topic.length();
		System.out.println(len);
		
		String name = "JOHN";
		String lastname = "King";
		System.out.println("This will print the length of the name variable : "+ name.length());
		System.out.println("This will print the name variable : "+ name); //JOHN
		
		String lowerName = name.toLowerCase();
		System.out.println("This will convert the name variable to lowecase :" + lowerName);//john
		
		System.out.println(topic.toUpperCase());
		
		System.out.println("Using equalsignorecase :"+ name.equalsIgnoreCase(lastname));
		System.out.println("Using equals method :"+ name.equals(lastname));
		
		System.out.println(name.compareTo(lastname));
		System.out.println(name.compareToIgnoreCase(lastname));
		//task
		String name1 = "Nancy";
		String lastName1 = "Perla";
		int n = name1.compareTo(lastName1);
		if (n < 0) {
			System.out.println(name1 + " is higher than " +lastName1 );
		}else if (n == 0) {
			System.out.println(name1 + " is equal to "+ lastName1);
			
		}else if (n > 0) {
			System.out.println(name1 + " is less than "+ lastName1);
		}
		
			System.out.println(name1.compareToIgnoreCase(lastName1));
			
		
			
		 
		
		
		
		}

}
