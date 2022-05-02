package stock;

import java.util.Scanner;

public class BusanStock extends Stock {
	
	public BusanStock(Stockkind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		System.out.println("Write a Stock Code");
		int name = input.nextInt();
		this.setName(name);
		
		System.out.println("how many stock did you get?");
		int stnumber = input.nextInt();
		this.setStnumber(stnumber);
		
		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') 
		{
			System.out.print("Is there any change in price? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				System.out.println("Write a Price");
				int price = input.nextInt();
				this.setPrice(price);
			}
			else if(answer == 'n' || answer == 'N') {
				this.setPrice(0);
			}
			else {
			}
		}
		
		System.out.println("Write a End date");
		int enddate = input.nextInt();
		this.setEnddate(enddate);
	}

}
