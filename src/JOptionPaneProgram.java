import java.util.*;
import javax.swing.*;

public class JOptionPaneProgram {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		boolean loop = true;
		
		while (loop = true){
			
			
		System.out.println("Did you want to use custom variables?(Y/N)");
		String choice = keyboard.nextLine();
		choice = choice.toLowerCase();
		
		if (choice.equals("n")){
			 loop = false;
			 
			 JOptionPane.showMessageDialog(null,"The integer value is: " + getInt() +
					 						"\nThe char value is: " + getChar() +	
					 						"\nThe byte value is: " + getByte() +
					 						"\nThe boolean value is: " + getBoolean() +
					 						"\nThe float value is: " + getFloat() +
					 						"\nThe short value is: " + getShort() +
					 						"\nThe long value is: " + getLong() +
					 						"\nThe double value is: " + getDouble()  );
			 
			 break;
		}
		
		else if (choice.equals("y")){
			loop = false;
			
			System.out.println("Please enter an int: ");
			int integer = keyboard.nextInt();
			
			System.out.println("Please enter a double: ");
			double dubz = keyboard.nextDouble();
			
			System.out.println("Please enter a char: ");
			String a1 = keyboard.next();
			char chr = a1.charAt(0);
			
			System.out.println("Please enter a byte: ");
			byte byt = keyboard.nextByte();
			
			System.out.println("Please enter a boolean: ");
			boolean boo = keyboard.nextBoolean();
			
			System.out.println("Please enter a float: ");
			float flt = keyboard.nextFloat();
			
			System.out.println("Please enter a short: ");
			short shrt = keyboard.nextShort();
			
			System.out.println("Please enter a long: ");
			long lng = keyboard.nextLong();
			
			JOptionPane.showMessageDialog(null,"The integer value is: " + integer +
						"\nThe char value is: " + chr +	
						"\nThe byte value is: " + byt +
						"\nThe boolean value is: " + boo +
						"\nThe float value is: " + flt +
						"\nThe short value is: " + shrt +
						"\nThe long value is: " + lng +
						"\nThe double value is: " + dubz  );
			
			break;
		}
		
		else{
			System.out.println("Please enter either \'Y\' or \'N\'.");
		}
		
		}
		System.out.println("Done.");
	}


	public static int getInt() {
		int integer = 1;
		return (integer);
	}
	public static byte getByte() {
		byte byt1 = 00000011;
		return byt1;
	}
	public static char getChar() {
		char chr = 's';
		return chr;
	}
	public static float getFloat() {
		float flt = 3;
		return flt;
	}
	public static double getDouble() {
		double dub = 3.14;
		return dub;
	}
	public static long getLong(){
		long lng = 1641111564;
		return lng;
	}
	public static boolean getBoolean() {
		boolean bln = false;
		return bln;
	}
	public static short getShort() {
		short shrt = 126;
		return shrt;
	}
									
}
