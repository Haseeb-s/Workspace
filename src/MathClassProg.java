import java.util.*;
public class MathClassProg {

	public static void main(String[] args) {
		Scanner keyboard =new Scanner(System.in);
		int x,y,z;
		System.out.println("Input a number(x). (x^10)");
		x = keyboard.nextInt();
	
		System.out.println("Input another number(y) to add to x. (x+y)");
		y = keyboard.nextInt();
	
		System.out.println("Input a number(z) to add to (Sqrt(x) + absolute(y) +z^y)");
		z = keyboard.nextInt();
		
		System.out.println(Math.pow(x, 10));
		System.out.println(x + y);
		System.out.println(Math.sqrt(x) + Math.abs(y) + Math.pow(z,y));
	}

}
