package stock;

import java.io.Serializable;
import java.util.Scanner;

import exception.PriceFormatException;

public abstract class Stock implements StockInput, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3852181471704461405L;
	
	protected Stockkind kind = Stockkind.Masan;
	protected int name;
	protected int stnumber;
	protected String price;
	protected int enddate;

	public Stock() {
	}
	
	public Stock(Stockkind kind) {
		this.kind = kind;
	}
	
	public Stock(int name, int stnumber) {
		this.name = name; 
		this.stnumber = stnumber;
	}
	
	public Stock(int name, int stnumber, String price, int enddate) {
		this.name = name;
		this.stnumber = stnumber;
		this.price = price;
		this.enddate = enddate;
	}
	
	public Stock(Stockkind kind, int name, int stnumber, String price, int enddate) {
		this.kind = kind;
		this.name = name;
		this.stnumber = stnumber;
		this.price = price;
		this.enddate = enddate;
	}
	
	public Stockkind getKind() {
		return kind;
	}

	public void setKind(Stockkind kind) {
		this.kind = kind;
	}

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}

	public int getStnumber() {
		return stnumber;
	}

	public void setStnumber(int stnumber) {
		this.stnumber = stnumber;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) throws PriceFormatException {	
		if (!price.contains("won") && !price.equals("")) 
		{
			throw new PriceFormatException();
		}
		this.price = price;
	}

	public int getEnddate() {
		return enddate;
	}

	public void setEnddate(int enddate) {
		this.enddate = enddate;
	}
	
	public abstract void printInfo();
	
	public void setStockName(Scanner input) {
		System.out.print("Stock name : ");
		int name = input.nextInt();
		this.setName(name);
	}
	
	public void setStockNumber(Scanner input) {
		System.out.print("Stock number : ");
		int stnumber = input.nextInt();
		this.setStnumber(stnumber);
	}
	
	public void setStockPrice(Scanner input) {
		String price = "";
		while(!price.contains("won")) {
			System.out.print("Price : ");
			price = input.next();
			try {
				this.setPrice(price);
			} catch (PriceFormatException e) {
				System.out.println("Incorrect Price Format. Please enter a unit");
			}
		}
	}

	public void setStockEnddate(Scanner input) {
		System.out.print("End date : ");
		int enddate = input.nextInt();
		
		this.setEnddate(enddate);
	}
	
	public String getkindString() {
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
		return skind;
	}

}
