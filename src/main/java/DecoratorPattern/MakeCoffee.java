package DecoratorPattern;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;

public class MakeCoffee {

    public static void main(String args[]){
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescripttion() + " $ "+beverage.cost());

        Beverage beverage1 = new Espresso();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        System.out.println(beverage1.getDescripttion() + " $ "+beverage1.cost());
    }
}
