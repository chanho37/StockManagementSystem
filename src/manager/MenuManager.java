package manager;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import gui.WindowFrame;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		StockManager stockmanager = getObject("stockmanager.ser");
		if(stockmanager == null) {
				stockmanager = new StockManager(input);
		}
		
		WindowFrame frame = new WindowFrame(stockmanager);
		selectMenu(input,stockmanager);
		putObject(stockmanager, "stockmanager.ser");
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
					logger.log("add a stock");
					break;
				case 2:
					stockmanager.deletestock();
					logger.log("delete a stock");
					break;
				case 3:
					stockmanager.editstock();
					logger.log("Edit a stock");
					break;
				case 4:
					stockmanager.viewstocks();
					logger.log("View a list of stock");
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
	
	public static StockManager getObject(String filename) {
		StockManager stockmanager = null;
		
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			stockmanager = (StockManager) in.readObject();
			
			in.close();
			file.close();			
		} catch (FileNotFoundException e) {
			return stockmanager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return stockmanager;
		
	}
	
	public static void putObject(StockManager stockmanager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(stockmanager);
			
			out.close();
			file.close();			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}