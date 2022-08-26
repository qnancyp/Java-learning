package java_data_types;

class Phone1 {
	String make = "Apple"; //parent
	String color = "Black";
	
	void Hello()  {
		System.out.println("This method is in parent class");
	}
	}

class smartPhone extends Phone1 {
	String make = "Samsung"; //child
	String color = "yellow";
	void Hello() {
		System.out.println("This method is in child class");
	}
	
	void displayChildMake() {
		super.Hello();//not overriding cause accessing parent with super()
		System.out.println("The phone is "+make);
		System.out.println("The color is "+color);
	}
	
	void displayParentMembers() {
		System.out.println("This will print parent members :"+super.make);
		System.out.println("This will print the  parent color "+super.color);
	}
}




public class Day19_Super {

	public static void main(String[] args) {
		smartPhone a = new smartPhone();
		a.displayChildMake();
		a.displayParentMembers();

	}

}
