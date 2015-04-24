import javax.swing.*;


import java.awt.event.*;


public class ScoreGui implements ActionListener {
	
	private static JTextField testInput[] = new JTextField[10];
	private static JTextField weightInput[] = new JTextField[10];
	private static JLabel label, label1, output, output1;
	public static JPanel panel;
	public static JFrame frame;
	public static JButton jbutt;
	public static double totalScore = 0, totalWeight = 0;
	double[] sortarray = new double[10];
	public ScoreGui(){
		//initializing new frame
		frame = new JFrame("Haseeb's Program");
		frame.setAlwaysOnTop(true);
		frame.setSize(500,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		//loop creates multiple jtext/jlabel for user input
		for(int x = 0; x < 4; x++){
			 int y = (x + 1);
			 label = new JLabel();
			 label1 = new JLabel();
			 label.setText(y + ") Enter test score: ");
			 testInput[x] = new JTextField(10);
			 panel.add(label);
			 panel.add(testInput[x]);
			 label1.setText(" Enter test weight: ");
			 weightInput[x] = new JTextField(10);
			 panel.add(label1);
			 panel.add(weightInput[x]);

		}
		// adds objects to frame
		jbutt = new JButton("Calculate Weighted Average");
		output = new JLabel();
		output.setText("Average is");
		output1 = new JLabel();
		output1.setText("-------");
		panel.add(jbutt);
		jbutt.addActionListener(this);
		panel.add(output);
		panel.add(output1);
		frame.add(panel);
		frame.setVisible(true);
		
		
	}
	
	//when jbutt is pressed, information is gathered from inputs a
	public void actionPerformed(ActionEvent e){
		double weightedAverage = 0;
		for(int x = 0; x < 4; x++){
			totalScore = Double.parseDouble(testInput[x].getText());
			totalWeight = Double.parseDouble(weightInput[x].getText());
			weightedAverage += ((totalScore/(100*totalWeight))*(100*totalWeight));
		}
		weightedAverage = (weightedAverage/4);
		output1.setText(String.valueOf(weightedAverage));
		
		}
		
}
