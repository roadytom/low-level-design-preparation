package headfirstbook.myimplementation.designpatterns.strategy.simuduckrefactored.behaviors;

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly");
    }
}
