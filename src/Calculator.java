
public class Calculator {

	public static void main(String[] args) {
	Overload calc = new Overload();
	//sum = 21, average = 3.5, product = 720
	double[] array = {1,2,3,4,5,6};
	
	System.out.println("Sum is : " + calc.getSum(array));
	
	System.out.println("Average is : " + calc.getAverage(array));

	System.out.println("Product is : " +calc.getProduct(array));
	}
}
