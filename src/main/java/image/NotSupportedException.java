package image;

public class NotSupportedException extends RuntimeException {
    public String string;

    public NotSupportedException (String message){
        this.string = message;

    }
}
