
import java.util.Random;
import java.util.*;

public class BeanMachine {
	public static void main (String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of balls to drop: ");
		int numberOfBalls = scanner.nextInt();
		System.out.println("Enter the number of slots in the bean machine: ");
		int numberOfSlots = scanner.nextInt();
		int[] ballsPosition = new int[numberOfBalls];
		Random random = new Random();
		int right = 0;
		double value;

	
		
		 for (int i = 0; i < numberOfBalls; i++) {
	            right = 0;
	            for (int j = 0; j < numberOfSlots; j++) {
	                value = random.nextInt(2);
	                if (value == 0) {
	                    System.out.print("L");
	                } else {
	                    System.out.print("R");
	                    right++;
	                }
	 
	            }
	            ballsPosition[i] = right;
	            System.out.println();
	        }
	 
	int[] slots = new int[numberOfSlots+1];
	for (int i = 0; i < slots.length; i++){
		slots[i] = 0;
	}
		for (int i = 0; i < ballsPosition.length; i++){
			slots[ballsPosition[i]]++; 
		}

		System.out.println();
		
		for (int i = 0; i < slots.length; i++){
			System.out.print("Slot #" + i + ":");
				for (int j = 0; j < slots[i]; j++){
					System.out.print("O");
				}
				System.out.println("");
		}	
	}
}
