package headfirstbook.myimplementation.designpatterns.strategy.simuduckrefactored.behaviors;

public class Squek implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("rubber duckie squek");
    }
}
