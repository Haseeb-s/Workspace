/**
 * Created by Haseeb on 8/4/2015.
 */
public class RegularPay extends PayCalculator{
    public RegularPay(double payRate){
        super(payRate);
    }

    public double computePay(int hours) {
        return (hours*payRate);
    }
}
