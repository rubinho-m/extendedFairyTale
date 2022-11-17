package exceptions;

public class ChairException extends RuntimeException{ // unchecked exception
    public ChairException(String message) {
        super(message);
    }
}
