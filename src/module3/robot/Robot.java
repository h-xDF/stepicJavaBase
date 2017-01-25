package module3.robot;

import java.util.Map;

/**
 * Created by ypereyaslov on 21.01.2017.
 */
public class Robot {

    private MapsR mapsR = new MapsR(); // for visual
    private int X = 0;
    private int Y = 0;
    private Direction direction = Direction.UP;

    public Robot(){
        mapsR.getStepRobot(X,Y);
    }

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public Direction getDirection() {
        return this.direction; // текущее направление взгляда
    }

    public int getX() {
        return this.X; // текущая координата X
    }

    public int getY() {
        return this.Y; // текущая координата Y
    }

    // повернуться на 90 градусов против часовой стрелки
    public void turnLeft() {
        Direction oldDirection = getDirection();

        if (oldDirection == Direction.UP) direction = Direction.LEFT;
        if (oldDirection == Direction.RIGHT) direction = Direction.UP;
        if (oldDirection == Direction.DOWN) direction = Direction.RIGHT;
        if (oldDirection == Direction.LEFT) direction = Direction.DOWN;
    }

    // повернуться на 90 градусов по часовой стрелке
    public void turnRight() {
        Direction oldDirection = getDirection();

        if (oldDirection == Direction.UP) direction = Direction.RIGHT;
        if (oldDirection == Direction.RIGHT) direction = Direction.DOWN;
        if (oldDirection == Direction.DOWN) direction = Direction.LEFT;
        if (oldDirection == Direction.LEFT) direction = Direction.UP;
    }

    /**
     *   шаг в направлении взгляда
     *   за один шаг робот изменяет одну свою координату на единицу
     */
    public void stepForward() {

        if (this.getDirection() == Direction.UP) Y ++;
        if (this.getDirection() == Direction.RIGHT) X ++;
        if (this.getDirection() == Direction.DOWN) Y --;
        if (this.getDirection() == Direction.LEFT) X --;

        mapsR.getStepRobot(X,Y);
    }

    public void print(){
        mapsR.printMaps();
    }
}