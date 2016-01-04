import javax.swing.*;

import java.awt.*;

public class converter extends JFrame  {
	

	
	ConverterEvent convert = new ConverterEvent(this);//Instance variable to hold event object.
	JPanel row1 = new JPanel();
	JPanel row2 = new JPanel();
	JLabel Select= new JLabel("Measurement:");
	JComboBox<String> imp = new JComboBox<String>();
	JTextField lbs = new JTextField(5);
	JLabel measure = new JLabel("");
	JLabel equals = new JLabel("to");
	JComboBox<String> Unit = new JComboBox<String>();
	JLabel UnitLabel = new JLabel();//Text of JLabel set dependent upon selection in Unit JComboBox.
	JButton Enter = new JButton("Enter");
	JLabel ProductLabel = new JLabel("Product:");
	JTextField product = new JTextField(20);
	
	public converter() {
		super("Conversion Calculator");
		setSize(500,150);
		FlowLayout flo = new FlowLayout();
		setLayout(flo);
		row1.add(Select);
		row1.add(imp);
		row1.add(lbs);
		row1.add(measure);
		row1.add(equals);
		row1.add(Unit);
		row1.add(Enter);
		
		//Event handling to prevent user from attempting to convert length to weight, etc.
		
		//Add items to Unit ComboBox
		
		//Items added in order by measurement. Weight, length, degrees. Matches between imperial and metric.
		
		Unit.addItem(" ");
		Unit.addItem("Kilograms");
		Unit.addItem("Centimeters");
		Unit.addItem("Millimeters");
		Unit.addItem("Kilometers");
		Unit.addItem("Celsius");
		
		
		//Add Items to imp ComboBox
		
		imp.addItem(" ");
		imp.addItem("Pounds");
		imp.addItem("Inches");
		imp.addItem("Miles");
		imp.addItem("Fahrenheit");
		
		row2.add(ProductLabel);
		row2.add(product);
		product.setEditable(false);
		row2.add(UnitLabel);
		add(row1);
		add(row2);
		setVisible(true); // Set visible should be called after components are added. Avoids issue of blank GUI until screen is resized.
		//Add Listeners
		Unit.addItemListener(convert);//Event listener using instance variable constructed above.
		Enter.addActionListener(convert);// "                                                    "
		imp.addItemListener(convert);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Window runs blank when debugging until buried and resurfaced. Compare GUI Instantiation to other apps. Compare GUI Section of code.
		String pass = JOptionPane.showInputDialog("Please Enter Password:");
	 
	 //.equals is critical. == operator does not function correctly.
		//Create password field to allow for asterisk characters
	if (pass.equals("Frenchs")){
		
		converter CC = new converter();
	}

	//	try{UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
	//}catch(UnsupportedLookAndFeelException e){
		
	//}
//	catch(ClassNotFoundException e){
		
	//}
	//catch(InstantiationException e){
		
	//}
	//catch(IllegalAccessException e){
		
	//}
	
	

	

	

}
}

