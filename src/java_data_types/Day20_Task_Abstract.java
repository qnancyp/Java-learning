package java_data_types;

abstract class Recipe {
	abstract void meat_recipe();
	abstract void sauce_recipe();
}
abstract class Chicken_Alfredo extends Recipe {
	abstract void ingredients();
}
class Meal extends Chicken_Alfredo {
	void meat_recipe() {
		System.out.println("This is meat_recipe method");
	}
	void sauce_recipe() {
		System.out.println("This is sauce_recipe method");
	}
	void ingredients() {
		System.out.println("This is ingredients method");
	}
}
public class Day20_Task_Abstract {
	public static void main(String[] args) {
		Meal Yum = new Meal();
		Yum.meat_recipe();
		Yum.sauce_recipe();
		Yum.ingredients();
	}
}
