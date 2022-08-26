package java_data_types;


public class Day16_Student_Child_Inheritance extends Day16_Faculty_Parent_Inheritance {

	int bonus = 2000;
	
	public static void main(String[] args) {

		Day16_Student_Child_Inheritance  a = new Day16_Student_Child_Inheritance();
		System.out.println(a.salary);
		System.out.println(a.bonus);
		a.hello();
	}

}
