package image;

import javafx.scene.paint.Color;

import java.util.List;

public class VectorImage extends RasterImage {

    private List<Shape> shapes;

    /**Fonction qui construit une image de la taille spécifiée et avec les formes données en paramètre.
     * @param shapes, une liste de formes
     * @param width la largeur de l'image
     * @param height la longueur de l'image
     */
    public VectorImage(List<Shape> shapes, int width, int height){
        this.shapes = shapes;
        setHeight(height);
        setWidth(width);

    }

    /**Fonction qui retourne la couleur d'un pixel
     * @param x, l'ordonnée du pixel
     * @param y, l'abscisse du pixel
     * @return la couleur d'un pixel de coordonnées x, y s'il est contenu dans la forme, blanc s'il ne l'est pas
     */
    @Override
    public Color getPixelColor(int x, int y) {
        for(Shape shape : shapes) {
            if(shape.contains(new Point(x,y))) return shape.getColor();
        }
        return Color.WHITE;
    }
}
