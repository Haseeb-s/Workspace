import java.awt.Color;
import java.awt.event.*;
import java.awt.Panel;
import javax.swing.*;


public class CalcGui implements ActionListener {
	
	private JFrame frame;
	private JPanel panel;
	private JLabel label1, label2,label3, output;
	private JTextField textField;
	private JTextField textField2;
	private JButton button;
public CalcGui(){
	

	frame = new JFrame("Calculator");
	frame.setAlwaysOnTop(true);
	frame.setVisible(true);
	frame.setSize(400,200);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	panel = new JPanel();
	panel.setBackground(Color.LIGHT_GRAY);

	label1 = new JLabel();
	label1.setText("Enter first number          +     ");

	label3 = new JLabel();
	label3.setText("Enter second number ");
		
	button = new JButton("Calculate");
	button.addActionListener(this);
	output = new JLabel();
	output.setText("-------");
	textField = new JTextField(13);
	textField2 = new JTextField(14);
	
	panel.add(label1);
	panel.add(label3);
	panel.add(textField);
	
	panel.add(textField2);
	panel.add(button);
	panel.add(output);
	frame.add(panel);
}
	
	public void actionPerformed(ActionEvent e){
		double num1 = Double.parseDouble(textField.getText());
		double num2 = Double.parseDouble(textField2.getText());
		double product = (num1 + num2);
		output.setText(String.valueOf(product));
	}
}
