package headfirst.myimplementation.designpatterns.strategy.simuduckrefactored.ducks;


import headfirst.myimplementation.designpatterns.strategy.simuduckrefactored.behaviors.FlyNoWay;
import headfirst.myimplementation.designpatterns.strategy.simuduckrefactored.behaviors.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I am Model duck");
    }
}
