package java_data_types;

import java.util.Scanner;

public class Day07_ForLoop_ScannerClass_IFelse_UsingInt {

	public static void main(String[] args) {
		for (int i=0; i<=2; i++) {
			Scanner MonthInput = new Scanner(System.in);
			System.out.println("Choose 1 if born in the months of : January, February, March.");
			System.out.println("Choose 2 if born in the months of : April, May, June.") ;
			System.out.println("Choose 3 if born in the months of : July, August, September.");
			System.out.println("Choose 4 if born in the months of : October, November, December.");
			int  monthValue = MonthInput.nextInt();
			if (monthValue == 1){
					System.out.println("You were born in Winter.");
			} if (monthValue == 2) {
				System.out.println("You were born in Spring.");
			}else if (monthValue == 3) {
				System.out.println("You were born in Summer.");
			}else if (monthValue == 4) {
				System.out.println("You were born in Fall.");
			}
		}


	}

}
