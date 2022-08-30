package java_data_types;

public class Day27_Exception2 {

	public static void main(String[] args) {
		
		try {
		int a = 6/2;
		System.out.println(a);
		
		String b = "hello";
		System.out.println(b.length());
		
		int[] c = new int[2];
		c[0] = 1;
		c[1] = 200;
		c[2] = 300;
		System.out.println(c[1]);
		
		} catch (ArithmeticException e) {//child class of exception
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}catch (Exception e) {//parent exception always at the end
			e.printStackTrace();
		}
		
		
		
		
		
	
	
		
}

}
