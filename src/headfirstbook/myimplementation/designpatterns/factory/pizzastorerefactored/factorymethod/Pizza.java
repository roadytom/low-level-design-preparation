package headfirstbook.myimplementation.designpatterns.factory.pizzastorerefactored.factorymethod;

import headfirstbook.myimplementation.designpatterns.factory.pizzastorerefactored.factorymethod.ingredients.*;

public abstract class Pizza {
    private String name;
    private Sauce sauce;
    private Veggies[] veggies;
    private Cheese cheese;
    private Pepperoni pepperoni;
    private Clams clams;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza");
    }

    public void box() {
        System.out.println("Boxing");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
