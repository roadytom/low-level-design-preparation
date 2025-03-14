package headfirstbook.myimplementation.designpatterns.factory.pizzastorerefactored.factorymethod.chicagofranchise;

import headfirstbook.myimplementation.designpatterns.factory.pizzastorerefactored.factorymethod.Pizza;

public class ChicagoPeperoniPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Chicago Peperoni Pizza prepare");
    }

    @Override
    public void bake() {
        System.out.println("Chicago Peperoni pizza bake");
    }

    @Override
    public void cut() {
        System.out.println("Chicago Peperoni pizza cut");
    }

    @Override
    public void box() {
        System.out.println("Chicago Peperoni pizza box");
    }
}
