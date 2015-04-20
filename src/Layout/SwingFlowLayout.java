import javax.swing.*;

import java.awt.*;

public class SwingFlowLayout extends JFrame{
	private JButton jbutt[] = new JButton[10];
	private JTextField[] field1 = new JTextField[1];
	public SwingFlowLayout()	{
		
		jbutt[1] = new JButton("1");
		jbutt[2] = new JButton("2");
		jbutt[3] = new JButton("3");
		jbutt[4] = new JButton("4");
		
		
		setLayout(new FlowLayout());
		
		add(jbutt[1]);
		add(jbutt[2]);
		add(jbutt[3]);
		add(jbutt[4]);
		field1[0] = new JTextField(40);
		add(field1[0]);
		setVisible(true);
		setSize(new Dimension(200,115));
	}
}
