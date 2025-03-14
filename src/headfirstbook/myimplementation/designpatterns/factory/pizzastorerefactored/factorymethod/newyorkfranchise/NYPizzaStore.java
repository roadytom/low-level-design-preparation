package headfirstbook.myimplementation.designpatterns.factory.pizzastorerefactored.factorymethod.newyorkfranchise;

import headfirstbook.myimplementation.designpatterns.factory.pizzastorerefactored.factorymethod.Pizza;
import headfirstbook.myimplementation.designpatterns.factory.pizzastorerefactored.factorymethod.PizzaStore;

public class NYPizzaStore extends PizzaStore {
    public Pizza createPizza(String type) {
        Pizza pizza;
        if (type.equals("cheese")) {
            pizza = new NYCheesePizza();
        } else if (type.equals("peperoni")) {
            pizza = new NYPeperoniPizza();
        } else {
            throw new UnsupportedOperationException();
        }
        return pizza;
    }
}
