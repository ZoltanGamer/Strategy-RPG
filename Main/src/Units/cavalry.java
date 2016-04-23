package Units;

import Enums.Races;
import Enums.SoldierClass;

/**
 * Created by Kulcsar Zoltan on 2016. 04. 23..
 */
public class Cavalry extends Soldier{
protected Horse ownedHorse;
    protected boolean onHorse;

    public Cavalry (Races race) {
        this.ownedHorse = new Horse();
        this.health = 100;
        this.movingSpeed = 20;
        this.meleeDefense = 60;
        this.rangedDefense = 50;
        this.meleeAttack = 70;
        this.sClass= SoldierClass.Cavalry;
        this.group=1;
        this.onHorse=true;
        this.xp=0;
        this.race = race;
        this.range=10;
    }
}
