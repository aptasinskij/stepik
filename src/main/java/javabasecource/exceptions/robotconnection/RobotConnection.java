package javabasecource.exceptions.robotconnection;

/**
 * Created by andrew on 16.01.17.
 */
public interface RobotConnection extends AutoCloseable {
    @Override
    void close() throws RobotConnectionException;

    void moveRobotTo(int x, int y) throws RobotConnectionException;
}
