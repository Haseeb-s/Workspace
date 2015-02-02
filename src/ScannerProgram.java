import java.util.*;

public class ScannerProgram {

	public static void main(String[] args) {
		
	
	Scanner keyboard = new Scanner(System.in);
	System.out.println("What is your username?");
	String userName = keyboard.nextLine();
	
	System.out.println("What is your password?");
	String userPass = keyboard.nextLine();
	
	System.out.println("Hello " + userName + ", Welcome to CSC200 class! \nYour password is: " +  userPass);
	
	}

}
