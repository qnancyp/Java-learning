package packageOne;

import packageTwo.ClassThree;

public class ClassOne {
public int a1 = 10;
private int b1 = 20;
int c1 = 90;//considered default
	
	public static void main(String[] args) {
	ClassOne c1 = new ClassOne();//public
	c1.methodOne();
	System.out.println(c1.a1);
	
	ClassFour c4 = new ClassFour();//public--subclass
	System.out.println(c4.a4);
	
	
	ClassThree c3 = new ClassThree();//public imported cause is in packageTwo
	c3.methodThree();
	System.out.println(c3.a3);
	
	c1.methodFour();
	System.out.println(c1.b1);//private
	
	//ClassFour c4 = new ClassFour(); subclass
	//System.out.println(c4.b4);--variable is not visible cause its private
	
	//ClassThree c3 = new ClassThree();
	//c3.methodFive(); not visible cause its private
	//System.out.println(c3.b3); not visible cause its private
	
	
	//default
	//ClassOne c1 = new ClassOne();
	c1.methodSeven();
	System.out.println(c1.c1);
	
	//default in packageTwo
	//ClassThree c3 = new ClassThree();
	//c3.methodEight(c3.c3);//- is not accessible cause it is default in another package 
	// both method and variable are in packageTwo so no access in a different
	// different package--default will access only within same package same class
	
	}

	
	public static void methodOne() {
		System.out.println("This is method 1");//public method
	}
	private static void methodFour() {
		System.out.println("This is method 4");//private method
	}
	static void methodSeven() {
		System.out.println("This is method Seven");//default method
	}
	
}
