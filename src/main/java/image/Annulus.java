package image;

import javafx.scene.paint.Color;

public class Annulus implements Shape{
    public Disk innerDisk;
    public Disk outerDisk;
    public Color color;

    /*Fonction qui construit un anneau de paramètres donnés
     * @param innerDisk, le disque intérieur de l'anneau
     * @param outerDisk, le disque extérieur de l'anneau
     * @param color, la couleur de l'anneau
     */
    public Annulus (Disk innerDisk, Disk outerDisk, Color color){
        this.innerDisk=innerDisk;
        this.outerDisk=outerDisk;
        this.color=color;
    }

    /*Fonction qui permet de savoir si un point est dans l'anneau ou pas
     * @param un point
     * @return true si le point est contenu dans l'anneau, false sinon
     */
    @Override
    public boolean contains(Point point) {
        return innerDisk.contains(point) && !(outerDisk.contains(point));
    }


    /*Fonction qui retourne la couleur de l'anneau
     * @return la couleur de l'anneau
     */
    @Override
    public Color getColor() {
        return this.color;
    }
}
