import java.io.*;
public class RoomDriver {

	public static void main(String[] args) {

		Room BradleesRoom = new Room("yellow", "hardwood", 1);
		Room FitzRoom = new Room("Purple", "tiled", 0);
		Room TanesRoom = new Room("white", "carpet", 3);

		System.out.println(BradleesRoom);

		System.out.println(FitzRoom);

		System.out.println(TanesRoom);
		
		File potato = new File("info.txt");
		
		
	}

}
