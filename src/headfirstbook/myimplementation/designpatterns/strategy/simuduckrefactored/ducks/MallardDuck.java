package headfirstbook.myimplementation.designpatterns.strategy.simuduckrefactored.ducks;


import headfirstbook.myimplementation.designpatterns.strategy.simuduckrefactored.behaviors.FlyWithWings;
import headfirstbook.myimplementation.designpatterns.strategy.simuduckrefactored.behaviors.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
    public void display() {
        System.out.println("I'm a mallard duck");
    }
}
