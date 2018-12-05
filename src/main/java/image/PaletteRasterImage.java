package image;

import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

public class PaletteRasterImage extends RasterImage {
    private List<Color> palette;
    private int[][] indexesOfColors;
    /*La classe contient les paramètres height et width, car la méthode createRepresentation crée les matrices sans appeler aucun paramètre*/

    public PaletteRasterImage(Color color, int width, int height) {
        setHeight(height);
        setWidth(width);
        createRepresentation();
        setPixelsColor(color);
    }
    public PaletteRasterImage(Color[][] pixels) {
        setHeight(pixels[0].length);
        setWidth(pixels.length);
        createRepresentation();
        setPixelsColor(pixels);
    }

    public void createRepresentation() {
        this.palette = new ArrayList<>();
        this.indexesOfColors = new int[width][height];
    }

    public void setPixelColor(Color color, int x, int y) {
        if (!palette.contains(color)) palette.add(color);
        indexesOfColors[x][y]=palette.indexOf(color);
    }

    public Color getPixelColor(int x, int y) {
        return palette.get(indexesOfColors[x][y]);
    }

    public void setPixelsColor(Color[][] pixels) {
        for (int y=0 ; y<height ; y++) {
            for (int x=0 ; x<width ; x++) {
                setPixelColor(pixels[x][y], x, y);
            }
        }
    }

    private void setPixelsColor(Color color) {
        for (int y=0 ; y<height ; y++) {
            for (int x=0 ; x<width ; x++) {
                setPixelColor(color, x, y);
            }
        }
    }

}
