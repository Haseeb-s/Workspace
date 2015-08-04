/**
 * Created by Haseeb on 8/4/2015.
 */
public class hazardPay extends PayCalculator {
    public hazardPay(double payRate) {
        super(payRate);
    }
    @Override
    public double computePay(int hours) {
        return (hours * payRate*1.5);
    }
}
