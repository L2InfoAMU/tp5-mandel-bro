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
        palette.add(color);
        for (int y=0 ; y<height ; y++) {
            for (int x=0 ; x<width ; x++) {
                indexesOfColors[x][y] = 0;
            }
        }
    }
    public PaletteRasterImage(Color[][] pixels) {
        setPixelsColor(pixels);
    }

    public void createRepresentation() {
        this.palette = new ArrayList<>();
        this.indexesOfColors = new int[height][width];
    }

    public void setPixelColor(Color color, int x, int y) {
        if (!palette.contains(color)) palette.add(color);
        indexesOfColors[y][x]=palette.indexOf(color);
    }

    public Color getPixelColor(int x, int y) {
        return (palette.get(indexesOfColors[y][x]));
    }

    public void setPixelsColor(Color[][] pixels) {

        setHeight(pixels[0].length);
        setWidth(pixels.length);
        createRepresentation();
        for (int y=0 ; y<height ; y++) {
            for (int x=0 ; x<width ; x++) {
                setPixelColor(pixels[x][y], x, y);
            }
        }
    }

    private void setPixelsColor(Color color) {
        new PaletteRasterImage(color, this.width, this.height);
    }

}
