package OpenClosedPrinciple.Old;

public class PriceCalculator {
    public double calculates(Product product) {

        Freight freight = new Freight();
        double discount = 0d;

        int rule = product.getPaymentMethod();

        switch(rule) {
            case 1:
                System.out.println("Cash Sale");
                PriceTableSimplePayment table1 = new PriceTableSimplePayment();
                discount = table1.calculatesDiscount(product.getValue());
                break;
            case 2:
                System.out.println("Credit Sale");
                PriceTablePaymentInInstallments table2 = new PriceTablePaymentInInstallments();
                discount = table2.calculatesDiscount(product.getValue());
                break;
        }

        double freightValue = freight.calculatesFreight(product.getState());
        return product.getValue() * (1 - discount) + freightValue;
    }
}
