package headfirstbook.myimplementation.designpatterns.factory.pizzastorerefactored.factorymethod.newyorkfranchise;

import headfirstbook.myimplementation.designpatterns.factory.pizzastorerefactored.factorymethod.Pizza;

public class NYCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("New York Cheese Pizza prepare");
    }

}
