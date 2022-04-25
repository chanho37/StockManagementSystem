import java.util.ArrayList;
import java.util.Scanner;

import stock.BusanStock;
import stock.Stock;

public class StockManager {
	ArrayList<Stock> stocks = new ArrayList<Stock>();
	Scanner input;
	StockManager(Scanner input) {
		this.input = input;
	}
	
	public void addstock() {
		int kind = 0;
		Stock stock;
		while(kind != 1 && kind != 2) {
			System.out.print("1 for Masan");
			System.out.print("2 for Busan");
			System.out.print("Select num for Stock area between 1 and 2: ");
			kind = input.nextInt();
			if(kind == 1){
				stock = new Stock();
				stock.getUserInput(input);
				stocks.add(stock);
				break;
			}
			else if(kind == 2) {
				stock = new BusanStock();
				stock.getUserInput(input);
				stocks.add(stock);
				break;
			}
			else {
				System.out.print("Select num for Stock area between 1 and 2: ");
			}
		}
	}

	public void delectstock() {
		System.out.println("Write a Stock Code");
		int name = input.nextInt();
		int index = -1;
		for(int i = 0; i<stocks.size();i++) {
			if(stocks.get(i).getName() == name) {
				index = i;
				break;
			}	
		}
		
		if(index >= 0) {
			stocks.remove(index);
			System.out.println("the stock " + name + "is deleted");
		}
		
		else {
			System.out.println("the student has not been registered");
			return;
		}
	}

	public void editstock( ) {
		System.out.println("Write a Stock Code");
		int name = input.nextInt();
		for(int i = 0; i<stocks.size();i++) {
			Stock stock = stocks.get(i);
			if(stock.getName() == name) {
				int number = -1;
				while( number != 5 ) {
					System.out.println(" $$ Stock Info Edit System $$");
					System.out.println("      1. Edit name ");
					System.out.println("      2. Edit stock number");
					System.out.println("      3. Edit price ");
					System.out.println("      4. Edit End date ");
					System.out.println("      5. Exit ");
					System.out.println("(011 : Bread 012 : snack 013 : drink)");
					System.out.print("Select one number between 1 - 5 : ");
					number = input.nextInt();

					if( number == 1) {
						System.out.print("Stock name : ");
						name = input.nextInt();
						stock.setName(name);
					}
					
					else if( number == 2) {
						System.out.print("Stock number : ");
						int stnumber = input.nextInt();
						stock.setStnumber(stnumber);
					}
					
					else if( number == 3 ) {
						System.out.print("Price : ");
						int price = input.nextInt();
						stock.setPrice(price);
					}
					
					else if(number == 4 ) {
						System.out.print("End date : ");
						int enddate = input.nextInt();
						stock.setEnddate(enddate);
					}
					
					else {
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

}
