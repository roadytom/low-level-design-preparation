package headfirstbook.myimplementation.designpatterns.factory.pizzastorerefactored.factorymethod.chicagofranchise;

import headfirstbook.myimplementation.designpatterns.factory.pizzastorerefactored.factorymethod.Pizza;

public class ChicagoCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Chicago Cheese Pizza prepare");
    }

    @Override
    public void bake() {
        System.out.println("Chicago Cheese pizza bake");
    }

    @Override
    public void cut() {
        System.out.println("Chicago Cheese pizza cut");
    }

    @Override
    public void box() {
        System.out.println("Chicago Cheese pizza box");
    }
}
