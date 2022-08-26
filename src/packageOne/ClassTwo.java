package packageOne;

class ClassFour {		//subclass--public
	public int a4 = 50;
	private int b4 = 80;
}

public class ClassTwo {
public int a2 = 20;

	
public static void main(String[] args) {
	ClassOne c2 = new ClassOne();//public
	c2.methodOne();
	System.out.println(c2.a1);
	
	//c2.methodFour();--this method is not accessible cause its private
	//System.out.println(c2.b1);--variable not accessible cause its private
	
	ClassOne c1 = new ClassOne();
	c1.methodSeven();
	System.out.println(c1.c1);//default
	
}	

public static void methodTwo() {
		System.out.println("this is method 2.");//public method
	}

}
