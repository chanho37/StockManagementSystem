package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import listeners.StockAdderCancelListener;
import listeners.StockAdderListener;
import manager.StockManager;

public class StockAdder extends JPanel {
	
	WindowFrame frame;
	StockManager stockmanager;
	
	public StockAdder(WindowFrame frame, StockManager stockmanager) {
		this.frame = frame;
		this.stockmanager = stockmanager;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelName = new JLabel("Name : ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelSTNumber = new JLabel("Stock Number : ", JLabel.TRAILING);
		JTextField fieldSTNumber = new JTextField(10);
		labelSTNumber.setLabelFor(fieldSTNumber);
		panel.add(labelSTNumber);
		panel.add(fieldSTNumber);
		
		JLabel labelPrice = new JLabel("Price : ", JLabel.TRAILING);
		JTextField fieldPrice = new JTextField(10);
		labelPrice.setLabelFor(fieldPrice);
		panel.add(labelPrice);
		panel.add(fieldPrice);
		
		JLabel labelEnddate = new JLabel("Enddate : ", JLabel.TRAILING);
		JTextField fieldEnddate = new JTextField(10);
		labelEnddate.setLabelFor(fieldEnddate);
		
		JButton saveButton = new JButton("save");
		saveButton.addActionListener(new StockAdderListener(fieldName, fieldSTNumber, fieldPrice, fieldEnddate, stockmanager ));
		
		JButton cancleButton = new JButton("cancle");
		cancleButton.addActionListener(new StockAdderCancelListener(frame));
		
		panel.add(labelEnddate);
		panel.add(fieldEnddate);
			
		panel.add(saveButton);
		panel.add(cancleButton);
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		
		
		this.add(panel);
		this.setVisible(true);
		
	}

}
