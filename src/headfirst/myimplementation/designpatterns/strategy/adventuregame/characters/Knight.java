package headfirst.myimplementation.designpatterns.strategy.adventuregame.characters;

import headfirst.myimplementation.designpatterns.strategy.adventuregame.behavior.AxeBehavior;
import headfirst.myimplementation.designpatterns.strategy.adventuregame.behavior.SwordBehavior;
import headfirst.myimplementation.designpatterns.strategy.adventuregame.behavior.WeaponBehavior;

public class Knight extends Character {
    public Knight() {
        this.weaponBehavior = new SwordBehavior();
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}
