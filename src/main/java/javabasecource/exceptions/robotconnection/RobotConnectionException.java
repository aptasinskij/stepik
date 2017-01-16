package javabasecource.exceptions.robotconnection;

/**
 * Created by andrew on 16.01.17.
 */
public class RobotConnectionException extends RuntimeException {
    public RobotConnectionException(String message) {
        super(message);
    }

    public RobotConnectionException(String message, Throwable cause) {
        super(message, cause);
    }
}
