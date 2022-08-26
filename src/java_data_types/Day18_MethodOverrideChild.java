package java_data_types;

public class Day18_MethodOverrideChild extends Day18_MehodOverrideParent {

	public static void main(String[] args) {
		
		Day18_MethodOverrideChild a = new Day18_MethodOverrideChild();
		a.openbrowser();
		a.closeBrowser();
		
	}
	public void openbrowser( ) {
		System.out.println("Open firefox browser");
		System.out.println("Visit the website");
		System.out.println("Enter username");
		System.out.println("Enter password");
		System.out.println("Click the login button");
	}

}
