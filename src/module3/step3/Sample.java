package module3.step3;

/**
 * необхоим для тестирования
 */
public class Sample {

    public static void main(String[] args) {

        Robot robot = new Robot();

        moveRobot(robot, -1, -1);

        robot.print();
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        int deltaX = toX - robot.getX();
        int deltaY = toY - robot.getY();

        if (deltaX > 0){
            rotationRobot(robot, Robot.Direction.RIGHT);
            stepRobot(robot,deltaX);
        } else if (deltaX < 0) {
            rotationRobot(robot, Robot.Direction.LEFT);
            stepRobot(robot, Math.abs(deltaX));
        }

        if (deltaY > 0) {
            rotationRobot(robot, Robot.Direction.UP);
            stepRobot(robot, deltaY);
        } else if (deltaY < 0) {
            rotationRobot(robot, Robot.Direction.DOWN);
            stepRobot(robot, Math.abs(deltaY));
        }
    }

    private static void stepRobot(Robot robot, int delta) {
        for (int i = 0; i < delta; i++) {
            robot.stepForward();
        }
    }

    private static void rotationRobot(Robot robot, Robot.Direction target) {
        Robot.Direction aim = robot.getDirection();
        if ((aim.equals(Robot.Direction.UP) && target.equals(Robot.Direction.RIGHT)) ||
                (aim.equals(Robot.Direction.RIGHT) && target.equals(Robot.Direction.DOWN)) ||
                        (aim.equals(Robot.Direction.DOWN) && target.equals(Robot.Direction.LEFT)) ||
                                (aim.equals(Robot.Direction.LEFT) && target.equals(Robot.Direction.UP))) {
                            robot.turnRight();
        } else {
            while (!(aim.equals(target))) {
                robot.turnLeft();
                aim = robot.getDirection();
            }
        }

    }
}
