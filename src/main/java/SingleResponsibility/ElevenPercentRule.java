package SingleResponsibility;

public class ElevenPercentRule implements CalculationRule {
    @Override
    public double calculates(Employee employee) {
        return employee.getSalary() - (employee.getSalary() * 0.11);
    }
}
