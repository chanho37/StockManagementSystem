package manager;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import stock.BusanStock;
import stock.ChangwonStock;
import stock.MasanStock;
import stock.Stock;
import stock.StockInput;
import stock.Stockkind;

public class StockManager implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5521071126590810078L;
	ArrayList<StockInput> stocks = new ArrayList<StockInput>();
	transient Scanner input;
	StockManager(Scanner input) {
		this.input = input;
	}
	
	public void addstock(String Name, String STNumber, String Price, String phone) {
		StockInput stockInput = new MasanStock(Stockkind.Masan);
		stockInput.getUserInput(input);
		stocks.add(stockInput);
	}
	
	public void addstock(StockInput stockInput) {
		stocks.add(stockInput);
	}
	
	public void addstock() {
		
		int kind = 0;
		StockInput stockInput;
		while(kind < 1 || kind > 2) {
			try {
			System.out.println("go into add stocks in while");
			System.out.println("1 for Masan");
			System.out.println("2 for Busan");
			System.out.println("3 for Changwon");
			System.out.print("Select num 1, 2, or 3 for Stock area: ");
			kind = input.nextInt();
			if(kind == 1){
				stockInput = new MasanStock(Stockkind.Masan);
				stockInput.getUserInput(input);
				stocks.add(stockInput);
				break;
			}
			else if(kind == 2) {
				stockInput = new BusanStock(Stockkind.Busan);
				stockInput.getUserInput(input);
				stocks.add(stockInput);
				break;
			}
			else if(kind == 3) {
				stockInput = new ChangwonStock(Stockkind.Changwon);
				stockInput.getUserInput(input);
				stocks.add(stockInput);
				break;
			}
			else {
				System.out.print("Select num for Stock area between 1 and 2: ");
			}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 3!");
				if(input.hasNext()) {
					input.next();
				}
				kind = -1;
			}
		}
	}

	public void deletestock() {
		System.out.println("Write a Stock Code");
		int name = input.nextInt();
		int index = findIndex(name);
		removerfromStocks(index, name);
	}
	
	public int findIndex(int name) {
		int index = -1;
		for(int i = 0; i<stocks.size();i++) {
			if(stocks.get(i).getName() == name) {
				index = i;
				break;
			}	
		}
		return index;
	}
	
	public int removerfromStocks(int index, int name) {
		if(index >= 0) {
			stocks.remove(index);
			System.out.println("the stock " + name + "is deleted");
			return 1;
		}
		
		else {
			System.out.println("the student has not been registered");
			return -1;
		}
	}

	public void editstock( ) {
		System.out.println("Write a Stock Code");
		int name = input.nextInt();
		for(int i = 0; i<stocks.size();i++) {
			StockInput stock = stocks.get(i);
			if(stock.getName() == name) {
				int number = -1;
				while( number != 5 ) {
					showEditMenu();
					number = input.nextInt();
					switch(number) {
					case 1:
						stock.setStockName(input);
						break;
					case 2:
						stock.setStockNumber(input);
						break;
					case 3:
						stock.setStockPrice(input);
						break;
					case 4:
						stock.setStockEnddate(input);
						break;
					default:
						continue;
					}
				}
				break;
			}
		}

	}

	public void viewstocks( ) {
//		System.out.println("Write a Stock Code");
//		int name = input.nextInt();
		System.out.println("# of registered stock : " + stocks.size());
		for(int i = 0; i<stocks.size();i++) {
			stocks.get(i).printInfo();
		}
	}
	
	public int size() {
		return stocks.size();
	}
	
	public StockInput get(int index) {
		return (Stock) stocks.get(index);
	}
	
	public void showEditMenu() {
		System.out.println(" $$ Stock Info Edit System $$");
		System.out.println("      1. Edit name ");
		System.out.println("      2. Edit stock number");
		System.out.println("      3. Edit price ");
		System.out.println("      4. Edit End date ");
		System.out.println("      5. Exit ");
		System.out.println("(011 : Bread 012 : snack 013 : drink)");
		System.out.print("Select one number between 1 - 5 : ");
	}

}
