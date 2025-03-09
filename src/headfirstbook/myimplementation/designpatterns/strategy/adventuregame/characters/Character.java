package headfirstbook.myimplementation.designpatterns.strategy.adventuregame.characters;

import headfirstbook.myimplementation.designpatterns.strategy.adventuregame.behavior.WeaponBehavior;

public abstract class Character {
    protected WeaponBehavior weaponBehavior;

    public void fight() {
        weaponBehavior.useWeapon();
    }

    public abstract void setWeaponBehavior(WeaponBehavior weaponBehavior);
}
