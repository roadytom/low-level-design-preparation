package headfirstbook.myimplementation.designpatterns.factory.pizzastorerefactored.abstractfactory.factorymethod.chicagofranchise;

import headfirstbook.myimplementation.designpatterns.factory.pizzastorerefactored.abstractfactory.factorymethod.Pizza;
import headfirstbook.myimplementation.designpatterns.factory.pizzastorerefactored.abstractfactory.factorymethod.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {
    public Pizza createPizza(String type) {
        Pizza pizza;
        if (type.equals("cheese")) {
            pizza = new ChicagoCheesePizza();
        } else if (type.equals("peperoni")) {
            pizza = new ChicagoPeperoniPizza();
        } else {
            throw new UnsupportedOperationException();
        }
        return pizza;
    }
}
