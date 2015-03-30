import java.util.Scanner;

public class NoMathClassProg {


	public static void main(String[] args) {
		Scanner keyboard =new Scanner(System.in);
		int x,y,z;
		System.out.println("Input a number(x). (x^10)");
		x = keyboard.nextInt();
	
		System.out.println("Input another number(y) to add to x. (x+y)");
		y = keyboard.nextInt();
	
		System.out.println("Input a number(z) to add to (Sqrt(x) + absolute(y) +z^y)");
		z = keyboard.nextInt();
		
		System.out.println(MathExp(x, 10));
		System.out.println(x + y);
		System.out.println(MathSqrt(x) + MathAbs(y) + MathExp(z,y));
	}
	
	public static double MathExp (int x,int y){
	for (int count = 1; count < y; count++){
		x+=x;

	}
	return x;
	}
	
	public static double MathSqrt (int number){
		double t;
		 
		double squareRoot = number / 2;
	 
		do {
			t = squareRoot;
			squareRoot = (t + (number / t)) / 2;
		} while ((t - squareRoot) != 0);
	 
		return squareRoot;
		}
	
	
	
	public static double MathAbs (int x){
		
		if (x<0){
			x = (x/-1);
		}
		return x;
		}
	
	

}
