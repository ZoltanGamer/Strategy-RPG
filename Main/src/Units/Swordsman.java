package Units;

import Enums.Races;
import Enums.SoldierClass;

/**
 * Created by Kulcsar Zoltan on 2016. 04. 23..
 */
public class Swordsman extends Soldier {
    public Swordsman (Races race){
        this.health=180;
        this.meleeAttack=50;
        this.meleeDefense=40;
        this.rangedDefense=40;
        this.movingSpeed=30;
this.sClass = SoldierClass.Swordsman;
        this.xp = 0;
        this.race = race;
        this.range=10;
    }
}
