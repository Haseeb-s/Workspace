import javax.swing.*;
import java.util.*;
public class Coins {

	public static final double QUARTER = .25;
	public static final double DIME = .10;
	public static final double NICKLE = .05;
	public static final double PENNY = .01;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		String Stringvalue = JOptionPane.showInputDialog(null, "Input a dollar amount in either 1/5/10 increments");
		double value = Double.parseDouble(Stringvalue);

		JOptionPane.showMessageDialog(null, "The amount of quarters that can make up your amount is " + (value/QUARTER));
		JOptionPane.showMessageDialog(null, "The amount of dimes that can make up your amount is " + (value/DIME));
		JOptionPane.showMessageDialog(null, "The amount of nickles that can make up your amount is " + (value/NICKLE));
		JOptionPane.showMessageDialog(null, "The amount of pennies that can make up your amount is " + (value/PENNY));


	}

}






