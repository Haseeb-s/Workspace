import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Cycle {
    private double numberOfWheels;
    private double weight;

    public Cycle() {
        boolean pass = true;
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter value for numberOfWheels");
                this.numberOfWheels = scanner.nextDouble();
                System.out.println("Enter value for weight");
                this.weight = scanner.nextDouble();
                if (this.weight < 0 || this.numberOfWheels < 0) {
                    IOException x = new IOException();
                    throw x;
                }
                else
                    pass = false;
            } catch (InputMismatchException | IOException e) {
                System.out.println("Incorrect input!");
            }


        } while (pass);
    }

    public Cycle(double numberOfWheels, double weight) {
        this.numberOfWheels = numberOfWheels;
        this.weight = weight;
    }


    public String toString() {
        return "The number of wheels is: "
                + numberOfWheels
                + "\nThe weight is " + weight;
    }


}
