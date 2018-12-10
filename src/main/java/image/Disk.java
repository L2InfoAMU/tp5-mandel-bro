package image;

import javafx.scene.paint.Color;

public class Disk implements Shape {

    public Point origin;
    public Color color;
    public final double radius; //Radius étant un attribut final, son paramétrage n'est pas délégué à une méthode

    /**Fonction qui construit un disque de paramètres donnés
     * @param x, l'abscisse de l'origine
     * @param y, l'ordonnée de l'origine
     * @param radius, le rayon du disque
     * @param color, la couleur du disque
     */
    public Disk(int x, int y, Color color, double radius){
        this.origin = new Point(x,y);
        setColor(color);
        this.radius = radius;
    }

    /**Fonction qui construit un disque de paramètres donnés
     * @param origin, le point origine
     * @param radius, le rayon du disque
     * @param color, la couleur du disque
     */
    public Disk (Point origin, Color color, double radius) {
        this.origin = origin;
        setColor(color);
        this.radius = radius;
    }

    /**Fonction qui permet de fixer la couleur du disque
     * @param color, la couleur voulue
     */
    public void setColor (Color color) {
        this.color = color;
    }

    /**Fonction qui permet de savoir si un point est dans le disque ou pas
     * @param point,un point
     * @return true si le point est contenu dans le disque, false sinon
     */
    @Override
    public boolean contains(Point point) {
        double d = (origin.x - point.x)*(origin.x - point.x) + (origin.y - point.y) * (origin.y - point.y);
        return (d<= radius * radius);
    }


    /**Fonction qui retourne la couleur du disque
     * @return la couleur du disque
     */
    @Override
    public Color getColor() {
        return this.color;
    }
}
