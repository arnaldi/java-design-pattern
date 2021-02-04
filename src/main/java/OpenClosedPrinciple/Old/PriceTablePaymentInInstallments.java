package OpenClosedPrinciple.Old;

public class PriceTablePaymentInInstallments {
    public double calculatesDiscount(double value) {
        if(value > 100.0) {
            return 0.01;
        }else if(value > 500.0) {
            return 0.02;
        }else if(value > 1000.0) {
            return 0.05;
        }else {
            return 0d;
        }
    }
}
