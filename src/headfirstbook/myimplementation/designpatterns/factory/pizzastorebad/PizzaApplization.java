package headfirstbook.myimplementation.designpatterns.factory.pizzastorebad;

public class PizzaApplization {
    public static void main(String[] args) {
        var peperoniPizza    = orderPizza("peperoni");
        var cheesePizza = orderPizza("cheese");
    }

    private static Pizza orderPizza(String type) {
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
