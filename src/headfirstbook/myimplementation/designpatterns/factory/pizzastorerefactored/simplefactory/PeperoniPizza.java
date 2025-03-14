package headfirstbook.myimplementation.designpatterns.factory.pizzastorerefactored.simplefactory;

public class PeperoniPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Peperoni Pizza prepare");
    }

    @Override
    public void bake() {
        System.out.println("Peperoni pizza bake");
    }

    @Override
    public void cut() {
        System.out.println("Peperoni pizza cut");
    }

    @Override
    public void box() {
        System.out.println("Peperoni pizza box");
    }
}
