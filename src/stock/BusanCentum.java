package stock;

import java.util.Scanner;

import exception.PriceFormatException;

public abstract class BusanCentum extends Stock {
	
	public BusanCentum(Stockkind kind) {
		super(kind);
	}

	@Override
	public abstract void getUserInput(Scanner input);

	@Override
	public void printInfo() {
		String skind = getkindString();
		System.out.println("kind: " + skind + " Name : " + name + " Stocknumber : " + stnumber + " Price : " + price + " date : " + enddate+" promotion Price : " + price + " End date : " + enddate);
	}
	
	public void setStockPricewithYN(Scanner input) {
		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') 
		{
			System.out.print("Is there any change in price? (Y/N)");
			answer = input.next().charAt(0);
			try {
				if(answer == 'y' || answer == 'Y') {
					System.out.println("Write a Price");
					String price = input.next();
					this.setPrice(price);
					break;
				}
				else if(answer == 'n' || answer == 'N') {
					this.setPrice("");
				}
				else {
				}
			}
			catch(PriceFormatException e) {
				System.out.println("Incorrect Price Format. Please enter a unit");
			}
		}
	}
}