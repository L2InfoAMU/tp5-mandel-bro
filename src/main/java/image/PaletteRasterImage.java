package image;

import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

public class PaletteRasterImage implements Image {
    private List<Color> palette;
    private int[][] indexesOfColors;
    /*La classe contient les paramètres height et width, car la méthode createRepresentation crée les matrices sans appeler aucun paramètre*/
    private int height;
    private int width;

    public PaletteRasterImage(Color color, int width, int height) {
        setHeight(height);
        setWidth(width);
        createRepresentation();
        palette.add(color);
        for (int row=0 ; row<height ; row++) {
            for (int col=0 ; col<width ; col++) {
                indexesOfColors[row][col] = 0;
            }
        }
    }

    public PaletteRasterImage(Color[][] pixels) {
        setHeight(pixels.length);
        setWidth(pixels[0].length);
        createRepresentation();
        for (int row=0 ; row<height ; row++) {
            for (int col=0 ; col<width ; col++) {
                setPixelColor(pixels[row][col], row, col);
            }
        }
    }

    public void createRepresentation() {
        this.palette = new ArrayList<>();
        this.indexesOfColors = new int[height][width];
    }

    public void setPixelColor(Color color, int x, int y) {
        if (!palette.contains(color)) palette.add(color);
        indexesOfColors[x][y]=palette.indexOf(color);
    }

    public Color getPixelColor(int x, int y) {
        return palette.get(indexesOfColors[x][y]);
    }

    public void setPixelsColor(Color[][] pixels) {
        new PaletteRasterImage(pixels);
    }

    private void setPixelsColor(Color color) {
        new PaletteRasterImage(color, this.width, this.height);
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    protected void setWidth(int width) {
        this.width=width;
    }

    protected void setHeight(int height) {
        this.height=height;
    }
}
