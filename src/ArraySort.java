import javax.swing.*;

import java.awt.event.*;
import java.util.*;

public class ArraySort implements ActionListener {
	
	private static double[] userArray = new double[10];
	private static String userInput;
	private static JTextField textInput[] = new JTextField[10];
	private static JLabel label, output, output1;
	public static JPanel panel;
	public static JFrame frame;
	public static JButton jbutt;
	public static double numbers = 0;
	double[] sortarray = new double[10];
	public ArraySort(){
		
		frame = new JFrame("Haseeb's Program");
		frame.setAlwaysOnTop(true);
		frame.setSize(400,350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		
		for(int x = 0; x < 10; x++){
			 int y = (x + 1);
			 label = new JLabel();
			 label.setText(y + ") Enter double: ");
			 textInput[x] = new JTextField(20);
			 panel.add(label);
			 panel.add(textInput[x]);
			
		}
		
		jbutt = new JButton("Sort Numbers");
		output = new JLabel();
		output.setText("        Total is ");
		output1 = new JLabel();
		output1.setText("-------------------");
		panel.add(jbutt);
		jbutt.addActionListener(this);
		panel.add(output);
		panel.add(output1);
		frame.add(panel);
		frame.setVisible(true);
		
		
	}
	
	
	public void actionPerformed(ActionEvent e){
		for(int x = 0; x < 10; x++){
			numbers = Double.parseDouble(textInput[x].getText());
			sortarray[x] = numbers; 
		}
		sortarray = SortArray(sortarray);
		output1.setText(String.valueOf(Arrays.toString(sortarray)));
		
		}
		
		

	
	public double[] SortArray(double[] arr){
		double temp;
        for(int i=0; i < arr.length-1; i++){
 
            for(int j=1; j < arr.length-i; j++){
                if(arr[j-1] > arr[j]){
                    temp=arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        return arr;
	}
}
