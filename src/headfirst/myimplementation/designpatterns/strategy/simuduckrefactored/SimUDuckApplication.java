package headfirst.myimplementation.designpatterns.strategy.simuduckrefactored;

import headfirst.myimplementation.designpatterns.strategy.simuduckrefactored.behaviors.FlyRocketPowered;
import headfirst.myimplementation.designpatterns.strategy.simuduckrefactored.ducks.Duck;
import headfirst.myimplementation.designpatterns.strategy.simuduckrefactored.ducks.MallardDuck;
import headfirst.myimplementation.designpatterns.strategy.simuduckrefactored.ducks.ModelDuck;

public class SimUDuckApplication {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
