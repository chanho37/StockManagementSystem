package stock;

import java.util.Scanner;

public class MasanStock extends Stock {
	
	public MasanStock(Stockkind kind) {
		super(kind);
	}
	
	
	public void getUserInput(Scanner input) {
		setStockName(input);
		setStockNumber(input);
		setStockPrice(input);
		setStockEnddate(input);
	}
	
	public void printInfo() {
		String skind = getkindString();
		System.out.println("kind: " + skind + " Name : " + name + " Stocknumber : " + stnumber + " Price : " + price + " date : " + enddate+" promotion Price : " + price + " End date : " + enddate);
	}
}
