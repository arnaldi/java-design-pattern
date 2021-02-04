package FactoryPattern;

public class NYPizzaStore extends PizzaStore{

    @Override
    Pizza createPizza(String type) {
//        if(type.equals("cheese")){
//            return new NYStyleCheesePizza();
//        }else{
//            return null;
//        }

        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if(type.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);

        }

    }
}
