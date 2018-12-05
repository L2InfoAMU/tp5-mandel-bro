package image;


import javafx.scene.paint.Color;

import java.util.HashMap;
import java.util.Map;

public class SparseRasterImage extends HashMap {

    public HashMap<Point, Color> pixelColor = new HashMap();

    public SparseRasterImage(Color color, int width, int height){
        for (int x =0 ; x < width ; x++)
            for(int y =0 ; y < height; y++)
                pixelColor.put(new Point(x,y), color);

    }
    public SparseRasterImage(Color[][] pixels){

    }

    public int getHeigth(){

    }
}
