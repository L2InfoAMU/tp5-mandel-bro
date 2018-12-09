package image;

import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

public class LogoLISFactory implements ImageFactory{
    @Override
    public Image makeImage() {
        Color dark = Color.rgb(35,31,32);
        Color greenblue = Color.rgb(113,208,199);

        int[] xCoordinates = {60,  720, 660, 400, 0,   400, 660};
        int[] yCoordinates = {0,   60,  140, 0,   0,   140, 0};
        int[] widths =       {140, 140, 140, 60,  200, 60,  200};
        int[] heights =      {280, 80,  140, 80,  340, 200, 340};

        //Ajout des paramêtres des différents SHAPE
        double radius = 50;
        double radius2 = 30;
        int[] xCoordinates2 = {30,  360, 330, 200, 0,   200, 330};
        int[] yCoordinates2 = {0,   30,  70, 0,   0,   70, 0};
        int[] widths2 =       {70, 70, 70, 60,  100, 30,  100};
        int[] heights2 =      {140, 40,  70, 80,  170, 100, 170};

        Color[] colors = {Color.WHITE, Color.WHITE, Color.WHITE, greenblue, dark, dark, dark};
        Color[] colors2 = {Color.WHITE, Color.BLUE, Color.BLACK, greenblue, dark, dark, dark};

        List<Shape> list = new ArrayList<>();

        for (int i = 0; i<colors.length; i++)
            list.add(new Rectangle(xCoordinates[i], yCoordinates[i], widths[i], heights[i], colors[i]));
            //list.add(new Disk(xCoordinates[i], yCoordinates[i], widths[i], heights[i], colors[i], radius));
            //list.add(new Annulus(new Disk(xCoordinates[i], yCoordinates[i], widths[i], heights[i], colors[i], radius),new Disk(xCoordinates2[i], yCoordinates2[i], widths2[i], heights2[i], colors[i], radius),colors2[i]));

        return new VectorImage(list, 860, 340);
    }
}