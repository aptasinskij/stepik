package javabasecource.exceptions.robotconnection;

/**
 * Created by andrew on 16.01.17.
 */
public interface RobotConnectionManager {
    RobotConnection getConnection() throws RobotConnectionException;
}
