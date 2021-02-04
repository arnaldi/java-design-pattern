package OpenClosedPrinciple;

public class PriceCalculatorNew {
    private PriceTable table;
    private FreightService freight;

    public PriceCalculatorNew(PriceTable table, FreightService freight) {
        this.table = table;
        this.freight = freight;
    }

    public double calculates(Product product) {
        double discount = table.calculatesDiscount(product.getValue());
        double freightValue = freight.calculatesFreight(product.getState());
        return product.getValue() * (1 - discount) + freightValue;
    }
}
