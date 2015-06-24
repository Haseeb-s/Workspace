
public class DemoVolume {
	
	public static void main(String[] args){
	Book[] bookArray = new Book[3];
	bookArray[0] = new Book("To Kill A MockingBird", "Harper Lee", 534);
	bookArray[1] = new Book("Lord Of The Flies", "William Golding", 343);
	bookArray[2] = new Book("It", "Steven King", 1106);
	
	Volume volume1 = new Volume("Haseeb's Books", 3, bookArray);
	System.out.println(volume1);
	}
}
