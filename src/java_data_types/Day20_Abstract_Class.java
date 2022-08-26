package java_data_types;

abstract class Furniture {			//because there is abstract undefined method (only declared not defined), class also abstract
	abstract void color();
	abstract void material();
	abstract void weight();
}
abstract class chair extends Furniture {		//because there is abstract method must have abstract class,has both defined and undefined methods
	void color() {
		System.out.println("This is a color method");	//also extended
	}
	void material() {
		System.out.println("This is a material method");  //abstract class cannot create object
	}
	abstract void dimension();//undefined
}
class brand extends chair {			//abstract class need to be extended and methods implemented
	void dimension() {
		System.out.println("This is a dimension method");
	}
	void weight() {
		System.out.println("This is a weight method");
	}
}

public class Day20_Abstract_Class {

	public static void main(String[] args) { 
		//indirect object parent object = child
		chair a = new brand();
		a.color();
		a.dimension();
		// the above not really used
		//creating a direct object
		brand b = new brand();  //object of the brand class which extends chair, furniture
		b.color();
		b.dimension();
		b.weight();
		b.material();

	}

}
