public class Stock {
	
	int name;
	int stnumber;
	int price;
	int enddate;
	
	public Stock() {
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

	public void printInfo() {
		System.out.println("Name : " + name + " Stocknumber : " + stnumber + " Price : " + price + " End date : " + enddate);
	}

}
