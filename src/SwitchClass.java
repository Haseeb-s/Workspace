import java.util.Scanner;
public class SwitchClass {

	public static void main(String[] args) {
		int choice;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the value for your role: \n"
											+ "1. Admin\n"
											+ "2. Faculty\n"
											+ "3. Staff\n"
											+ "4. Student\n"
											+ "5. Guest");
		choice = keyboard.nextInt();
		
		switch(choice){
		case 1:
			System.out.println("Welcome Admin! ");
			break;
		case 2:
			System.out.println("Welcome Faculty! ");
			break;
		case 3:
			System.out.println("Welcome Staff! ");
			break;
		case 4:
			System.out.println("Welcome Student! ");
			break;
		case 5:
			System.out.println("Welcome Guest! ");
			break;
		}
	}

}
