package image;

import javafx.scene.paint.Color;
import util.Matrices;

public class BruteRasterImage extends RasterImage  {

    private Color[][] pixels;

    public BruteRasterImage(Color color, int width, int height){
        setWidth(width);
        setHeight(height);
        createRepresentation();
        setPixelsColor(color);
    }

    public BruteRasterImage(Color[][] colors){
        Matrices.requiresNonNull(colors);
        Matrices.requiresNonZeroDimensions(colors);
        Matrices.requiresRectangularMatrix(colors);
        setHeight(colors[0].length);
        setWidth(colors.length);
        this.pixels=colors;

    }

    public void createRepresentation(){
        pixels = new Color[width][height];
    }

    public void setPixelColor(Color color, int x, int y){
        pixels[y][x] = color;
    }

    private void setPixelsColor(Color[][] pixels){
         this.pixels= pixels;
    }

    private void setPixelsColor(Color color){
        for(int y =0 ; y <this.width ; y++)
            for(int x =0 ; x<this.height ; x++)
               setPixelColor(color,x,y);
    }

    @Override
    public Color getPixelColor(int x, int y){
        return pixels[x][y];
    }


}
