import java.util.Arrays;
import java.util.Scanner;
public class Temperature {
public static int[][] array = new int[12][2];
public static int month = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] monthArray = inputTempForYear();
		double avgHigh = calculateAverageHigh(monthArray);
		double avglow = calculateAverageLow(monthArray);
		int lowIndx = findLowestTemp(monthArray);
		int highIndx = findHighestTemp(monthArray);
		for (int[] is : monthArray) {
			   System.out.println(Arrays.toString(is));
			}
		System.out.println("The average high temp is : " + avgHigh);
		System.out.println("The average low temp is : " + avglow);
		System.out.println("The highest temp is found in the month of " + (highIndx+1) + " with the temp of " + monthArray[highIndx][1]);
		System.out.println("The lowest temp is found in the month of " + (lowIndx+1) + " with the temp of " + monthArray[lowIndx][0]);
	}
	
public static void inputTempForMonth(int high, int low){//gets called byt inputtempforyear and this method adds the months
	int x = 0;
	array [month][x] = low;
	x++;	
	array [month][x] = high;
	//System.out.println(month + "  " + low + "  "+ high);
	month++;
}

public static int[][] inputTempForYear(){//returns array created
	Scanner scanner = new Scanner(System.in);
	for(int month = 1; month < 13; month++){
	
	System.out.print("Input the high temperature for month " + month + ": ");
	int high = scanner.nextInt();
	
	System.out.print("\nInput the low temperature for month " + month + ": ");
	int low = scanner.nextInt();
	inputTempForMonth(high,low);
	}
	
	return array;
}
public static double calculateAverageHigh(int[][] monthArray){
	double totalHigh = 0;
	for (int x=0; x < 12; x++){
		totalHigh += monthArray[x][1];
	}
	double avgHigh = totalHigh/12;
	return avgHigh;
}
public static  double calculateAverageLow(int[][] monthArray){
	double totalLow = 0;
	for (int x=0; x < 12; x++){
		totalLow += monthArray[x][0];
	}
	double avgLow = totalLow/12;
	return avgLow;
}
public static int findLowestTemp(int[][] monthArray){
	int index = -1;
	int low = 10000000;
	for (int x=0; x < 12; x++){
		if (monthArray[x][0]<low)
		{
			low = monthArray[x][0];
		index = x;
		}
	}
	return index;
}

public static int findHighestTemp(int[][] monthArray){
	int index = -1;
	int high = -10000000;
	for (int x=0; x < 12; x++){
		if (monthArray[x][1] > high)
		{high = monthArray[x][1];
		index = x;
		}
	}
	return index;
}
}
