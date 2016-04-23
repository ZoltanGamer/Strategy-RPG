package Units;

import Enums.Races;
import Enums.SoldierClass;

/**
 * Created by Kulcsar Zoltan on 2016. 04. 23..
 */
public class Doctor extends Soldier {
protected int heal;

    public Doctor(Races race) {
        this.heal = 10;
        this.health = 200;
        this.meleeAttack = 10;
        this.meleeDefense = 10;
        this.rangedDefense = 20;
        this.movingSpeed = 30;
        this.sClass = SoldierClass.Doctor;
        this.xp = 0;
        this.race = race;
        this.range = 10;
    }
}