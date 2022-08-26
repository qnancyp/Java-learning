package packageOne;

class ClassSeven {	//this is subclass always in default mode never public
	protected int a = 10;
	
	protected static void methodTen() {
		System.out.println("This is method 10");
	}
}

public class ClassSix {//public class

	public static void main(String[] args) {
		

	}

	protected static void methodNine() {
		System.out.println("This is method 9");//protected method
	}
	
}
