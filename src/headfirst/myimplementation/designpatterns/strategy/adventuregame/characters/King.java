package headfirst.myimplementation.designpatterns.strategy.adventuregame.characters;

import headfirst.myimplementation.designpatterns.strategy.adventuregame.behavior.SwordBehavior;
import headfirst.myimplementation.designpatterns.strategy.adventuregame.behavior.WeaponBehavior;

public class King extends Character {

    public King() {
        this.weaponBehavior = new SwordBehavior();
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}
