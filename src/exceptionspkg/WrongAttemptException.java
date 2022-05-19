package exceptionspkg;

/**
 *
 * @author arthu
 */
public class WrongAttemptException extends Exception {
    public WrongAttemptException(String message){
        super(message);
    }
}
