
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

}
