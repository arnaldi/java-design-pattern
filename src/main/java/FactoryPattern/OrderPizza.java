package FactoryPattern;

public class OrderPizza {
    public static void main(String[] args){
        PizzaStore nyStore = new NYPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");

    }
}
