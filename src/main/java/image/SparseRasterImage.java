package image;


import javafx.scene.paint.Color;

import java.util.HashMap;
import java.util.Map;

public class SparseRasterImage extends RasterImage {

    public HashMap<Point, Color> pixelColor;

    public SparseRasterImage(Color color, int width, int height){
        setHeight(height);
        setWidth(width);
        createRepresentation();
        setPixelsColor(color);
    }

    public SparseRasterImage(Color[][] pixels){
        setHeight(pixels[0].length);
        setWidth(pixels.length);
        createRepresentation();
        setPixelsColor(pixels);
    }

    public void createRepresentation() {
        this.pixelColor = new HashMap<>();
    }

    public void setPixelColor(Color color, int x, int y) {
        pixelColor.put(new Point(x,y), color);
    }

    public Color getPixelColor(int x, int y) {
        return pixelColor.get(new Point(x,y));
    }

    private void setPixelsColor(Color[][] pixels) {
        for (int x =0 ; x < width ; x++)
            for(int y =0 ; y < height; y++)
                setPixelColor(pixels[x][y], x, y);
    }

    private void setPixelsColor(Color color) {
        for (int x =0 ; x < width ; x++)
            for(int y =0 ; y < height; y++)
                setPixelColor(color, x, y);
    }
}
