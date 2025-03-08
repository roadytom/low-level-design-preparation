package headfirst.myimplementation.designpatterns.strategy.simuduckrefactored.behaviors;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I am muted");
    }
}
