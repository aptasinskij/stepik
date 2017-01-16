package javabasecource.exceptions.robotconnection;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by andrew on 16.01.17.
 */
public class RobotConnectionManagerImpl implements RobotConnectionManager {
    @Override
    public RobotConnection getConnection() throws RobotConnectionException {
        int random = ThreadLocalRandom.current().nextInt(1, 21);
        if (random % 2 == 0) {
            throw new RobotConnectionException("The connection can not be established.");
        }
        System.out.println("Trying to establish connection...");
        System.out.println("Random = " + random);
        System.out.println("Connection successfully establish...");
        return new RobotConnectionImpl(new Robot(0, 0));
    }
}
