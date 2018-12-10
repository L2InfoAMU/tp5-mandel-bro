package image;

import javafx.scene.paint.Color;

public class RasterUniformImageFactory implements ImageFactory {
    private int width;
    private int height;
    private Color color;
    private RasterImageType rasterImageType;

    /**Constructeur du RasterUniformImageFactory de paramètres donnés
     * @param width la largeur de l'image
     * @param height la longueur de l'image
     * @param color, la couleur de l'image
     * @param rasterImageType, une image de type Raster
     */
    public RasterUniformImageFactory(int width, int height, Color color, RasterImageType rasterImageType) {
        this.width = width;
        this.height = height;
        this.color = color;
        this.rasterImageType = rasterImageType;
    }

    /**Fonction qui créer l'image*/
    @Override
    public Image makeImage() {
        switch (rasterImageType){
            case BRUTE:
                return new BruteRasterImage(color, width, height);
            case PALETTE:
                return new PaletteRasterImage(color, width,height);
            case SPARSE:
                return new SparseRasterImage(color, width, height);
            default:
                throw new NotSupportedException(rasterImageType + " is not supported");
        }
    }
}