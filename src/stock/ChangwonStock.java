package stock;

import java.util.Scanner;

public class ChangwonStock extends Stock {
	
	protected int promotionprice;
	protected int promotionenddate;

	public ChangwonStock(Stockkind kind){
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
		
		answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') 
		{
			System.out.print("Is there any change in promotion price? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				System.out.println("Write a promotion Price");
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
	public void printInfo() {
		String skind = "none";
		switch(this.kind) {
		case Masan:
			skind = "Masan";
			break;
		case Busan:
			skind = "Busan";
			break;
		case Jinju:
			skind = "Jinju";
			break;
		case Changwon:
			skind = "Changwon";
			break;
		default:
		}
		System.out.println("kind: " + skind + " Name : " + name + " Stocknumber : " + stnumber + " Price : " + price + " date : " + enddate+" promotion Price : " + price + " End date : " + enddate);
	}

}
