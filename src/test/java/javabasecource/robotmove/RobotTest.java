package javabasecource.robotmove;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by andrew on 13.01.17.
 */
public class RobotTest {

    private Robot robot;

    @Test
    public void stepForwardWhenLookUp(){
        robot = new Robot(0, 0, Direction.UP);
        robot.stepForward();
        Assert.assertTrue("Value of Y must increment", robot.getY() == 1);
    }

    @Test
    public void stepForwardWhenLookDown(){
        robot = new Robot(0, 0, Direction.DOWN);
        robot.stepForward();
        Assert.assertTrue("Value of Y must decrement", robot.getY() == -1);
    }

    @Test
    public void stepForwardWhenLookLeft(){
        robot = new Robot(0, 0, Direction.LEFT);
        robot.stepForward();
        Assert.assertTrue("Value of X must decrement", robot.getX() == -1);
    }

    @Test
    public void stepForwardWhenLookRight(){
        robot = new Robot(0, 0, Direction.RIGHT);
        robot.stepForward();
        Assert.assertTrue("Value of X must increment", robot.getX() == 1);
    }

    @Test
    public void turnLeftWhenLookUp(){
        robot = new Robot(0, 0, Direction.UP);
        robot.turnLeft();
        Assert.assertTrue(robot.getDirection() == Direction.LEFT);
        robot.turnLeft();
        Assert.assertTrue(robot.getDirection() == Direction.DOWN);
    }

    @Test
    public void countDistanceWhenOn0Position(){
        robot = new Robot(0, 0, Direction.UP);
        Assert.assertTrue(robot.countXDistance(10) == 10);
        Assert.assertTrue(robot.countXDistance(-4) == 4);
        Assert.assertTrue(robot.countYDistance(-12) == 12);
        Assert.assertTrue(robot.countYDistance(2) == 2);
    }

    @Test
    public void countDistanceWhenOnMinusPosition(){
        robot = new Robot(-10, -10, Direction.DOWN);
        Assert.assertTrue(robot.countXDistance(10) == 20);
    }

    @Test
    public void moveToDestinationCord(){
        robot = new Robot(0, 0, Direction.DOWN);
        robot.moveTo(-10, 20);
        Assert.assertTrue(robot.getX() == -10 && robot.getY() == 20 && robot.getDirection() == Direction.UP);
    }

}