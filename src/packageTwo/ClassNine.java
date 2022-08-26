package packageTwo;

import packageOne.ClassSix;//created an inheritance and therefore it imports
							//protected class needs inheritance to access from different package
public class ClassNine extends ClassSix{

	public static void main(String[] args) {
		ClassSix c6 = new ClassSix();
		c6.methodNine();

	}

}
