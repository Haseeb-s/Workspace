import java.util.Arrays;
import java.util.Scanner;
public class DivingScore {

public static double[] scores = new double[7];	
public static void main(String[] args){
inputAllScores();
System.out.println("The total score is : " + calculateScore() );
}

public static void inputAllScores(){
	for (int x = 0; x<scores.length; x++){
		scores[x] = inputValidScore();	
	}
	String array = Arrays.toString(scores);
	System.out.println(array);
}

public static double inputValidScore(){
	Scanner scanner = new Scanner(System.in);
	double input;
	boolean redo = false;
	do{
		System.out.print("\nInput a valid score ranging from 0-10: ");
		input = scanner.nextDouble();
		
		if (input >= 0 && input <11)
			break;
		else{
			System.out.println("invald input");
			redo = true;}
		
	}while(redo);
	return input;	
}

public static double inputValidDegreeOfDifficulty(){
	Scanner scanner = new Scanner(System.in);
	double input;
	boolean redo = false;
	do{
		System.out.print("Input a difficulty score ranging from 1.2-3.8: ");
		input = scanner.nextDouble();
		
		if (input >= 1.2 && input <3.9)
			break;
		else{
			System.out.println("invald input");
			redo = true;
		}
	}while(redo);
	return input;	
}

public static double calculateScore(){
	double totalScore = 0;
	double max = scores[0];
	double min = scores[0];
		
		for (double element : scores){
			if (element > max)
				max = element;
			if (element < min)
				min = element;
			totalScore += element;}

	totalScore = totalScore - (min + max);

	totalScore = (totalScore * inputValidDegreeOfDifficulty()) * 0.6;
	return totalScore;
}

}
