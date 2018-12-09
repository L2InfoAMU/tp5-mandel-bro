package image;

import javafx.scene.paint.Color;

public class Disk implements Shape {

    public Point origin;
    public int width;
    public int height;
    public Color color;
    public double radius;

    public Disk(int x, int y, int width, int height, Color color, double radius){
        this.origin = new Point(x,y);
        this.width = width;
        this.height = height;
        this.color = color;
        this.radius = radius;
    }

    @Override
    public boolean contains(Point point) {
        double d = (origin.x - point.x)*(origin.x - point.x) + (origin.y - point.y) * (origin.y - point.y);
        return (d<= radius * radius);
    }

    @Override
    public Color getColor() {
        return this.color;
    }
}
