package headfirstbook.myimplementation.designpatterns.strategy.adventuregame.characters;

import headfirstbook.myimplementation.designpatterns.strategy.adventuregame.behavior.SwordBehavior;
import headfirstbook.myimplementation.designpatterns.strategy.adventuregame.behavior.WeaponBehavior;

public class King extends Character {

    public King() {
        this.weaponBehavior = new SwordBehavior();
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}
