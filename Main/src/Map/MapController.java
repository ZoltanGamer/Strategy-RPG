package Map;

import javafx.fxml.FXML;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;

/**
 * Created by Kulcsar Zoltan on 2016. 04. 23..
 */
public class MapController extends AbstractMapController/*<MapElement>*/ {
    protected Tile[][] mapTile;

    @FXML
    protected StackPane root;

    public MapController () {
        this.mapTile= new Tile[1366][768];
        for (int i = 0; i<1366; i++){
            for (int j = 0; j<768; j++){
                mapTile[i][j] = new Tile(i, j, 1);
                drawTiles(mapTile[i][j]);
            }
        }
    }

    public void drawTiles (Tile[][]){
        Rectangle rectangle = new Rectangle(i,j,1.0,1.0);
        rectangle.setFill();
        Polygon pol = new Polygon(i,i-1, j, j-1);
    }
}
