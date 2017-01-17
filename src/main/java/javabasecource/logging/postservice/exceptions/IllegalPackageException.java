package javabasecource.logging.postservice.exceptions;

/**
 * Created by andrew on 17.01.17.
 */
public class IllegalPackageException extends RuntimeException {
    public IllegalPackageException(String message) {
        super(message);
    }

    public IllegalPackageException(String message, Throwable cause) {
        super(message, cause);
    }
}
