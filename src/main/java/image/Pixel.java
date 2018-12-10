package image;

import javafx.scene.paint.Color;

/**
 * Created by Arnaud Labourel on 09/11/2018.
 */
public class Pixel extends Point{
    private Color color;

    /**Constructeur du pixel de paramètres donnés
     * @param x, l'abscisse du pixel
     * @param y, l'ordonnée du pixel
     * @param color, la couleur voulu du pixel
     */
    public Pixel(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

    /**Fonction qui retourne la couleur du pixel
     * @return la couleur du pixel
     */
    public Color getColor() {
        return color;
    }
}
