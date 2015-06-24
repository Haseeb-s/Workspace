
public class LockerDriver {

	public static void main(String[] args) {
		CombinationLock Mickey = new CombinationLock(28,17,39);
		Locker mLocker = new Locker(100,"Mickey's Locker", 3, Mickey);
		
		CombinationLock Donald = new CombinationLock(35,16,27);
		Locker dLocker = new Locker(275, "Donald's Locker",0, Donald);
		
		for(int x = 0; x < 3; x++){
		mLocker.putBookInLocker();}
		mLocker.openLocker();
		dLocker.removeBookFromLocker();
	

	System.out.println(dLocker);

	System.out.println(mLocker);
}
}
