import java.awt.Graphics;

import javax.swing.*;
public class TicTacToe extends JApplet {

	public void paint(Graphics canvas) {
		//vertical
		canvas.drawLine(100, 0, 100, 150);
		canvas.drawLine(50, 0, 50, 150);
		//horizontal
		canvas.drawLine(0, 50, 150, 50);
		canvas.drawLine(0, 100, 150, 100);
		// X one
		canvas.drawLine(5, 5, 45, 45);
		canvas.drawLine(5, 45, 45, 5);
		// X two
		canvas.drawLine(5, 55, 45, 95);
		canvas.drawLine(5, 95, 45, 55);
		// X three
		canvas.drawLine(5, 105, 45, 145);
		canvas.drawLine(5, 145, 45, 105);
		// Middle Circle
		canvas.drawOval(55, 55, 40, 40);
		//topright circle
		canvas.drawOval(105, 5, 40, 40);
		// Win Row
		canvas.drawLine(25, 0, 25, 150);
	}

}
