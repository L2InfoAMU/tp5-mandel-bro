package image;

import javafx.scene.paint.Color;

public class Annulus implements Shape{
    public Disk innerDisk;
    public Disk outerDisk;
    public Color color;

    public Annulus (Disk innerDisk, Disk outerDisk, Color color){
        this.innerDisk=innerDisk;
        this.outerDisk=outerDisk;
        this.color=color;
    }

    @Override
    public boolean contains(Point point) {
        return innerDisk.contains(point) && !(outerDisk.contains(point));
    }

    @Override
    public Color getColor() {
        return this.color;
    }
}
