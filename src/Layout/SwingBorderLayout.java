import javax.swing.*;

import java.awt.*;

public class SwingBorderLayout extends JFrame {
	
	private JButton jbutt[] = new JButton[10];
	private JTextField[] field1 = new JTextField[1];
	
	public SwingBorderLayout()	{
		
		jbutt[1] = new JButton("1");
		jbutt[2] = new JButton("2");
		jbutt[3] = new JButton("3");
		jbutt[4] = new JButton("4");
		
		
		setLayout(new BorderLayout());
		
		add(jbutt[1], BorderLayout.PAGE_START);
		add(jbutt[2], BorderLayout.CENTER);
		add(jbutt[3], BorderLayout.PAGE_END);
		add(jbutt[4], BorderLayout.LINE_END);
		field1[0] = new JTextField(40);
		add(field1[0], BorderLayout.LINE_START);
		setVisible(true);
		setSize(new Dimension(800,300));
		}
}
