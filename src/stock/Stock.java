package stock;

import java.util.Scanner;

public class Stock {
	protected Stockkind kind = Stockkind.Masan;
	protected int name;
	protected int stnumber;
	protected int price;
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
	
	public Stock(int name, int stnumber, int price, int enddate) {
		this.name = name;
		this.stnumber = stnumber;
		this.price = price;
		this.enddate = enddate;
	}
	
	public Stock(Stockkind kind, int name, int stnumber, int price, int enddate) {
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getEnddate() {
		return enddate;
	}

	public void setEnddate(int enddate) {
		this.enddate = enddate;
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
		System.out.println("kind: " + skind + " Name : " + name + " Stocknumber : " + stnumber + " Price : " + price + " End date : " + enddate);
	}
	
	public void getUserInput(Scanner input) {
		System.out.println("Write a Stock Code");
		int name = input.nextInt();
		this.setName(name);
		
	    System.out.println("how many stock did you get?");
		int stnumber = input.nextInt();
		this.setStnumber(stnumber);
		
		System.out.println("Write a Price");
		int price = input.nextInt();
		this.setPrice(price);
		
		System.out.println("Write a End date");
		int enddate = input.nextInt();
		this.setEnddate(enddate);
	}

}
