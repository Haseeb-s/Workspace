import java.util.*;
public class CharacterArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input a string of any length or type \"NO\" to use default");
		String str = scanner.nextLine();
		//for testing purposes
		if (str.equals("NO"))
		str = "6901 Sudley Road Manassas VA";
	
		System.out.println(str);
		char[] charArray = str.toCharArray();		
		System.out.println("Here are all the numbers");
		for(char element : charArray){
			if ((int)element >= 48 && (int)element <=57)
				System.out.print(element);
		}
		
		System.out.println("");
		System.out.println("Here are the upper case letters");
		for(char element : charArray){
			if ((int)element >= 65 && (int)element <=90)
				System.out.print(element);
		}
		System.out.println("\nHere are the lower case letters");
		for(char element : charArray){
			if ((int)element >= 97 && (int)element <=122)
				System.out.print(element);
		}
		
		System.out.println("\nReplacing all digits with '*'");
		char[] newArray = new char[str.length()];
		int x = 0;
		for(char element : charArray){
			if ((int)element >= 48 && (int)element <= 57)
				newArray[x] = '*';
			else
				newArray[x] = element;
			x++;
		}
		String toStringArray = String.valueOf(newArray);
		System.out.println(toStringArray);
		
	}
}
