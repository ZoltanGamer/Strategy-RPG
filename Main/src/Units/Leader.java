package Units;

import Enums.Races;
import Enums.SoldierClass;

/**
 * Created by Kulcsar Zoltan on 2016. 04. 23..
 */
public class Leader extends Soldier {
    protected int leadBonus;

    public Leader(Races race) {
        this.leadBonus = 10;
        this.health = 130;
        this.meleeAttack = 30;
        this.meleeDefense = 30;
        this.rangedDefense = 40;
        this.movingSpeed = 35;
        this.sClass = SoldierClass.Leader;
        this.xp = 0;
        this.race = race;
        this.range = 10;
    }
}
