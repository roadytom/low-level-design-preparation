package headfirst.myimplementation.designpatterns.strategy.simuduckrefactored.ducks;

import headfirst.myimplementation.designpatterns.strategy.simuduckrefactored.behaviors.FlyBehavior;
import headfirst.myimplementation.designpatterns.strategy.simuduckrefactored.behaviors.QuackBehavior;

public abstract class Duck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public abstract void display();

    public void swim() {
        System.out.println("All ducks can swim, so I'm here");
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
