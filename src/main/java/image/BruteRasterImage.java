package image;

import javafx.scene.paint.Color;

public class BruteRasterImage {

    private Color[][] pixels;


    public BruteRasterImage(Color color, int width, int height){
        this.pixels = new Color[height][width];
    }


}
