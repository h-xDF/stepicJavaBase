package module3.robot;

/**
 * необхоим для тестирования
 */
public class Sample {

    public static void main(String[] args) {

        Robot robot = new Robot();

        robot.turnRight();
        robot.stepForward();
        robot.turnLeft();
        robot.stepForward();
        /*moveRobot(robot,0,0);*/

        robot.print();
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        robot.stepForward(); // your implementation here
    }
}
