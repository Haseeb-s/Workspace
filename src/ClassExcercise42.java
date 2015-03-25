import java.util.*;
public class ClassExcercise42 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Choose program 1,2,3.");
		System.out.println("Which excercise do you want to do?");
		int choice = keyboard.nextInt();
		boolean complete = false;
		int odd = 1, even = 2;
		if (choice == 1){
			for (int x = 0; x <50; x++){
				System.out.println(odd);
				odd+=2;
			}
		}
		
		if (choice == 2){
			do{
				System.out.println(even);
				even+=2;
			}while(even<102);
		}
		if (choice ==3){
		while(complete != true){
			System.out.println("  *\n ***\n*****\n ***\n  *");
			complete = true;}
		}
		else
		System.out.println("Please pick an acceptable value");
	}

}
