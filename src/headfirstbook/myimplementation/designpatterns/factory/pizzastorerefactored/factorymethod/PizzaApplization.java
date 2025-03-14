package headfirstbook.myimplementation.designpatterns.factory.pizzastorerefactored.factorymethod;

import headfirstbook.myimplementation.designpatterns.factory.pizzastorerefactored.factorymethod.chicagofranchise.ChicagoPizzaStore;
import headfirstbook.myimplementation.designpatterns.factory.pizzastorerefactored.factorymethod.newyorkfranchise.NYPizzaStore;

public class PizzaApplization {
    public static void main(String[] args) {
        PizzaStore pizzaStore1 = new NYPizzaStore();
        PizzaStore pizzaStore2 = new ChicagoPizzaStore();
        var peperoniPizza1 = pizzaStore1.orderPizza("peperoni");
        var cheesePizza1 = pizzaStore1.orderPizza("cheese");
        var peperoniPizza2 = pizzaStore2.orderPizza("peperoni");
        var cheesePizza2 = pizzaStore2.orderPizza("cheese");
    }

}
