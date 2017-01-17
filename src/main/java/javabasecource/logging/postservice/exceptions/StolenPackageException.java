package javabasecource.logging.postservice.exceptions;

/**
 * Created by andrew on 17.01.17.
 */
public class StolenPackageException extends RuntimeException {
    public StolenPackageException(String message) {
        super(message);
    }

    public StolenPackageException(String message, Throwable cause) {
        super(message, cause);
    }
}
