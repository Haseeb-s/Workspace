import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Haseeb on 8/9/2015.
 */
public class ReadWrite {
    public static void main(String[] args) throws IOException {
        File file = new File("Stu.dat");
        RandomAccessFile output = new RandomAccessFile(file, "rw");
        boolean repeat = true;
        int studentID = 0, studentGPA = 0;
        ArrayList<Integer> sID = new ArrayList<Integer>();
        ArrayList<Integer> sGPA = new ArrayList<Integer>();
        do {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("Input a student ID (0 to cancel)");
                studentID = scanner.nextInt();

                if (studentID == 0)
                    repeat = false;
                else {
                    sID.add(studentID);
                    System.out.println("Input a student GPA ");
                    studentGPA = scanner.nextInt();
                    sGPA.add(studentGPA);
                }

            } catch (InputMismatchException e) {
                System.out.println("INCORRECT INPUT FOOL");
            } finally {
                output.write(studentID);
                output.write(studentGPA);
            }
        } while (repeat);
        output.close();


            System.out.println(sID.toString());
            System.out.println(sGPA.toString());

    }
}
