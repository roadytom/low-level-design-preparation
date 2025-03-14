package headfirstbook.myimplementation.designpatterns.factory.pizzastorerefactored.abstractfactory.factorymethod;

public abstract class Pizza {
    protected String name;
    protected String sauce;
    protected String[] veggies;
    protected String cheese;
    protected String pepperoni;
    protected String clams;

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
