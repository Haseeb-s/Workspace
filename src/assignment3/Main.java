
import java.util.Queue;
import java.util.Random;

public class Main {

    public static int numCar;
    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        Director test = new Director();
//        do {
//            int whereStart = random.nextInt((3) - 0 + 1);
//            test.route(whereStart);
//        } while (true);

        numCar = random.nextInt(101);

        for (int x = 1; x <= numCar; x++){
            int whereStart = random.nextInt((3) - 0 + 1);
            Car newCar = new Car(whereStart,x);
            test.routeStats(newCar);
        }

        Queue<Car> carList = test.carList;
        int maxLoop = carList.size();
        for(int j = 0; j<maxLoop;j++){
            Thread.sleep(2000);
            test.streetStats(carList.poll());}
    }
}
