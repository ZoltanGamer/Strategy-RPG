package Units;

import Enums.Races;
import Enums.SoldierClass;

/**
 * Created by Kulcsar Zoltan on 2016. 04. 23..
 */
public class Pikeman extends Soldier {
    public Pikeman (Races race){
    this.health=140;
    this.meleeAttack=40;
    this.meleeDefense=30;
    this.rangedDefense=20;
    this.movingSpeed=40;
    this.sClass = SoldierClass.Pikeman;
    this.xp = 0;
    this.race = race;
    this.range=30;
}
}
