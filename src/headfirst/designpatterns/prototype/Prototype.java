package headfirst.designpatterns.prototype;

public class Prototype {
    public Prototype copy() {
        return new ConcretePrototype1();
    }
}
