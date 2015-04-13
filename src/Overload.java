
public class Overload {
public static double getAverage(double[] array){
	double total = 0;
	for(int x = 0; x < array.length; x++){
		total += array[x];
	}
	return (total/array.length);
}

public static double getSum(double[] array){
	double total = 0;
	for(int x = 0; x < array.length; x++){
		total += array[x];
	}
	return (total);
}

public static double getProduct(double[] array){
	double total = 1;
	for(int x = 0; x < array.length; x++){
		total = (total * array[x]);
	}
	return (total);
}

public static double getFactorial(double[] array){
double supertotal = 0;
int counter = array.length;
	do{
	double total = 1;
	double factTotal = 1;
	for(int x = 0; x < counter; x++){
		factTotal=1;
	
		for(int y = 2; y<= array[x]; y++ )
		{ 
		factTotal= factTotal * y;
		}
	}

	supertotal += factTotal;
	counter--;
	}while(counter > 0);
	return (supertotal);
}
}
