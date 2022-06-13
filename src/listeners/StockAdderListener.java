package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import exception.PriceFormatException;
import manager.StockManager;
import stock.MasanStock;
import stock.Stock;
import stock.StockInput;
import stock.Stockkind;

public class StockAdderListener implements ActionListener {
	
	JTextField fieldName;
	JTextField fieldSTNumber;
	JTextField fieldPrice;
	JTextField fieldEnddate;
	
	StockManager stockmanager;
	
	
	public StockAdderListener(JTextField fieldName, JTextField fieldSTNumber, JTextField fieldPrice, JTextField fieldEnddate, StockManager stockmanager) {
		this.fieldName = fieldName;
		this.fieldSTNumber = fieldSTNumber;
		this.fieldPrice = fieldPrice;
		this.fieldEnddate = fieldEnddate;
		this.stockmanager = stockmanager;
	}
	
	public void actionPerformed(ActionEvent e) {		
		StockInput stock = new MasanStock(Stockkind.Masan);
		try {
			stock.setName(Integer.parseInt(fieldName.getText()));
			stock.setStnumber(Integer.parseInt(fieldSTNumber.getText()));
			stock.setPrice(fieldPrice.getText());
			stock.setEnddate(Integer.parseInt(fieldEnddate.getText()));
			stockmanager.addstock(stock);
			putObject(stockmanager, "stockmanager.ser");
			stock.printInfo();
		} catch (PriceFormatException e1) {
		}
	}
	
	public static void putObject(StockManager stockmanager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(stockmanager);
			
			out.close();
			file.close();			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
