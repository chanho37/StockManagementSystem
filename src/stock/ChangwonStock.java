package stock;

import java.util.Scanner;

import exception.PriceFormatException;

public class ChangwonStock extends BusanCentum {
	
	protected int promotionprice;
	protected int promotionenddate;

	public ChangwonStock(Stockkind kind){
		super(kind);
	}
	

	
	public void getUserInput(Scanner input) {
		setStockName(input);
		setStockNumber(input);
		setStockPricewithYN(input);
		setStockPromotionPricewithYN(input);		
		setStockEnddate(input);
	}
	
	
	public void setStockPromotionPricewithYN(Scanner input) {
		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') 
		{
			System.out.print("Is there any change in promotion price? (Y/N)");
			answer = input.next().charAt(0);
			try {
				if(answer == 'y' || answer == 'Y') {
					setStockPrice(input);
					break;
				}
				else if(answer == 'n' || answer == 'N') {
					this.setPrice("");
					break;
				}
				else {
				}
			}
			catch(PriceFormatException e) {
				System.out.println("Incorrect Price Format. Please enter a unit");
			}
		}
	}

	    public void printInfo() {
			String skind = getkindString();
			System.out.println("kind: " + skind + " Name : " + name + " Stocknumber : " + stnumber + " Price : " + price + " date : " + enddate+" promotion Price : " + price + " End date : " + enddate);
		}
		
}
