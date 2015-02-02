/*
 * Author: Haseeb Shuaib
 * Date: 1/28/2015
 * Description: This program demonstrates the use of delimiter when taking input from
 * the user.
 */
import java.util.Scanner;


public class NoDelimScanner {

	public static void main(String[] args) {
		String s1,s2;
		Scanner keyboard2 = new Scanner(System.in);
		keyboard2.useDelimiter("\0");// uses the escape sequence /0 (null) as the delim.
		
		System.out.println("Enter a line of text with two words (no delimiter):" );
		s1 = keyboard2.next();
		s2 = keyboard2.next();
		System.out.println("The words are \"" + s1 + "\"\"" + s2 +"\"");
	}

}
