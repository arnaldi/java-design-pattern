package OpenClosedPrinciple;

public class PriceTableSimplePaymentNew implements PriceTable {
    @Override
    public double calculatesDiscount(double value) {
        if(value > 100.0) {
            return 0.05;
        }else if(value > 500.0) {
            return 0.07;
        }else if(value > 1000.0) {
            return 0.10;
        }else {
            return 0d;
        }
    }
}
