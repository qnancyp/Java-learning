package java_data_types;

public class Day16_SingleInheritance_Task_Parent {
	
	public  static void main (String[] args) { 
		
		parent_task();
	}
	public static void parent_task() {				//this example is not good, follow the Car and ChildCars example
		String color = "blue";
		boolean sedan = true;
		int year = 2021;
		String type = "used";
		String model = "Sedan";
	
		System.out.println(color);
		System.out.println(sedan);
		System.out.println(year);
		System.out.println(type);
		System.out.println(model);
		
		
	}
		
	

}
