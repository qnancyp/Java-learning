package java_data_types;

class Phone2 {
	Phone2(){
		System.out.println("This is phone constructor");
	}
	Phone2(String name) {
		System.out.println("This is parameterized constructor "+name);
	}
}

class smartPhone1 extends Phone2 {
	smartPhone1() {
		super("John");//redundant
		System.out.println("This is a smart phone constructor");
	}
}

public class Day19_Super_Method {

	public static void main(String[] args) {
		smartPhone1 a = new smartPhone1();

	}

}
