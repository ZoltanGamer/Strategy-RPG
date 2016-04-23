package Map;

import Enums.Terrian;

/**
 * Created by Kulcsar Zoltan on 2016. 04. 23..
 */
public class Tile {
    protected Terrian terrian;
    protected int x;
    protected int y;
    protected final int size;

    public Tile(int x, int y, int size) {
        this.x=x;
        this.y=y;
        this.size=size;
    }

    public Terrian getTerrian() {
        return terrian;
    }

    public void setTerrian(Terrian terrian) {
        this.terrian = terrian;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSize() {
        return size;
    }
}
