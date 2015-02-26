import java.awt.*;
import java.awt.event.*; 
import javax.swing.*;

public class ColorDisk extends JApplet 
implements ActionListener
{
private Color color =Color. blue;
private int radius = -1, xCenter, yCenter;
private Container pane;
private JButton button;

public void init()
{
button = new JButton("Draw disk");
button.addActionListener(this);
pane = getContentPane();
pane.setBackground(Color.white);
pane.add(button, BorderLayout.SOUTH);
}

public void actionPerformed(ActionEvent e)
{
Color pickedColor =
JColorChooser.showDialog(this,"Pick a color", color);
if (pickedColor != null)
color = pickedColor;
int width = pane.getWidth();
int height = pane.getHeight() - button.getHeight();
radius = width / 4;
int xCenter = width / 2;
int yCenter = height / 2;
repaint();
}

public void paint(Graphics g)
{
super.paint(g);
if (radius > 0)
{
g.setColor(color);
g.fillOval(xCenter = radius, yCenter = radius, 2 * radius, 2 * radius); 

    }
  }
}

