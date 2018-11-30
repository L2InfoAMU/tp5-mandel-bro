package image;

import javafx.scene.paint.Color;
import util.Matrices;

public class BruteRasterImage implements Image  {

    private Color[][] pixels;
    private int width;
    private int height;

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
        pixels[x][y] = color;
    }

    private void setPixelsColor(Color[][] pixels){
         this.pixels= pixels;
    }

    private void setPixelsColor(Color color){
        for(int y =0 ; y <this.width ; y++)
            for(int x =0 ; x<this.height ; x++)
                pixels[x][y] = color;
    }

    @Override
    public Color getPixelColor(int x, int y){
        return pixels[x][y];
    }

    @Override
    public int getWidth(){
        return width;
    }

    @Override
    public int getHeight(){
        return height;
    }

    protected void setWidth(int width){
        this.width=width;
    }

    protected void setHeight(int height){
        this.height=height;
    }

}
