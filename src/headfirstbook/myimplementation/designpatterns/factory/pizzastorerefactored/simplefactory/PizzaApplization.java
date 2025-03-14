package headfirstbook.myimplementation.designpatterns.factory.pizzastorerefactored.simplefactory;

public class PizzaApplization {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore();
        var peperoniPizza = pizzaStore.orderPizza("peperoni");
        var cheesePizza = pizzaStore.orderPizza("cheese");
    }
}
