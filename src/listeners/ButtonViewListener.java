package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import gui.StockViewer;
import gui.WindowFrame;
import manager.StockManager;

public class ButtonViewListener implements ActionListener {

	WindowFrame frame;
	
	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
	}
	
	public void actionPerformed(ActionEvent e) {
		StockViewer stockviewer = frame.getStockviewer();
		StockManager stockmanager = getObject("stockmanager.ser");
		stockviewer.setStockmanager(stockmanager);
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(stockviewer);
		frame.revalidate();
		frame.repaint();
	}
	
	public static StockManager getObject(String filename) {
		StockManager stockmanager = null;
		
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			stockmanager = (StockManager) in.readObject();
			
			in.close();
			file.close();			
		} catch (FileNotFoundException e) {
			return stockmanager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return stockmanager;
		
	}

}
