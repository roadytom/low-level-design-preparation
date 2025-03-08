package headfirst.myimplementation.designpatterns.strategy.adventuregame.behavior;

public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Using sword");
    }
}
