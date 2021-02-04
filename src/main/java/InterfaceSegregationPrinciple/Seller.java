package InterfaceSegregationPrinciple;

public class Seller extends Employee implements Commissionable {
    private double salary;
    private int totalSales;

    public Seller(double salary, int totalSales) {
        this.salary = salary;
        this.totalSales = totalSales;
    }

    @Override
    public double getSalary() {
        return this.salary + this.getCommission();
    }

    @Override
    public double getCommission() {
        return this.totalSales * 0.2;
    }

    @Override
    public String toString() {
        return "Seller [salary=" + salary + ", totalSales=" + totalSales + "]";
    }
}
