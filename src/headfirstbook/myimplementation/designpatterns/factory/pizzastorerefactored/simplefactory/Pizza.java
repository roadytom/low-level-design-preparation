package headfirstbook.myimplementation.designpatterns.factory.pizzastorerefactored.simplefactory;

public abstract class Pizza {
    public abstract void prepare();
    public abstract void bake();
    public abstract void cut();
    public abstract void box();
}
