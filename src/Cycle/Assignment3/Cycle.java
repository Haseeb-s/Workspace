import java.io.IOException;
        import java.util.InputMismatchException;
        import java.util.Scanner;

public class Cycle {
    private double numberOfWheels;
    private double weight;

    public Cycle() {

        try {
            if (this.weight < 0 || this.numberOfWheels < 0) {
                IOException x = new IOException();
                throw x;
            }

        } catch (IOException e) {
            System.out.println("Incorrect input!");
        }
    }

    public Cycle(double numberOfWheels, double weight) {

        try {
            if (weight < 0 || numberOfWheels < 0) {
                IOException x = new IOException();
                throw x;
            } else {
                this.numberOfWheels = numberOfWheels;
                this.weight = weight;
            }
        } catch (IOException e) {
            System.out.println("Incorrect input!");
        }
    }


    public String toString() {
        return "The number of wheels is: "
                + numberOfWheels
                + "\nThe weight is " + weight;
    }


}
