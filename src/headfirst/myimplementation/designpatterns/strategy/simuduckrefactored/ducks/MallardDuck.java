package headfirst.myimplementation.designpatterns.strategy.simuduckrefactored.ducks;


import headfirst.myimplementation.designpatterns.strategy.simuduckrefactored.behaviors.FlyWithWings;
import headfirst.myimplementation.designpatterns.strategy.simuduckrefactored.behaviors.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
    public void display() {
        System.out.println("I'm a mallard duck");
    }
}
