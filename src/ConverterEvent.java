import javax.swing.*;

import java.awt.event.*;

public class ConverterEvent implements ActionListener, ItemListener {
	converter gui;
	String label;

	public ConverterEvent(converter in) {
		// TODO Auto-generated constructor stub
		gui = in;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String pounds = gui.lbs.getText();// Seperate place holder, i.e. label, for US Standard measurements needed?//
		try{
			if(label == null) {
				JOptionPane.showMessageDialog(null, "Please select a unit of measurement.");
			}

		if(label == "Stone"){

		double stone = .0714286*(Double.parseDouble(pounds));//
		gui.product.setText(Double.toString(stone));
	
		}
		if (label == "Kilograms"){
			
			double Kgs = .453592*(Double.parseDouble(pounds));
			gui.product.setText(Double.toString(Kgs));
		}
		if(label == "Metric Ton"){
			double Ton = .000453592*(Double.parseDouble(pounds));
			gui.product.setText(Double.toString(Ton));
		}
		}catch(NumberFormatException e1) {
			JOptionPane.showMessageDialog(null,"Please enter a value for lbs");
		}
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		Object box = e.getItem();//Retrieves value of Unit ComboBox
		label = box.toString();//Converts value to string.
		
		// Switch prevents US standard units of measure from appearing as product label.
		switch(label){
		case "Kilograms":
			
		case "Centimeters":
			
		case "Millimeters":
			
		case "Kilometers":
			
		case "Celsius":
			
		
		gui.UnitLabel.setText(label);//Sets value of UnitLabel JLabel to selection of combobox.
		
		break;
		
		//Use of array to prevent conversions between incompatible units of measure?//
		
		}
	}



}
