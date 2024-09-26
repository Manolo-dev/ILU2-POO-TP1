package exceptions;

public class VillageSansChefException extends Exception {
    public VillageSansChefException() {
        super("Le village n'a pas de chef");
    }

    public VillageSansChefException(String message) {
        super(message);
    }

    public VillageSansChefException(String message, Throwable cause) {
        super(message, cause);
    }

    public VillageSansChefException(Throwable cause) {
        super(cause);
    }
}
