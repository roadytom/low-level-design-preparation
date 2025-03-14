package headfirstbook.myimplementation.designpatterns.factory.pizzastorerefactored.simplefactory;

public class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza;
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("peperoni")) {
            pizza = new PeperoniPizza();
        } else {
            throw new UnsupportedOperationException();
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
