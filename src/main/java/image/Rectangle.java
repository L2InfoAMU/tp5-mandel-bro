package image;

import javafx.scene.paint.Color;


public class Rectangle implements Shape {

    public Point origin;
    public int width;
    public int height;
    public Color color;

    /*Fonction qui construit un rectangle au point donné, de taille spécifiée et de couleur donnée
     * @param x, l'abscisse du point de départ du rectangle
     * @param y, l'ordonnée du point de départ du rectangle
     * @param height la longueur de l'image
     * @param width, la largeur de l'image
     * @param color, la couleur du rectangle
     */
    public Rectangle(int x, int y, int width, int height, Color color){
        this.origin = new Point(x,y);
        this.width = width;
        this.height = height;
        this.color = color;
    }

    /*Fonction qui permet de savoir si un point est dans le rectangle ou pas
     * @param un point
     * @return true si le point est contenu dans le rectangle, false sinon
     */
    @Override
    public boolean contains(Point point){
        return(point.x >= origin.x && point.y >= origin.y && point.x <= (origin.x+this.width) && point.y <= (origin.y+this.height));
    }

    /*Fonction qui retourne la couleur du rectangle
     * @return la couleur du rectangle
     */
    @Override
    public Color getColor(){
        return this.color;
    }
}
