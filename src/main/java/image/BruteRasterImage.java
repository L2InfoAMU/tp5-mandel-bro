package image;

import javafx.scene.paint.Color;
import util.Matrices;

public class BruteRasterImage extends RasterImage  {

    private Color[][] pixels;

    /**Fonction qui construit une image de taille spécifiée et dont tous les pixels sont de la couleur spécifiée
     * @param color, une couleur que l'on veut attribuer à tous les pixels
     * @param width, la largeur de l'image
     * @param height, la longueur de l'image
     */
    public BruteRasterImage(Color color, int width, int height){
        setWidth(width);
        setHeight(height);
        createRepresentation();
        setPixelsColor(color);
    }

    /**Fonction qui construit une image à partir de la matrice donnée en paramètre (et qui vérifie que la matrice soit correcte)
     * @param colors, une matrice de couleurs de coordonnées [x] [y]
     */
    public BruteRasterImage(Color[][] colors){
        Matrices.requiresNonNull(colors);
        Matrices.requiresNonZeroDimensions(colors);
        Matrices.requiresRectangularMatrix(colors);
        setHeight(colors[0].length);
        setWidth(colors.length);
        this.pixels=colors;

    }

    /**Fonction qui créer la représentation d'une BruteRasterImage, c'est à dire qu'on alloue la matrice qui représente l'image*/
    public void createRepresentation(){
        pixels = new Color[getWidth()][getHeight()];
    }

    /**Fonction qui fixe la couleur d'un pixel en fonction de ses paramètres
     * @param color, une couleur que l'on veut attribuer à un pixel
     * @param x, l'ordonnée du pixel
     * @param y, l'abscisse du pixel
     */
    public void setPixelColor(Color color, int x, int y){
        pixels[y][x] = color;
    }

    /**Fonction qui retourne la couleur d'un pixel
     * @param x, l'ordonnée du pixel
     * @param y, l'abscisse du pixel
     * @return la couleur d'un pixel de coordonnées x, y
     */
    @Override
    public Color getPixelColor(int x, int y){
        return pixels[x][y];
    }

    /**Fonction qui met à jour les valeurs de couleurs de l'image en utilisant les valeurs de la matrice donnée en paramètre
     * @param pixels, une matrice de pixels qui renvoie des valeur de type Color
     */
    private void setPixelsColor(Color[][] pixels){
         this.pixels= pixels;
    }

    /**Fonction qui change les valeurs de tous les pixels pour qu'ils soient tous de la couleur donnée en paramètre
     * @param color, une couleur que l'on veut attribuer à l'ensemble de pixels
     */
    private void setPixelsColor(Color color){
        for(int y =0 ; y <getWidth() ; y++)
            for(int x =0 ; x<getHeight() ; x++)
               setPixelColor(color,x,y);
    }
}
