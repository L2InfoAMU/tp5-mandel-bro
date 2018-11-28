package image;

import javafx.scene.paint.Color;
import util.Matrices;

public class BruteRasterImage implements Image  {

    private Color[][] pixels;
    private int width;
    private int height;

    public BruteRasterImage(Color color, int width, int height){
        for (int row =0 ; row< height ; row++)
            for (int col =0 ; col< width ; col++)
                this.pixels[row][col] = color;
    }

    public BruteRasterImage(Color[][] colors){
        this.pixels=colors;
    }

    public void createRepresentation(){

    }

    public void setPixelColor(Color color, int x, int y){
        pixels[y][x] = color;
    }

    private void setPixelsColor(Color[][] pixels){
         this.pixels= pixels;
    }

    private void setPixelsColor(Color color){
        for(int row =0 ; row <pixels[0].length ; row++)
            for(int col =0 ; col<pixels.length ; col++)
                pixels[row][col] = color;
    }

    @Override
    public Color getPixelColor(int x, int y){
        return pixels[y][x];
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
