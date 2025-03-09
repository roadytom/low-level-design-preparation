package headfirstbook.myimplementation.designpatterns.strategy.simuduckrefactored.behaviors;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack, quack");
    }
}
