package image;

import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

public class PaletteRasterImage extends RasterImage {
    private List<Color> palette;
    private int[][] indexesOfColors;

    /*Fonction qui construit une image de taille spécifiée et dont tous les pixels sont de la couleur spécifiée
     * @param color, une couleur que l'on veut attribuer à tous les pixels
     * @param width la largeur de l'image
     * @param height la longueur de l'image
     */
    public PaletteRasterImage(Color color, int width, int height) {
        setHeight(height);
        setWidth(width);
        createRepresentation();
        setPixelsColor(color);
    }

    /*Fonction qui construit une image à partir de la matrice donnée en paramètre (et qui vérifie que la matrice soit correcte)
     * @param une matrice de coordonnées [x] [y]
     */
    public PaletteRasterImage(Color[][] pixels) {
        setHeight(pixels[0].length);
        setWidth(pixels.length);
        createRepresentation();
        setPixelsColor(pixels);
    }

    /*Fonction qui créer la représentation d'une PaletteRasterImage, c'est à dire qu'on alloue la liste pour stocker la palette et la matrice représentant
l’image */
    public void createRepresentation() {
        this.palette = new ArrayList<>();
        this.indexesOfColors = new int[getWidth()][getHeight()];
    }


    /*Fonction qui fixe la couleur d’un pixel (en ajoutant la couleur à la palette si elle n’était pas dans la palette).
     * @param une couleur que l'on veut attribuer à un pixel
     * @param x, l'ordonnée du pixel
     * @param y, l'abscisse du pixel
     */
    public void setPixelColor(Color color, int x, int y) {
        if (!palette.contains(color)) palette.add(color);
        indexesOfColors[x][y]=palette.indexOf(color);
    }

    /*Fonction qui retourne la couleur d'un pixel
     * @param x, l'ordonnée du pixel
     * @param y, l'abscisse du pixel
     * @return la couleur d'un pixel de coordonnées x, y
     */
    public Color getPixelColor(int x, int y) {
        return palette.get(indexesOfColors[x][y]);
    }

    /*Fonction qui met à jour les valeurs de couleurs de l'image en utilisant les valeurs de la matrice donnée en paramètre
     * @param une matrice de pixels qui renvoie des valeur de type Color
     */
    public void setPixelsColor(Color[][] pixels) {
        for (int y=0 ; y<getHeight() ; y++) {
            for (int x=0 ; x<getWidth() ; x++) {
                setPixelColor(pixels[x][y], x, y);
            }
        }
    }

    /*Fonction qui change les valeurs de tous les pixels pour qu'ils soient tous de la couleur donnée en paramètre
     * @param une couleur que l'on veut attribuer à l'ensemble de pixels
     */
    private void setPixelsColor(Color color) {
        for (int y=0 ; y<getHeight() ; y++) {
            for (int x=0 ; x<getWidth() ; x++) {
                setPixelColor(color, x, y);
            }
        }
    }

}
