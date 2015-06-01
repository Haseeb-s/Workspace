import java.util.*;
public class Venndo {
	public static boolean menuLoop = false;
	public static double remainder;
	public static void main(String args[]){
	 
	Scanner scanner = new Scanner(System.in);
	double SNICKERS_COST = 1.50, TWIX_COST = 1.25, KITKAT_COST = 1.5, HERSHEY_COST = 1, CRUNCH_COST = .75;
	int dollarBills=0, fiveBills=0, dimes=0, quarters=0, nickles=0, pennies=0;
	double inputTotal;
	 
	for (int x = 5; x > 0; x--){

	switch (x) {
	case 5:
	System.out.println("How many 5 dollar bills?");
	fiveBills = scanner.nextInt();
	break;
	 
	case 4: 
	System.out.println("How many 1 dollar bills?");
	dollarBills = scanner.nextInt();
	break;
	 
	case 3:
	System.out.println("How many quarters?");
	quarters = scanner.nextInt();
	break;
	 
	case 2:
	System.out.println("How many dimes?");
	dimes = scanner.nextInt();
	break;
	 
	case 1:
	System.out.println("How many nickles?");
	nickles = scanner.nextInt();
	break;
	 
	case 0:
	System.out.println("How many pennys?");
	pennies = scanner.nextInt();
	break;
	}
	}
	 
	inputTotal = ((dollarBills * 1) + (fiveBills *5) + (nickles * .05) + (dimes *.1) + (quarters *.25) + (pennies *.01));
	 
	System.out.println("Balance: " + inputTotal);
	 
	System.out.println("Choose one option:\n 1. Snickers - $1.50\n 2. Twix - $1.25\n 3. Kitkat - $1.50\n 4. Hershey - $1.00\n 5. Crunch - $.75 \n 0. Cancel");
	int input = scanner.nextInt();

	do{
	switch (input){
	case 0:
	int NoCost = 0;
	selectCalc(inputTotal,NoCost);
	break;
	case 1:
	selectCalc(inputTotal,SNICKERS_COST);
	break;
	case 2:
	selectCalc(inputTotal,TWIX_COST);
	break;
	case 3:
	selectCalc(inputTotal,KITKAT_COST);
	break;
	case 4:
	selectCalc(inputTotal,HERSHEY_COST);
	break;
	case 5:
	selectCalc(inputTotal,CRUNCH_COST);
	break;}
	
	ChangeReturn(remainder);
	
	}while(menuLoop = false);
	
	}
	 
	 
	public static void selectCalc(double balance, double cost){
	if (cost != 0)
	{
	if (balance<cost){
	System.out.println("Insufficent Funds. Please make another selection.");
	menuLoop = true;
	 }
	else
	remainder = (balance - cost);
	System.out.println("Thank you for your purchase! Your change is " + remainder );
	}
	remainder = balance;
	}
	 
	public static void ChangeReturn(double change){
		double fivesNum=0, singleNum=0, quarterNum=0, dimesNum=0, nickelNum=0, pennyNum=0;
	if ((change % 5) > 0){
	fivesNum = change % 5;
	change = change-(fivesNum *5);
	}
	 
	if ((change % 1) > 0){
	singleNum = change % 1;
	change = change-(singleNum*1);
	}
	 
	if ((change % .25) > 0){
	quarterNum = change % .25;
	change = change-(quarterNum* .25);
	}
	 
	if ((change % .1) > 0){
	dimesNum = change % .1;
	change = change-(dimesNum *.1);
	}
	if ((change % .05) > 0){
	nickelNum = change % 5;
	change = change-(nickelNum *5);
	}
	 
	if ((change % .01) > 0){
	pennyNum = change % .01;
	change = change - (pennyNum * .01);
	}
	System.out.println("Your Change is:\nFives: " + (int)fivesNum + "\nOnes: "+ (int)singleNum +"\nQuarters: " + (int)quarterNum + "\nDimes: " + (int)dimesNum  + "\nNickles: " + (int)nickelNum + "\nPennys: " + (int)pennyNum);
	 
	}
	}
	

