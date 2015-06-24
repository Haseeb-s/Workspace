import java.util.Scanner;
public class Locker {
	int lockerNum;
	int numberOfBooks;
	String lockerName;
	private CombinationLock newLocker = new CombinationLock();
	
	public Locker(){
		lockerNum = 0;
		lockerName = "No Name";
		numberOfBooks = 0;
		newLocker.resetLock();
	}
	
	public Locker(int lockerNum, String lockerName, int numberOfBooks, CombinationLock newLocker){
		this.lockerNum = lockerNum;
		this.numberOfBooks = numberOfBooks;
		this.lockerName = lockerName;
		this.newLocker = newLocker;
	}
	
	

	public void setLockerNumber(int lockerNum) {
		this.lockerNum = lockerNum;
	}
	public void setNumberOfBooks(int numberOfBooks) {
		this.numberOfBooks = numberOfBooks;
	}
	public void setStudentName(String lockerName) {
		this.lockerName = lockerName;
	}
	public void setnewLock(int num1, int num2, int num3) {
		this.newLocker.setNumber1(num1); 
		this.newLocker.setNumber1(num2); 
		this.newLocker.setNumber1(num3); 
	}

	
	public String getLockerName() {
		return lockerName;
	}
	public int getLockerNumber() {
			return lockerNum;
	}
	public int getNumberOfBooks() {
		return numberOfBooks;
	}
	public String getnewLock() {
		return newLocker.toString();
	}

	public void removeBookFromLocker(){
		if (numberOfBooks != 0)
			numberOfBooks--;
		else
			System.out.println("There are 0 books!");
	}
	
	public void putBookInLocker(){
		numberOfBooks++;
	}
	public void openLocker(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input numbers to open lock.");
		System.out.print("Input number 1: ");
		int num1 = scanner.nextInt();
		System.out.print("\nInput number 2: ");
		int num2 = scanner.nextInt();
		System.out.print("\nInput number 3: ");
		int num3 = scanner.nextInt();
		
		boolean result = newLocker.openLock(num1, num2, num3);
		
		if(result)
			System.out.println("The combination worked!");
		else
			System.out.println("Incorrect combination");
		
	}
	
	public String toString() {
		return "Locker Info:"
				+ "\nlocker Number = " + lockerNum
				+ "\nLocker Name = " + lockerName 
				+"\nNumber of Books: " + numberOfBooks
				+ "\nLocker Combo: " + newLocker; 
	}
}
