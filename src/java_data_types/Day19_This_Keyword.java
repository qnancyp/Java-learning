package java_data_types;

public class Day19_This_Keyword {
	
	int rollNum;
	String name;
	float fee;
	
	Day19_This_Keyword() {
		System.out.println("Hello this is a default constructor");
	}
	Day19_This_Keyword(int rollNum) {
		this();
		System.out.println("This is a 1 parameter constructor" +rollNum);
	}
	
	Day19_This_Keyword(int rollNum, String name, float fee) {
		//can be used to invoke the current class constructor.
		this(33333);
		this.rollNum = rollNum;
		this.name = name;
		this.fee = fee;
	}
	
	
	void displayData() {
		System.out.println("Roll num :" +rollNum);
		System.out.println("Name :" +name);
		System.out.println("Fee :" +fee);
	}

}
