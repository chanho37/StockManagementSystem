package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.StockManager;

public class WindowFrame extends JFrame {	
	
	StockManager stockmanager;
	StockSelection stockselection;
	StockAdder stockadder;
	StockViewer stockviewer;
	
	
	public WindowFrame(StockManager stockmanager) {
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");
		
		this.stockmanager = stockmanager;
		stockselection = new StockSelection(this);
		stockadder = new StockAdder(this, this.stockmanager);
		stockviewer = new StockViewer(this, this.stockmanager);
		
		
		this.setupPanel(stockselection);
		this.setVisible(true);
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public StockSelection getStockselection() {
		return stockselection;
	}

	public void setStockselection(StockSelection stockselection) {
		this.stockselection = stockselection;
	}

	public StockAdder getStockadder() {
		return stockadder;
	}

	public void setStockadder(StockAdder stockadder) {
		this.stockadder = stockadder;
	}

	public StockViewer getStockviewer() {
		return stockviewer;
	}

	public void setStockviewer(StockViewer stockviewer) {
		this.stockviewer = stockviewer;
	}
}
