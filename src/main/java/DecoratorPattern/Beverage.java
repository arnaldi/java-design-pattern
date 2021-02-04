package DecoratorPattern;

public abstract class Beverage {
    String descripttion = "Unknown Beverage";

    public String getDescripttion() {
        return descripttion;
    }

    public abstract double cost();
}
