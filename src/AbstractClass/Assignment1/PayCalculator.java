/**
 * Created by Haseeb on 8/4/2015.
 */
public abstract class PayCalculator{
    double payRate; //implement dollars per hour
    public PayCalculator(double payrate){
        this.payRate = payrate;
    }
    public abstract double computePay(int hours);
}
