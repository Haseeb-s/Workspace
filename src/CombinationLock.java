public class CombinationLock {
	int number1;
	int number2;
	int number3;
	
	
	public void resetLock() {
		this.number1 = 0;
		this.number2 = 0;
		this.number3 = 0;
	}
	
	public CombinationLock() {
		this.number1 = 0;
		this.number2 = 0;
		this.number3 = 0;	
	}
	
	public CombinationLock(int num1, int num2, int num3) {
		this.number1 = num1;
		this.number2 = num2;
		this.number3 = num3;
	}
	
	public void turnLeft(int position, int turn){
		if (position == 1)
			number1= number1 - turn;
		if (position == 2)
			number2= number2 - turn;
		if (position == 3)
			number3= number3 - turn;
	}
	public void turnRight(int position, int turn){
		if (position == 1)
			number1= number1 + turn;
		if (position == 2)
			number2= number2 + turn;
		if (position == 3)
			number3= number3 + turn;
	}
	
	public void setNumber1(int num1) {
		this.number1 = num1;
	}
	public void setNumber2(int num2) {
		this.number2 = num2;
	}
	public void setNumber3(int num3) {
		this.number3 = num3;
	}
	
	public int getNumber1() {
		return number1;
	}
	public int getNumber2() {
		return number2;
	}
	public int getNumber3() {
		return number3;
	}
	
	public boolean openLock(int num1, int num2, int num3){
		boolean open = false;
		
		if (num1 == this.number1 && num2 == this.number2 &&  num3 == this.number3)
			open = true;
		
		return open;
	}

	public String toString() {
		return "Combination: "
				+ "\nFirst number:" + number1 + 
				"\nSecond number:" + number2
				+ "\nThird number:" + number3;
	}
	
}
