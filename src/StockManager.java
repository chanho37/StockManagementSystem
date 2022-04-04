import java.util.Scanner;

public class StockManager {
	Stock stock;
	Scanner input;
	
	StockManager(Scanner input) {
		this.input = input;
	}
	
	public void addstock() {
	    stock = new Stock();
	    System.out.println("Write a Stock Code");
		stock.name = input.nextInt();
	    System.out.println("how many stock did you get?");
		stock.stnumber = input.nextInt();
		System.out.println("Write a Price");
		stock.price = input.nextInt();
		System.out.println("Write a End date");
		stock.enddate = input.nextInt();
	}

	public void delectstock() {
		System.out.println("Write a Stock Code");
		int name = input.nextInt();
		if(stock == null) {
			System.out.println("the student has not been registered");
			return;
		}
		if(stock.name == name) {
			stock = null;
			System.out.println("The stock is deleted");
		}
	}

	public void editstock( ) {
		System.out.println("Write a Stock Code");
		int name = input.nextInt();
		if(stock.name == name) {
			System.out.println("The stock to be edited is " + name );
		}
		
	}

	public void viewstock( ) {
		System.out.println("Write a Stock Code");
		int name = input.nextInt();
		if(stock.name == name) {
			stock.printInfo();
		}
	}

}
