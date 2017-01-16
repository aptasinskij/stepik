package javabasecource.exceptions.robotconnection;

/**
 * Created by andrew on 16.01.17.
 */
public class RobotApp {

    public static void main(String[] args) {
        new RobotApp().moveRobot(new RobotConnectionManagerImpl(), 10, 10);
    }

    public static void moveRobot(RobotConnectionManager connectionManager, int toX, int toY){
        int tryCounter = 1;
        boolean isDone = false;
        while (tryCounter < 4 && !isDone){
            try(RobotConnection connection = connectionManager.getConnection()) {
                connection.moveRobotTo(toX, toY);
                isDone = true;
            } catch (RobotConnectionException ex){
                System.out.println(tryCounter + " try...");
                tryCounter++;
            }
        }
        if (isDone){
            return;
        } else {
            throw new RobotConnectionException("Looser!");
        }
    }

}
