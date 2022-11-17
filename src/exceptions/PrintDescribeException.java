package exceptions;

public class PrintDescribeException extends RuntimeException{ // unchecked exception
    public PrintDescribeException(String message) {
        super(message);
    }
}
