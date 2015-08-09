import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestCycle {

    public static void main(String[] args) throws IOException{
        BufferedWriter out = new BufferedWriter(new FileWriter("Cycle.txt"));
        boolean repeat = true;
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter value for numberOfWheels");
                double numberOfWheels = scanner.nextDouble();
                System.out.println("Enter value for weight");
                double weight = scanner.nextDouble();

                Cycle cycleA = new Cycle(numberOfWheels, weight);

                if (numberOfWheels > 0 && weight > 0) {
                    repeat = false;
                    String output = cycleA.toString();
                    out.write(output);
                    out.close();
                }

            } catch (InputMismatchException e) {
                System.out.println("INVALID INPUT");
            }
        } while (repeat);

        //B
        System.out.println("PART B");
        Cycle cycleB = new Cycle();
        System.out.println(cycleB);
    }

}
