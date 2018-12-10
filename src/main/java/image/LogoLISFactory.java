package image;

import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

public class LogoLISFactory implements ImageFactory {
    @Override
    public Image makeImage() {
        Color dark = Color.rgb(35, 31, 32);
        Color greenblue = Color.rgb(113, 208, 199);

        int[] xCoordinates = {60, 720, 660, 400, 0, 400, 660};
        int[] yCoordinates = {0, 60, 140, 0, 0, 140, 0};
        int[] widths = {140, 140, 140, 60, 200, 60, 200};
        int[] heights = {280, 80, 140, 80, 340, 200, 340};

        //Ajout des paramêtres des différents SHAPE
        double radius = 50;

        Color[] colors = {Color.WHITE, Color.WHITE, Color.WHITE, greenblue, dark, dark, dark};
        Color[] colors2 = {Color.BLACK, Color.DARKBLUE, Color.LIGHTGREY, greenblue, dark, Color.CHARTREUSE, Color.CHOCOLATE};

        List<Shape> list = new ArrayList<>();

        //list.add(new Annulus(new Disk(xCoordinates[0], yCoordinates[0], greenblue, radius), new Disk(xCoordinates2[0], yCoordinates2[0], Color.WHITE, radius2)));

        for (int i = 0; i < colors.length; i++) {
            list.add(new Rectangle(xCoordinates[i], yCoordinates[i], widths[i], heights[i], colors[i]));
            //list.add(new Disk(xCoordinates[i], yCoordinates[i], colors2[i], radius));
            //list.add(new Annulus(new Disk(xCoordinates[i], yCoordinates[i], colors2[i], radius),20));
        }
        return new VectorImage(list, 860, 340);

    }
}