
public class PayCalcDriver {
    public static void main(String[] args){
        double payrate = 10;
        RegularPay regPay = new RegularPay(payrate);
        System.out.println(regPay.computePay(40));

        PayCalculator hazPay = new hazardPay(payrate);
        System.out.println(hazPay.computePay(50));
    }
}
