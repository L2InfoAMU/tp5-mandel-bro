package image;

import javafx.scene.paint.Color;
import util.Matrices;

public class BruteRasterImage implements Image{

    private Color[][] pixels;

    public BruteRasterImage(Color color, int width, int height){
        Color[][] pixels = new Color[height][width];
        for (int row = 0 ;row < height ; row++)
            for (int col = 0; col <width ;col++)
                pixels[row][col] = color;

    }

    public BruteRasterImage(Color[][] colors){
        this.pixels=colors;
    }



    @Override
    public Color getPixelColor(int x, int y){
        return pixels[y][x];
    }
    @Override
    public int getWidth(){
        return pixels[0].length;
    }
    @Override
    public int getHeight(){
        return pixels.length;
    }

}
