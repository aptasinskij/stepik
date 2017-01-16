package javabasecource.exceptions.robotconnection;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by andrew on 16.01.17.
 */
public class RobotConnectionImpl implements RobotConnection {

    private Robot robot;

    public RobotConnectionImpl(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void moveRobotTo(int x, int y) throws RobotConnectionException {
        int random = ThreadLocalRandom.current().nextInt(1, 3);
        if (random % 2 == 0){
            System.out.println("Robot move from: [" + robot.getX() + ";" + robot.getY() + "] to "
                    + "[" + x + ";" + y + "]");
            robot.setX(x);
            robot.setY(y);
            return;
        }
        throw new RobotConnectionException("The connection suddenly interrupted...");
    }

    @Override
    public void close() throws RobotConnectionException {
        int random = ThreadLocalRandom.current().nextInt(1, 3);
        if (random % 2 == 0){
            System.out.println("Trying to close the connection... Random: " + random);
            robot = null;
            return;
        }
        throw new RobotConnectionException("Connection can not be closed...");
    }

}
