package Units;

import Enums.Races;
import Enums.SoldierClass;

/**
 * Created by Kulcsar Zoltan on 2016. 04. 23..
 */
public class Archer extends Soldier {

    protected int rangedAttack;

    public Archer (Races race) {
        this.movingSpeed=40;
        this.rangedDefense=10;
        this.meleeDefense=10;
        this.meleeAttack = 10;
        this.rangedAttack = 50;
        this.health=150;
        this.group = 4;
        this.sClass= SoldierClass.Ranged;
        this.xp=0;
        this.race = race;
        this.range=150;
    }
}
