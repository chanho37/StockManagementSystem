import java.util.Scanner;

public class MenuManager {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = 5;
		
		while( number != 6 ) {
		System.out.println(" $$ Stock Management System $$");
		System.out.println("      1. Add Stock ");
		System.out.println("      2. Delect Stock ");
		System.out.println("      3. Edit Stock ");
		System.out.println("      4. View Stock ");
		System.out.println("      5. Show Menu ");
		System.out.println("      6. Exit ");
		System.out.print("Select one number between 1 - 6 : ");
	    number = input.nextInt();
		
		if( number == 1) {
			addstock();
		}
		else if( number == 2) {
			delectstock();
		}
		else if( number == 3 ) {
			editstock();
		}
		else if(number == 4 ) {
			viewstock();
		}
		else {
			continue;
		}
	}
}

public static void addstock() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Write a name");
		String name = input.next();
		System.out.println("Write a number");
		int stnumber = input.nextInt();
		System.out.println("Write a Price");
		int price = input.nextInt();
		System.out.println("Write a End date");
		int enddate = input.nextInt();
}

public static void delectstock() {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Write a name");
	String name = input.next();
	System.out.println("How many stock are you delete?");
	int stnumber = input.nextInt();
}

public static void editstock( ) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Write a name");
	String name = input.next();
	System.out.println("Rewrite a price");
	int stnumber = input.nextInt();
	
}

public static void viewstock( ) {
Scanner input = new Scanner(System.in);
	
	System.out.println("Write a name");
	String name = input.next();
}
}