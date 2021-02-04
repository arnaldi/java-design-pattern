package FactoryPattern;

public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza(){
        name = "NY Style sauce and cheese pizza";
        dough= "Thin crust Dough";
        sauce = "marinara sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
