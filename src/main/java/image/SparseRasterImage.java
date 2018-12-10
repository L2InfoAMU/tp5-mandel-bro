package image;


import javafx.scene.paint.Color;

import java.util.HashMap;

public class SparseRasterImage extends RasterImage {

    public HashMap<Point, Color> pixelColor;

    /**Fonction qui construit une image de taille spécifiée et dont tous les pixels sont de la couleur spécifiée
     * @param color, une couleur que l'on veut attribuer à tous les pixels
     * @param width, la largeur de l'image
     * @param height, la longueur de l'image
     */
    public SparseRasterImage(Color color, int width, int height){
        setHeight(height);
        setWidth(width);
        createRepresentation();
        setPixelsColor(color);
    }

    /**Fonction qui construit une image à partir de la matrice donnée en paramètre (et qui vérifie que la matrice soit correcte)
     * @param pixels, une matrice de coordonnées [x] [y]
     */
    public SparseRasterImage(Color[][] pixels){
        setHeight(pixels[0].length);
        setWidth(pixels.length);
        createRepresentation();
        setPixelsColor(pixels);
    }

    /**Fonction qui créer le dictionnaire HashMap<Point,Color> pour stocker l’association entre points et couleurs.*/
    public void createRepresentation() {
        this.pixelColor = new HashMap<>();
    }

    /**Fonction qui fixe la couleur d’un pixel (en associant le point de coordonnée (x, y) à la couleur)
     * @param color, une couleur que l'on veut attribuer à un pixel
     * @param x, l'ordonnée du pixel
     * @param y, l'abscisse du pixel
     */
    public void setPixelColor(Color color, int x, int y) {
        pixelColor.put(new Point(x,y), color);
    }

    /**Fonction qui retourne la couleur d'un pixel
     * @param x, l'ordonnée du pixel
     * @param y, l'abscisse du pixel
     * @return la couleur d'un pixel de coordonnées x, y
     */
    public Color getPixelColor(int x, int y) {
        return pixelColor.get(new Point(x,y));
    }

    /**Fonction qui met à jour les valeurs de couleurs de l'image en utilisant les valeurs de la matrice donnée en paramètre
     * @param pixels, une matrice de pixels qui renvoie des valeur de type Color
     */
    private void setPixelsColor(Color[][] pixels) {
        for (int x =0 ; x < getWidth() ; x++)
            for(int y =0 ; y < getHeight(); y++)
                setPixelColor(pixels[x][y], x, y);
    }

    /**Fonction qui change les valeurs de tous les pixels pour qu'ils soient tous de la couleur donnée en paramètre
     * @param color, une couleur que l'on veut attribuer à l'ensemble de pixels
     */
    private void setPixelsColor(Color color) {
        for (int x =0 ; x < getWidth() ; x++)
            for(int y =0 ; y < getHeight(); y++)
                setPixelColor(color, x, y);
    }
}
