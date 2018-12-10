package image;

public abstract class RasterImage implements Image {

    protected int width;
    protected int height;

    /*Fonction qui retourne la largeur de l'image
     * @return la largeur de l'image
     */
    @Override
    public int getWidth(){
        return width;
    }

    /*Fonction qui retourne la longueur de l'image
     * @return la longueur de l'image
     */
    @Override
    public int getHeight(){
        return height;
    }

    /*Fonction qui fixe la largeur de l'image
     * @param la largeur de l'image que l'on veut
     */
    protected void setWidth(int width){
        this.width=width;
    }

    /*Fonction qui fixe la longueur de l'image
     * @param la longueur de l'image que l'on veut
     */
    protected void setHeight(int height){
        this.height=height;
    }
}
