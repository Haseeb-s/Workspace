import java.util.LinkedList;


import java.util.Queue;

public class Director {
    public Queue<Car> carList = new LinkedList<Car>();
    public Queue topIn = new LinkedList<Car>();
    public Queue topOut = new LinkedList<Car>();
    public Queue botIn = new LinkedList<Car>();
    public Queue botOut = new LinkedList<Car>();
    public Queue leftIn = new LinkedList<Car>();
    public Queue leftOut = new LinkedList<Car>();
    public Queue rightIn = new LinkedList<Car>();
    public Queue rightOut = new LinkedList<Car>();
    public void route(int from) throws InterruptedException{

        Car newCar = new Car(from);
        switch (from){
            case 0: topIn.add(newCar); pushTop(); break;
            case 1: rightIn.add(newCar); pushRight() ;break;
            case 2: botIn.add(newCar); pushBot(); break;
            case 3: leftIn.add(newCar); pushLeft(); break;
        }

        Thread.sleep(1500);

        switch (from){
            case 0: topIn.poll(); break;
            case 1: rightIn.poll(); break;
            case 2: botIn.poll(); break;
            case 3: leftIn.poll(); break;
        }

        int to = newCar.getTo();
        switch (to){
            case 0: topOut.add(newCar); popTop();break;
            case 1: rightOut.add(newCar); popRight(); break;
            case 2: botOut.add(newCar); popBot(); break;
            case 3: leftOut.add(newCar); popLeft(); break;
        }

        Thread.sleep(300);

        switch (to){
            case 0: topOut.poll(); break;
            case 1: rightOut.poll(); break;
            case 2: botOut.poll(); break;
            case 3: leftOut.poll(); break;
        }


    }
    public void routeStats(Car newCar) throws InterruptedException{

        switch (newCar.getFrom()){
            case 0: topIn.add(newCar); break;
            case 1: rightIn.add(newCar);break;
            case 2: botIn.add(newCar);break;
            case 3: leftIn.add(newCar);break;
        }


        int to = newCar.getTo();
        switch (to){
            case 0: topOut.add(newCar); break;
            case 1: rightOut.add(newCar); break;
            case 2: botOut.add(newCar); break;
            case 3: leftOut.add(newCar); break;
        }
        carList.add(newCar);
    }

    public void streetStats(Car thisCar){
        switch (thisCar.getFrom()){
            case 0: topIn.poll(); break;
            case 1: rightIn.poll();break;
            case 2: botIn.poll();break;
            case 3: leftIn.poll();break;
        }
        Main temp = new Main();
        System.out.println("Cars Remaining: " + (temp.numCar - thisCar.position));
        System.out.println("");
        System.out.println("Coming from North: " + topIn.size());
        System.out.println("Coming from East: " + rightIn.size());
        System.out.println("Coming from South: " + botIn.size());
        System.out.println("Coming from West: " + leftIn.size());
        System.out.println("");
        String carName = ("Car #" + thisCar.position);

        System.out.println(carName+"'s position: " + thisCar.position);
        System.out.println(carName+" came from the " + getDirection(thisCar.getFrom()));
        System.out.println(carName+" is heading to the " + getDirection(thisCar.getTo()));
        System.out.println(carName+" had to wait " + thisCar.getWait() + " seconds.");

    }
    public String getDirection(int x){
        String direction = "";
        switch(x) {
            case 0:
                direction = "North";
                break;
            case 1:
                direction = "East";
                break;
            case 2:
                direction = "South";
                break;
            case 3:
                direction = "West";
                break;
        }
        return direction;
    }
    public void drawStreet(){
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("-----         -----");
        java.lang.System.out.println("                   ");
        java.lang.System.out.println("=====         =====");
        java.lang.System.out.println("                   ");
        java.lang.System.out.println("-----         -----");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");

    }
    public void pushTop() throws InterruptedException{
        cleanConsole();
        java.lang.System.out.println("      |x| |");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("-----         -----");
        java.lang.System.out.println("                   ");
        java.lang.System.out.println("=====         =====");
        java.lang.System.out.println("                   ");
        java.lang.System.out.println("-----         -----");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        Thread.sleep(600);
        cleanConsole();

        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      |x| |");
        java.lang.System.out.println("      | | |");        java.lang.System.out.println("-----         -----");
        java.lang.System.out.println("                   ");
        java.lang.System.out.println("=====         =====");
        java.lang.System.out.println("                   ");
        java.lang.System.out.println("-----         -----");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        Thread.sleep(600);
        cleanConsole();

        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      |x| |");        java.lang.System.out.println("-----         -----");
        java.lang.System.out.println("                   ");
        java.lang.System.out.println("=====         =====");
        java.lang.System.out.println("                   ");
        java.lang.System.out.println("-----         -----");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        Thread.sleep(600);
    }
    public void popTop() throws InterruptedException{
        cleanConsole();
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | |x|");
        java.lang.System.out.println("-----         -----");
        java.lang.System.out.println("                   ");
        java.lang.System.out.println("=====         =====");
        java.lang.System.out.println("                   ");
        java.lang.System.out.println("-----         -----");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        Thread.sleep(600);
        cleanConsole();

        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | |x|");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("-----         -----");
        java.lang.System.out.println("                   ");
        java.lang.System.out.println("=====         =====");
        java.lang.System.out.println("                   ");
        java.lang.System.out.println("-----         -----");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        Thread.sleep(600);
        cleanConsole();

        java.lang.System.out.println("      | |x|");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("-----         -----");
        java.lang.System.out.println("                   ");
        java.lang.System.out.println("=====         =====");
        java.lang.System.out.println("                   ");
        java.lang.System.out.println("-----         -----");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        Thread.sleep(600);
    }
    public void pushBot() throws InterruptedException{

        cleanConsole();
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");        java.lang.System.out.println("-----         -----");
        java.lang.System.out.println("                   ");
        java.lang.System.out.println("=====         =====");
        java.lang.System.out.println("                   ");
        java.lang.System.out.println("-----         -----");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | |x|");
        Thread.sleep(600);
        cleanConsole();

        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");        java.lang.System.out.println("-----         -----");
        java.lang.System.out.println("                   ");
        java.lang.System.out.println("=====         =====");
        java.lang.System.out.println("                   ");
        java.lang.System.out.println("-----         -----");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | |x|");
        java.lang.System.out.println("      | | |");
        Thread.sleep(600);
        cleanConsole();

        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");        java.lang.System.out.println("-----         -----");
        java.lang.System.out.println("                   ");
        java.lang.System.out.println("=====         =====");
        java.lang.System.out.println("                   ");
        java.lang.System.out.println("-----         -----");
        java.lang.System.out.println("      | |x|");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        Thread.sleep(600);
    }
    public void popBot() throws InterruptedException{

        cleanConsole();
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("-----         -----");
        java.lang.System.out.println("                   ");
        java.lang.System.out.println("=====         =====");
        java.lang.System.out.println("                   ");
        java.lang.System.out.println("-----         -----");
        java.lang.System.out.println("      |x| |");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        Thread.sleep(600);
        cleanConsole();

        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("-----         -----");
        java.lang.System.out.println("                   ");
        java.lang.System.out.println("=====         =====");
        java.lang.System.out.println("                   ");
        java.lang.System.out.println("-----         -----");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      |x| |");
        java.lang.System.out.println("      | | |");
        Thread.sleep(600);
        cleanConsole();

        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("-----         -----");
        java.lang.System.out.println("                   ");
        java.lang.System.out.println("=====         =====");
        java.lang.System.out.println("                   ");
        java.lang.System.out.println("-----         -----");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      |x| |");
        Thread.sleep(600);
    }

    public void pushLeft() throws InterruptedException{
        cleanConsole();
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");        java.lang.System.out.println("-----         -----");
        java.lang.System.out.println("                   ");
        java.lang.System.out.println("=====         =====");
        java.lang.System.out.println("x                  ");
        java.lang.System.out.println("-----         -----");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        Thread.sleep(600);
        cleanConsole();

        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");        java.lang.System.out.println("-----         -----");
        java.lang.System.out.println("                   ");
        java.lang.System.out.println("=====         =====");
        java.lang.System.out.println(" x                 ");
        java.lang.System.out.println("-----         -----");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        Thread.sleep(600);
        cleanConsole();

        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");        java.lang.System.out.println("-----         -----");
        java.lang.System.out.println("                   ");
        java.lang.System.out.println("=====         =====");
        java.lang.System.out.println("    x              ");
        java.lang.System.out.println("-----         -----");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        Thread.sleep(600);
    }
    public void popLeft() throws InterruptedException{
        cleanConsole();
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("-----         -----");
        java.lang.System.out.println("    x              ");
        java.lang.System.out.println("=====         =====");
        java.lang.System.out.println("                   ");
        java.lang.System.out.println("-----         -----");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        Thread.sleep(600);
        cleanConsole();

        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("-----         -----");
        java.lang.System.out.println(" x                 ");
        java.lang.System.out.println("=====         =====");
        java.lang.System.out.println("                   ");
        java.lang.System.out.println("-----         -----");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        Thread.sleep(600);
        cleanConsole();

        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("-----         -----");
        java.lang.System.out.println("x                  ");
        java.lang.System.out.println("=====         =====");
        java.lang.System.out.println("                    ");
        java.lang.System.out.println("-----         -----");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        Thread.sleep(600);
    }
    public void pushRight() throws InterruptedException{

        cleanConsole();
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");        java.lang.System.out.println("-----         -----");
        java.lang.System.out.println("                  x");
        java.lang.System.out.println("=====         =====");
        java.lang.System.out.println("                   ");
        java.lang.System.out.println("-----         -----");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | ||");
        Thread.sleep(600);
        cleanConsole();

        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");        java.lang.System.out.println("-----         -----");
        java.lang.System.out.println("               x   ");
        java.lang.System.out.println("=====         =====");
        java.lang.System.out.println("                   ");
        java.lang.System.out.println("-----         -----");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        Thread.sleep(600);
        cleanConsole();

        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");        java.lang.System.out.println("-----         -----");
        java.lang.System.out.println("              x    ");
        java.lang.System.out.println("=====         =====");
        java.lang.System.out.println("                   ");
        java.lang.System.out.println("-----         -----");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        Thread.sleep(600);
    }
    public void popRight() throws InterruptedException{

        cleanConsole();
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("-----         -----");
        java.lang.System.out.println("                   ");
        java.lang.System.out.println("=====         =====");
        java.lang.System.out.println("              x    ");
        java.lang.System.out.println("-----         -----");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        Thread.sleep(600);
        cleanConsole();

        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("-----         -----");
        java.lang.System.out.println("                   ");
        java.lang.System.out.println("=====         =====");
        java.lang.System.out.println("               x   ");
        java.lang.System.out.println("-----         -----");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        Thread.sleep(600);
        cleanConsole();

        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("-----         -----");
        java.lang.System.out.println("                   ");
        java.lang.System.out.println("=====         =====");
        java.lang.System.out.println("                  x");
        java.lang.System.out.println("-----         -----");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        java.lang.System.out.println("      | | |");
        Thread.sleep(600);
    }
    public void cleanConsole(){
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");

    }
    public void cleanStatsConsole(){
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
}
