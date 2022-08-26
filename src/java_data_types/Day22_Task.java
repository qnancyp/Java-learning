package java_data_types;

abstract class Shape {
	public abstract int RectangleArea(int length, int width);
	public abstract int SquareArea(int side);
	public abstract double CircleArea(double r);
}

class Area extends Shape {
	 public int RectangleArea(int length , int width) {
		int r = (length * width);
		return r;
	}
	 public int SquareArea(int side) {
		 int s = (side * 4);
		 return s;
	 }
	public double CircleArea(double r) {
		double c = (2 * 3.14 * r);
		return c;	
	}
}
	// second task
	abstract class  Bank {
		public abstract int getBalance();
		int balance;
	}
	
	class BankA extends Bank {
		public int getBalance() {
			return balance;
		}
		public void setBalance(int balance) {
			this.balance = 100;
			}
		
	}

	





public class Day22_Task {

	public static void main(String[] args) {
		
		Area aa = new Area();
		//aa.RectangleArea(6, 4);
		System.out.println("The area of rectangle is :"+ aa.RectangleArea(6, 4));
		//aa.SquareArea(5);
		System.out.println("The area of square is :"+ aa.SquareArea(5));
		//aa.CircleArea(2.5);
		System.out.println("The area of circle is :"+ aa.CircleArea(2.5));
	
		
	Bank a = new BankA();
	a.getBalance();
	System.out.println("The balance is :"+a.getBalance());
	
	
	
	}

}
