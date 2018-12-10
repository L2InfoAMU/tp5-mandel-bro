package image;

import javafx.scene.paint.Color;

public class RasterFlagFactory implements ImageFactory {

    private int width;
    private int height;
    private Color leftColor;
    private Color middleColor;
    private Color rightColor;
    private RasterImageType rasterImageType;

    /*Constructeur du RasterFlagFactory de paramètres donnés
     * @param width la largeur de l'image
     * @param height la longueur de l'image
     * @param leftColor, la couleur de gauche
     * @param middleColor, la couleur du milieu
     * @param rightColor, la couleur de droite
     * @param rasterImageType, une image de type Raster
     */
    public RasterFlagFactory(int width, int height, Color leftColor, Color middleColor, Color rightColor, RasterImageType rasterImageType) {
        this.width = width;
        this.height = height;
        this.leftColor = leftColor;
        this.middleColor = middleColor;
        this.rightColor = rightColor;
        this.rasterImageType = rasterImageType;
    }

    /*Fonction qui créer l'image*/
    @Override
    public Image makeImage() {
        Color[][] colors = new Color[width][height];

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                colors[x][y] = (x < width / 3) ? leftColor : ((x > 2 * width / 3) ? rightColor : middleColor);
            }
        }
        switch (rasterImageType){
            case BRUTE:
                return new BruteRasterImage(colors);
            case PALETTE:
                return new PaletteRasterImage(colors);
            case SPARSE:
                return new SparseRasterImage(colors);
            default:
                throw new NotSupportedException(rasterImageType + " is not supported");
        }
    }
}