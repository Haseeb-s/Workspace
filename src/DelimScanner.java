/*
 * Name: Haseeb Shuaib
 * Date: 2/2/2015
 * Description: Find average of input using ',' delimiter
 * Contact: hms2274@email.vccs.edu || 571-989-8091
 */

import java.util.Scanner;
public class DelimScanner {

	public static void main(String[] args) {
		String input;
		int totalNumber = 0;
		Scanner Keyboard1 = new Scanner(System.in);
		Keyboard1.useDelimiter(",");
		double numberValue = 0;
		
		System.out.println("Enter a series of numbers (Use \",\" as delimiter): ");
		input = Keyboard1.nextLine();
		
		String[] split = input.split(",");	
		
		for(int x = 0; x<split.length; x++){
			double s1 = Double.parseDouble(split[x]);
			numberValue += s1;
			totalNumber++;
		}
		
		System.out.println("Your average is: " + (numberValue/totalNumber));
	}

}
