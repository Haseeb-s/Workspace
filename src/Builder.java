import java.lang.StringBuilder;
import java.util.*;

public class Builder {
	public static void main(String args[]){
		StringBuilder str = new StringBuilder("");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input the string \"Java is fun!\"");
		String javaFun = scanner.nextLine();
		
		int stringLength = javaFun.length();
		System.out.println("The length of the string is " + stringLength);
		
		System.out.println("Input the string \" I love it!\"");
		String javaLove = scanner.nextLine();
		
		System.out.println("Input the string \"Yes,\"");
		String javaYes = scanner.nextLine();
		
		str.append(javaFun);
		str.insert(stringLength, " ");
		stringLength = str.length();
		str.append(javaLove);
		str.insert(stringLength, javaYes);
		System.out.println(str.toString());
	}
}
