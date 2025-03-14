package headfirstbook.myimplementation.designpatterns.factory.pizzastorerefactored.abstractfactory.factorymethod.newyorkfranchise;

import headfirstbook.myimplementation.designpatterns.factory.pizzastorerefactored.abstractfactory.factorymethod.Pizza;

public class NYPeperoniPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("New York Peperoni Pizza prepare");
    }

    @Override
    public void bake() {
        System.out.println("New York Peperoni pizza bake");
    }

    @Override
    public void cut() {
        System.out.println("New York Peperoni pizza cut");
    }

    @Override
    public void box() {
        System.out.println("New York Peperoni pizza box");
    }
}
