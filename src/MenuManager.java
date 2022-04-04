import java.util.Scanner;

public class MenuManager {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StockManager stockmanager = new StockManager(input);
		int number = -1;
		while( number != 5 ) {
		System.out.println(" $$ Stock Management System $$");
		System.out.println("      1. Add Stock ");
		System.out.println("      2. Delect Stock ");
		System.out.println("      3. Edit Stock ");
		System.out.println("      4. View Stock ");
		System.out.println("      5. Exit ");
		System.out.println("(011 : Bread 012 : snack 013 : drink)");
		System.out.print("Select one number between 1 - 5 : ");
	    number = input.nextInt();
		
		if( number == 1) {
			stockmanager.addstock();
		}
		else if( number == 2) {
			stockmanager.delectstock();
		}
		else if( number == 3 ) {
			stockmanager.editstock();
		}
		else if(number == 4 ) {
			stockmanager.viewstock();
		}
		else {
			continue;
		}
		}
	}
}