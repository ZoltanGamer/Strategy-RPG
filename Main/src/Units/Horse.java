package Units;

/**
 * Created by Kulcsar Zoltan on 2016. 04. 23..
 */
public class Horse /*extends Soldier*/ {
    /*protected HorseType horseType;  //lipicai stb...  */
    protected int health;
    protected int movingSpeed;
    protected int rangedDefense;
    protected int meleeDefense;
    protected int meleeAttack;
    protected int xp;

    public Horse () {
        this.health=400;
        this.movingSpeed= 120;
        this.rangedDefense = 30;
        this.meleeDefense = 40;
        this.meleeAttack = 20; //for ability or low health instant kill (trample)
        this.xp=0;

    }

}
