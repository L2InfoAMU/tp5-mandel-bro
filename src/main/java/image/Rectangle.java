package image;

import javafx.scene.paint.Color;


public class Rectangle implements Shape {

    public Point origin;
    public int width;
    public int height;
    public Color color;


    public Rectangle(int x, int y, int width, int height, Color color){
        this.origin = new Point(x,y);
        this.width = width;
        this.height = height;
        this.color = color;
    }


    @Override
    public boolean contains(Point point){
        return(point.x >= origin.x && point.y >= origin.y && point.x <= this.height && point.y <=this.width);
    }

    @Override
    public Color getColor(){
        return this.color;
    }
}
