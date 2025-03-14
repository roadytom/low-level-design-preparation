package headfirstbook.myimplementation.designpatterns.factory.pizzastorerefactored.simplefactory;

public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Cheese Pizza prepare");
    }

    @Override
    public void bake() {
        System.out.println("Cheese pizza bake");
    }

    @Override
    public void cut() {
        System.out.println("Cheese pizza cut");
    }

    @Override
    public void box() {
        System.out.println("Cheese pizza box");
    }
}
