import javax.swing.*;
public class JOptionInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String CmHeight = JOptionPane.showInputDialog("Enter height in centimeters: ");

double dblCmHeight = Double.parseDouble(CmHeight);
float totalHeightInch = Math.round((dblCmHeight * 0.39370));
System.out.println(dblCmHeight * 0.39370 );
int inchHeight = (int)(Math.round(totalHeightInch % 12));
int footHeight = (int)(totalHeightInch/12);

JOptionPane.showMessageDialog(null, "Your height is " + footHeight + " feet and " + inchHeight + " inches.");

	}

}
