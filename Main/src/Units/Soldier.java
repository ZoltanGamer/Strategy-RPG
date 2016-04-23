package Units;

import Enums.Races;
import Enums.SoldierClass;

/**
 * Created by Kulcsar Zoltan on 2016. 04. 23..
 */
public abstract class Soldier {
    protected Races race;
    protected int health;
    protected SoldierClass sClass;
    protected int movingSpeed;
    protected int rangedDefense;
    protected int meleeDefense;
    protected int meleeAttack;
    protected int group;
    protected int xp;
    protected int range;
    protected boolean alive;

}
