package headfirstbook.myimplementation.designpatterns.factory.pizzastorerefactored.abstractfactory.factorymethod.newyorkfranchise;

import headfirstbook.myimplementation.designpatterns.factory.pizzastorerefactored.abstractfactory.factorymethod.Pizza;

public class NYCheesePizza extends Pizza {
    public NYCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }

    @Override
    public void prepare() {
        System.out.println("New York Cheese Pizza prepare");
    }

}
