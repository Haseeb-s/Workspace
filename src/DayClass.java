import javax.swing.*;

import java.awt.event.*;
import java.util.*;

public class DayClass implements ActionListener {

	private static JTextField textInput[] = new JTextField[10];
	public static String CurrentDay;
	public int nextDay = 0;
	private static JLabel currentDay, dayWant, output, output1, output2, output3, output4, current, next, previous, calc;
	public static JPanel panel;
	public static JFrame frame;
	public static JButton jbutt;
	public static int wantNumber, newday, dayAdd, currentIndex, previousDay;
	double[] sortarray = new double[10];
	public String[] WEEK = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
	public JComboBox todayBox = new JComboBox(WEEK);
	public DayClass(){

		frame = new JFrame("Haseeb's Program");
		frame.setAlwaysOnTop(true);
		frame.setSize(400,350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		
		currentDay = new JLabel();
		currentDay.setText("Enter current Day: ");

		
		dayWant = new JLabel();
		dayWant.setText("Enter days to add: ");
		textInput[1] = new JTextField(20);
		
		
		panel.add(currentDay);
		panel.add(todayBox);
		panel.add(dayWant);
		panel.add(textInput[1]);

		jbutt = new JButton("Calculate days");
		output = new JLabel();
		current = new JLabel();
		next = new JLabel();
		previous = new JLabel();
		calc = new JLabel();
		current.setText("Todays Date: ");
		previous.setText("Previous Date: ");
		next.setText("Tomorrows Date: ");
		calc.setText("Calculated Date: ");
		output.setText("        Total is ");
		//MAKE THIS CURRENT DAY
		output1 = new JLabel();
		output1.setText("-------------------");
		//MAKE THIS NEXT DAY
		output2 = new JLabel();
		output2.setText("-------------------");
		//MAKE THIS PREVIOUS DAY
		output3 = new JLabel();
		output3.setText("-------------------");
		//MAKE THIS THE CALCULATED DAY
		output4 = new JLabel();
		output4.setText("-------------------");
		
		panel.add(jbutt);
		jbutt.addActionListener(this);
		
		panel.add(current);
		panel.add(output1);
		panel.add(next);
		panel.add(output2);
		panel.add(previous);
		panel.add(output3);
		panel.add(calc);
		panel.add(output4);
		frame.add(panel);
		frame.setVisible(true);
		

		//currentIndex = WEEK.indexOf(CurrentDay);


	}

	
	public void actionPerformed(ActionEvent e){


		CurrentDay = (String)todayBox.getSelectedItem();
		currentIndex = Arrays.asList(WEEK).indexOf(CurrentDay);
		wantNumber = Integer.parseInt((textInput[1].getText()));
		dayAdd = currentIndex + wantNumber;
		newday = dayAdd % 7;
		 previousDay = currentIndex - 1;
		if (currentIndex == 6){
			nextDay = 0;}
		else {nextDay = currentIndex + 1;}
		
		if (currentIndex == 0){
			previousDay = 6;}
		else {previousDay = currentIndex - 1;}

		output1.setText(WEEK[currentIndex]);

		output2.setText(WEEK[nextDay]);

		output3.setText(WEEK[previousDay]);

		output4.setText(WEEK[newday]);
		}

}
