import javax.swing.*;
import java.util.*;
public class Assignment2b {

	public static void main(String[] args) {
		// declaring initial variables
		int number = 0, sum = 0, max = 0, min = 0, median;
		int[] numberArray = new int[5];
		
		// looping to collect user info
		for (int x=0; x<5; x++){
		String input =JOptionPane.showInputDialog("Please insert number " + ++number);	 
		int current = Integer.parseInt(input);
		//saving sum and current number
		sum += current;
		numberArray[x] = current;
		if (x == 0){ // creates inital max and min
			max = current;
			min = current;
		}
		if(current > max){ // compares current value to max (if greater than max then current is new max)
			max = current;
		}
		if (current < min){// compares the current value to min (if lower than its the new min)
			min = current;
		}
		}
		//displaying total and average
		JOptionPane.showMessageDialog(null,"The total is: " + sum);
		JOptionPane.showMessageDialog(null, "The average is: " + ((double)sum/(double)number));
		
		int modecount=0;
		int mode = numberArray[0];
		int newCount = 0;
		int newmode = 0;
		
		
		
		
		//sorting array to easily find median
		Arrays.sort(numberArray);
		
		
		
		//**************************EXTRA CREDIT*******************************
		//displaying easy parts
		JOptionPane.showMessageDialog(null, "The max is: " + max);
		JOptionPane.showMessageDialog(null, "The min is: " + min);
		// since array is sorted, middle number (index 2) is the median
		JOptionPane.showMessageDialog(null, "The median is: " + (numberArray[2]));
		//tricky part finding mode
		for (int y=0; y<5; y++){
			//nested loop to compare a current index to all other indexes
			for (int z=0; z<5; z++){
				//if the current index matches with another number, and there is already an existing mode that exists twice 
				// then the current index is a new node since there can only be a max of two pairs of two repeating values
			if (modecount == 2 && numberArray[y] == numberArray[z] && numberArray[y] != mode)
				{
					newmode = numberArray[y];
					newCount++;
				}
			//creating inital node
			if(numberArray[y] == numberArray[z]){
				mode = numberArray[z];
				modecount++;
				}
			}
			//if either nodes reach the count of 3 repeats, there can be no other potential mode
			if(modecount == 3 || newCount == 3){
				break;
				}
		}
		
		//printing two nodes if there are two
		if (modecount == newCount){
			JOptionPane.showMessageDialog(null, "The modes is: " + newmode + " and " + mode + "." );
			}
			
		
	JOptionPane.showMessageDialog(null, "The mode is: " + mode );
	}
}

	
	
