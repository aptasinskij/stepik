package javabasecource.robotmove;

/**
 * Created by andrew on 13.01.17.
 */
public class Robot {

    private int x;
    private int y;
    private Direction direction;

    public Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Direction getDirection() {
        return direction;
    }

    public void turnLeft() {
        switch (direction) {
            case UP:
                direction = Direction.LEFT;
                break;
            case RIGHT:
                direction = Direction.UP;
                break;
            case DOWN:
                direction = Direction.RIGHT;
                break;
            case LEFT:
                direction = Direction.DOWN;
                break;
        }
    }

    public void turnRight() {
        switch (direction) {
            case UP:
                direction = Direction.RIGHT;
                break;
            case RIGHT:
                direction = Direction.DOWN;
                break;
            case DOWN:
                direction = Direction.LEFT;
                break;
            case LEFT:
                direction = Direction.UP;
                break;
        }
    }

    public void stepForward() {
        switch (direction) {
            case LEFT:
                x--;
                break;
            case DOWN:
                y--;
                break;
            case RIGHT:
                x++;
                break;
            case UP:
                y++;
                break;
        }
    }

    public void moveTo(int x, int y) {
        if (this.x < x) {
            turnTo(Direction.RIGHT);
        } else if (this.x > x){
            turnTo(Direction.LEFT);
        }
        stepForward(countXDistance(x));
        if (this.y < y){
            turnTo(Direction.UP);
        } else if (this.y > y){
            turnTo(Direction.DOWN);
        }
        stepForward(countYDistance(y));
    }

    public int countYDistance(int destinationY) {
        int distance = 0;
        if (Math.abs(this.y + destinationY) == Math.abs(this.y) + Math.abs(destinationY)) {
            distance = Math.abs(Math.abs(this.y) - Math.abs(destinationY));
        } else {
            distance = Math.abs(this.y) + Math.abs(destinationY);
        }
        return distance;
    }

    public void stepForward(int times) {
        for (int i = 0; i < times; i++) {
            stepForward();
        }
    }

    public int countXDistance(int destinationX) {
        int distance = 0;
        if (Math.abs(this.x + destinationX) == Math.abs(this.x) + Math.abs(destinationX)) {
            distance = Math.abs(Math.abs(this.x) - Math.abs(destinationX));
        } else {
            distance = Math.abs(this.x) + Math.abs(destinationX);
        }
        return distance;
    }

    private void turnTo(Direction direction) {
        while (this.direction != direction) {
            turnRight();
        }
    }

}
