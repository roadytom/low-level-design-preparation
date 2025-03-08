package headfirst.myimplementation.designpatterns.strategy.adventuregame.characters;

import headfirst.myimplementation.designpatterns.strategy.adventuregame.behavior.AxeBehavior;
import headfirst.myimplementation.designpatterns.strategy.adventuregame.behavior.KnifeBehavior;
import headfirst.myimplementation.designpatterns.strategy.adventuregame.behavior.WeaponBehavior;

public class Troll extends Character {

    public Troll() {
        this.weaponBehavior = new AxeBehavior();
    }

    @Override
    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}
