package java_data_types;

public class Day15_Instance_GlobalVariable {
//Global variable
	String environment = "qa.codegator.us";
	String username = "test@gmail.com";
	String phone = "Iphone";
	String color = "black";
	static int memory = 32;

	public static void main(String[] args) {
		Day15_Instance_GlobalVariable day01 = new Day15_Instance_GlobalVariable();
		System.out.println(day01);

		Day15_Instance_GlobalVariable day02 = new Day15_Instance_GlobalVariable();

		Day15_Instance_GlobalVariable johnPhone = new Day15_Instance_GlobalVariable();
		System.out.println(johnPhone.phone);//i phone
		System.out.println(johnPhone.color);//black
		System.out.println(johnPhone.memory);//32
		
		
		
		Day15_Instance_GlobalVariable stevePhone = new Day15_Instance_GlobalVariable();
		stevePhone.phone = "Iphone13";//instance of the global variable
		stevePhone.color = "Red";
		stevePhone.phone = "Iphone14";
		stevePhone.memory = 64;
		System.out.println(stevePhone.phone);//i phone 14
		System.out.println(stevePhone.color);//red
		System.out.println(stevePhone.memory);//64
		

		Day15_Instance_GlobalVariable mikePhone = new Day15_Instance_GlobalVariable();
		System.out.println(mikePhone.phone); //default i phone
		System.out.println(mikePhone.color); //default black
		System.out.println(mikePhone.memory); //64-static variable once updated prints new value not old-- overall updates the memory
		
		Day15_Instance_GlobalVariable vinPhone = new Day15_Instance_GlobalVariable();
		vinPhone.possible();//access instance from another method 

	}

	public static void possible() {
		Day15_Instance_GlobalVariable vinPhone = new Day15_Instance_GlobalVariable();
		vinPhone.phone = "Iphone 12";
		vinPhone.color = "Grey";
		System.out.println(vinPhone.phone);//i phone
		System.out.println(vinPhone.color);//black
		System.out.println(vinPhone.memory);// 64 the value was updated.
	}
}
