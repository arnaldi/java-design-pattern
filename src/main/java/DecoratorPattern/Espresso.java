package DecoratorPattern;

public class Espresso extends Beverage {

    public Espresso(){
        descripttion = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
