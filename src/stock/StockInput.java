package stock;

import java.util.Scanner;

import exception.PriceFormatException;


public interface StockInput {
	
	public int getName();
	
	public void setName(int name);
	
	public int getStnumber();
	
	public void setStnumber(int stnumber);
	
	public String getPrice();
	
	public void setPrice(String price) throws PriceFormatException;;
	
	public void setEnddate(int enddate);
	
	public int getEnddate();
	
	public void printInfo();
	
	public void getUserInput(Scanner input);
	
	public void setStockName(Scanner input);
	
	public void setStockNumber(Scanner input);
	
	public void setStockPrice(Scanner input);
	
	public void setStockEnddate(Scanner input);
	

}
