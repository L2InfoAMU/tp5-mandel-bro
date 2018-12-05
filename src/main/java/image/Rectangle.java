package image;

import javafx.scene.paint.Color;


public class Rectangle implements Shape {

    Rectangle(int x, int y, int width, int height, Color color){
        Point p1 = new Point(x, y);
        Point p2 = new Point(x+width,y);
        Point p3 = new Point(x, y+height);
        Point p4 = new Point(x+width,y+height);
    }


    @Override
    public boolean contains(Point point){

    }

    @Override
    public Color getColor(){

    }
}
