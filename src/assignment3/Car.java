import java.util.Random;


public class Car {
    Random random = new Random();
    public int from;
    public int to;
    public int wait = 0;
    public int position = 1;

    public Car(int from){
        this.from = from;
        int togo = -1;
        do {
            togo = random.nextInt((3) - 0 + 1);
        }while(!(togo != from));
        this.to = togo;
    }
    public Car(int from, int position){
        this.from = from;
        int togo = -1;
        this.position = position;
        do {
            togo = random.nextInt((3) - 0 + 1);
        }while(!(togo != from));
        wait = position*2;
        this.to = togo;
    }
    public void addWait(int wait){
        this.wait += wait;
    }

    public int getWait(){
        return wait;
    }
    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public int getTo() {
        return to;
    }

    public void setTo(int to) {
        this.to = to;
    }

    @Override
    public String toString() {
        return "Car{" +
                "from=" + from +
                ", to=" + to +
                '}';
    }
}
