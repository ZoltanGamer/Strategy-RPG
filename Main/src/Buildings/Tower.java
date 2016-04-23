package Buildings;

/**
 * Created by Kulcsar Zoltan on 2016. 04. 23..
 */
public class Tower {
    private int borderRadius;
    private int capacity;
    private int gateLife;
    private int level;
    private int defenseBonus;
    private int attackBonus;
    private boolean underConstruction;

    public Tower (){
        this.borderRadius=500;
        this.capacity=4;
        this.gateLife=20;
        this.defenseBonus=2;
        this.attackBonus=2;
        this.level=0;
    }
}
