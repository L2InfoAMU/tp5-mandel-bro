package image;

public class NotSupportedException extends RuntimeException {

    /*Constructeur d'exception qui renvoie un message*/
    public NotSupportedException(String message) {
        super(message);
    }

}
