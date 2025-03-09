package headfirstbook.myimplementation.designpatterns.strategy.simuduckrefactored.behaviors;

public class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("Flying with wings");
    }
}
