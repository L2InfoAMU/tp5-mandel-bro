package image;

import javafx.scene.paint.Color;

public class Annulus implements Shape{
    public Disk outerDisk;
    public double thickness;
    private Disk innerDisk;

    /**Fonction qui construit un anneau à partir des paramètres donnés
     * @param outerDisk, le disque extérieur de l'anneau (le plus grand)
     * @param thickness, l'épaisseur de l'anneau
     */
    public Annulus (Disk outerDisk, double thickness){
        this.outerDisk= new Disk (outerDisk.origin, outerDisk.color, outerDisk.radius);
        this.thickness= thickness;
        this.innerDisk= new Disk (outerDisk.origin, Color.WHITE, outerDisk.radius-thickness);
    }

    /**Fonction qui permet de savoir si un point est dans l'anneau ou pas
     * @param point, un point
     * @return true si le point est contenu dans l'anneau, false sinon
     */
    @Override
    public boolean contains(Point point) {
        return outerDisk.contains(point) && !(innerDisk.contains(point));
    }


    /**Fonction qui retourne la couleur de l'anneau
     * @return la couleur de l'anneau
     */
    @Override
    public Color getColor() {
        return outerDisk.color;
    }
}
