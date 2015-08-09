import java.io.*;
import java.net.URL;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestCycle {

    public static void main(String[] args) throws IOException {
        File outputFile = new File("C:/Users/Haseeb/IdeaProjects/CSC201/Cycle.txt");
        File inputFile = new File("C:/Users/Haseeb/IdeaProjects/CSC201/CycleIn.txt");

        BufferedWriter out = new BufferedWriter(new FileWriter(outputFile));
        BufferedReader input = new BufferedReader(new FileReader(inputFile));

        if(inputFile.exists()) {
            boolean repeat = true;
            do {
                try {
                    String line = input.readLine();
                    double numberOfWheels = Double.parseDouble(line);
                    line = input.readLine();
                    double weight = Double.parseDouble(line);

                    Cycle cycleA = new Cycle(numberOfWheels, weight);

                    if (numberOfWheels > 0 && weight > 0) {
                        repeat = false;
                        String output = cycleA.toString();
                        out.write(output);
                        out.close();
                        input.close();
                    }

                } catch (InputMismatchException e) {
                    System.out.println("INVALID INPUT");
                }
            } while (repeat);
        }

    }

}
