package headfirst.myimplementation.designpatterns.strategy.adventuregame.characters;

import headfirst.myimplementation.designpatterns.strategy.adventuregame.behavior.KnifeBehavior;
import headfirst.myimplementation.designpatterns.strategy.adventuregame.behavior.SwordBehavior;
import headfirst.myimplementation.designpatterns.strategy.adventuregame.behavior.WeaponBehavior;

public class Queen extends Character {

    public Queen() {
        this.weaponBehavior = new KnifeBehavior();
    }

    @Override
    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}
