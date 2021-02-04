package InterfaceSegregationPrinciple.Old;

public class Developer extends Employee {
    private double salary;

    public Developer(double salary) {
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }

    @Override
    public double getCommission() {
        return 0d;
    }
}
