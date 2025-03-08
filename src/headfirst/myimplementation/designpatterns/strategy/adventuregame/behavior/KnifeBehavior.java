package headfirst.myimplementation.designpatterns.strategy.adventuregame.behavior;

public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Using knife");
    }
}
