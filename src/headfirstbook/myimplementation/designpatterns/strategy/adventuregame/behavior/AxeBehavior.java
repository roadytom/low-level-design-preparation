package headfirstbook.myimplementation.designpatterns.strategy.adventuregame.behavior;

public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Using axe");
    }
}
