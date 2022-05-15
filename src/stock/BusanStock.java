package stock;

import java.util.Scanner;

public class BusanStock extends BusanCentum {
	
	public BusanStock(Stockkind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setStockName(input);
		setStockNumber(input);
		setStockPricewithYN(input);
		setStockEnddate(input);
	}
}

