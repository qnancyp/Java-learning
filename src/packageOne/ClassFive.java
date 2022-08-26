package packageOne;

public class ClassFive {

	public static void main(String[] args) {
		ClassSeven c7 = new ClassSeven();//object of class of ClassSeven present in ClassFive
		c7.methodTen();
		System.out.println(c7.a);//this shows we can access protected within same package
								// even it is in different class
	}

}
