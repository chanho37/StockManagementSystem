import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StockManager stockmanager = new StockManager(input);
		
		selectMenu(input,stockmanager);
	}

	public static void selectMenu(Scanner input, StockManager stockmanager ) {	 
		int number = -1;
		while( number != 5 ) {
			try {
				showMenu();
				number = input.nextInt();
				switch(number) {
				case 1:
					stockmanager.addstock();
					break;
				case 2:
					stockmanager.delectstock();
					break;
				case 3:
					stockmanager.editstock();
					break;
				case 4:
					stockmanager.viewstocks();
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if(input.hasNext()) {
					input.next();
				}
				number = -1;
			}
		}
	}

	public static void showMenu() {
		System.out.println(" $$ Stock Management System $$");
		System.out.println("      1. Add Stock ");
		System.out.println("      2. Delect Stock ");
		System.out.println("      3. Edit Stock ");
		System.out.println("      4. View Stocks ");
		System.out.println("      5. Exit ");
		System.out.println("(011 : Bread 012 : snack 013 : drink)");
		System.out.print(" Select one number between 1 - 5 : ");
	}
}