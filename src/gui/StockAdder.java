package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class StockAdder extends JFrame {
	
	public StockAdder() {
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
		panel.add(labelEnddate);
		panel.add(fieldEnddate);
		
		panel.add(new JButton("Save"));
		panel.add(new JButton("Cancel"));
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(panel);
		this.setVisible(true);
		
	}

}
