package headfirstbook.myimplementation.designpatterns.strategy.adventuregame;

import headfirstbook.myimplementation.designpatterns.strategy.adventuregame.behavior.AxeBehavior;
import headfirstbook.myimplementation.designpatterns.strategy.adventuregame.behavior.BowAndArrowBehavior;
import headfirstbook.myimplementation.designpatterns.strategy.adventuregame.behavior.SwordBehavior;
import headfirstbook.myimplementation.designpatterns.strategy.adventuregame.characters.King;
import headfirstbook.myimplementation.designpatterns.strategy.adventuregame.characters.Knight;
import headfirstbook.myimplementation.designpatterns.strategy.adventuregame.characters.Queen;
import headfirstbook.myimplementation.designpatterns.strategy.adventuregame.characters.Troll;

public class AdventureGameApplication {
    public static void main(String[] args) {
        King king = new King();
        Knight knight = new Knight();
        Queen queen = new Queen();
        Troll troll = new Troll();
        king.fight();
        knight.fight();
        queen.fight();
        troll.fight();
        troll.setWeaponBehavior(new AxeBehavior());
        knight.setWeaponBehavior(new AxeBehavior());
        king.setWeaponBehavior(new BowAndArrowBehavior());
        queen.setWeaponBehavior(new SwordBehavior());
        king.fight();
        knight.fight();
        queen.fight();
        troll.fight();
    }
}
