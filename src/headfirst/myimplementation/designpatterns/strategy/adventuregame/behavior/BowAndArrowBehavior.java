package headfirst.myimplementation.designpatterns.strategy.adventuregame.behavior;

public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Using bow and arrow");
    }
}
