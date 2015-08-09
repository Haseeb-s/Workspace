import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by Haseeb on 8/9/2015.
 */
public class ReadMe {
    public static void main(String[] args) {
        try {
            RandomAccessFile pledge = new RandomAccessFile("pledge.txt", "rw");
            pledge.seek(124);
            System.out.println(pledge.readLine());
        }
        catch (IOException e){
            System.out.print("File not found!");
    }

}
}
