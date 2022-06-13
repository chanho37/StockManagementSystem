package gui;


import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import manager.StockManager;
import stock.StockInput;

public class StockViewer extends JPanel {
	
	WindowFrame frame;
	
	StockManager stockmanager;
	
	public StockManager getStockmanager() {
		return stockmanager;
	}

	public void setStockmanager(StockManager stockmanager) {
		this.stockmanager = stockmanager;
		this.removeAll();
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Name");
		model.addColumn("STNumber");
		model.addColumn("Price");
		model.addColumn("End Date");
		
		for(int i = 0; i < stockmanager.size(); i++) {
			Vector row = new Vector();
			StockInput si = stockmanager.get(i);
			row.add(si.getName());
			row.add(si.getStnumber());
			row.add(si.getPrice());
			row.add(si.getEnddate());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}

	public StockViewer(WindowFrame frame, StockManager stockmanager) {
		this.frame = frame;
		this.stockmanager = stockmanager;
		
		System.out.println("*** " + stockmanager.size()+ "***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Name");
		model.addColumn("STNumber");
		model.addColumn("Price");
		model.addColumn("End Date");
		
		for(int i = 0; i < stockmanager.size(); i++) {
			Vector row = new Vector();
			StockInput si = stockmanager.get(i);
			row.add(si.getName());
			row.add(si.getStnumber());
			row.add(si.getPrice());
			row.add(si.getEnddate());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}

}
