package java_data_types;

public class Day22_Encapsulation {

	public static void main(String[] args) {
								//put values in this parenthesis when using constructor
		Day22_Employee_Information a = new Day22_Employee_Information("Waqas", 111, true);
		//a.setName("Waqas");
		System.out.println(a.getName());
		
		//a.setSsn(11111111);		// do not use with constructor
		System.out.println(a.getSsn());
		
		//a.setGraduated(true);
		System.out.println(a.getGraduated());
	
	}

}
