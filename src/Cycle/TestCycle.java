import java.util.InputMismatchException;
import java.util.Scanner;

public class TestCycle {

    public static void main(String[] args) {
        double numberOfWheels = 0;
        double weight = 0;
        try{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value for numberOfWheels");
        numberOfWheels = scanner.nextDouble();
        System.out.println("Enter value for weight");
        weight = scanner.nextDouble();}
        catch (InputMismatchException e){
            System.out.println("INVALID INPUT");
        }
        Cycle cycleA = new Cycle(numberOfWheels,weight);
        System.out.println(cycleA);

        //B
        System.out.println("PART B");
        Cycle cycleB = new Cycle();
        System.out.println(cycleB);
    }

}
