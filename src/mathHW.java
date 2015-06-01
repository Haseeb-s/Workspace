import java.util.*;
public class mathHW{
public static float realNum1, realNum2, imaginaryNum1, imaginaryNum2;
public static void main(String args[]){
Scanner scanner = new Scanner(System.in);
System.out.println("Please input a real number for problem set 1:");
realNum1 = scanner.nextFloat();
 
System.out.println("Please input an imaginary number for problem set 1:");
imaginaryNum1 = scanner.nextFloat();
 
System.out.println("Please input a real number for problem set 2:");
realNum2 = scanner.nextFloat();
 
System.out.println("Please input an imaginary number for problem set 2:");
imaginaryNum2 = scanner.nextFloat();
//ADDITION FORMULA
String product1 = (realNum1 + realNum2) + " + i" + (imaginaryNum1 + imaginaryNum2);
//SUBTRACTION FORMULA
String sub1 = (realNum1 - realNum2) + " + i" + (imaginaryNum1 - imaginaryNum2);
  
//MULTIPLICATION FORMULA
String mult1 = ((realNum1 * realNum2) - (imaginaryNum1 + imaginaryNum2)) + " + i" + ((imaginaryNum1 + imaginaryNum2)+(realNum1 * realNum2));
 

}
}

