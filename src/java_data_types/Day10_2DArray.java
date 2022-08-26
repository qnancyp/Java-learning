package java_data_types;

public class Day10_2DArray {

	public static void main(String[] args) {

		String[][] countries = new String[2][2];
		countries[0][0] = "USA";
		countries[0][1] = "Canada";
		countries[1][0] = "Switzerland";
		countries[1][1] = "France";

		System.out.println(countries[1][1]);
		System.out.println(countries[1][0]);
		
		//my example [4] rows [2] columns
		int[][] week_salary = new int[4][2];
		week_salary[0][0] = 800;
		week_salary[0][1] = 600;
		week_salary[1][0] = 300;
		week_salary[1][1] = 700;
		week_salary[2][0] = 800;
		week_salary[2][1] = 200;
		week_salary[3][0] = 100;
		week_salary[3][1] = 900;

		System.out.println(week_salary[2][0]);
		//
		// String[][] _countries = {"USA", "Canada", "France", "Switzerland", "Germany", "England"};
		//the above line will not work for 2d Arrays, the bottom will.
		String[][] _countries = {
				 {"USA","Canada"},
					{"France", "Switzerland"} ,
					{"Germany", "England"}
					};
		System.out.println(_countries[1][1]);
		System.out.println(_countries[2][1]);
		
		//my example
		int[][]_week_salary = {
				{800, 600},
				{300, 700},
				{800, 200},
				{100, 900}
				};
		System.out.println(_week_salary[2][0]);
		
		// to print all values by rows in countries 2nd example 3 rows 2 column
		System.out.println(_countries.length);//count of rows
		System.out.println(_countries[0].length);//count of column
						//_countries[rows].length---gives you a dynamic count of rows in en caso de changes in rows
		
		
		for (int rows=0; rows < _countries.length; rows++) {
			for (int column = 0; column < _countries[rows].length; column++) {
				System.out.println(_countries[rows][column]);
			}
		}
		// my example of salary
		for (int rows=0; rows <_week_salary.length; rows++) {
			for (int column = 0; column < _week_salary[rows].length; column++) {
				System.out.println(_week_salary[rows][column]);
			}
		}
		

	}

}
