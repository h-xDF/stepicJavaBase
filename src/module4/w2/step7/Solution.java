package module4.w2.step7;

public class Solution {

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {

        /*robotConnectionManager.getConnection().moveRobotTo(toX, toY);

        RobotConnection connection = null;

        try {
            connection = robotConnectionManager.getConnection();
            connection.moveRobotTo(toX,toY);

        }catch (RobotConnectionException ex){

            try {
                connection = robotConnectionManager.getConnection();
                connection.moveRobotTo(toX,toY);
            }catch (RobotConnectionException ex2) {
                try {
                    connection = robotConnectionManager.getConnection();
                    connection.moveRobotTo(toX,toY);
                }catch (RobotConnectionException ex3) {
                    try {
                        connection = robotConnectionManager.getConnection();
                        connection.moveRobotTo(toX,toY);
                    }catch (RobotConnectionException ex4) {
                        throw new RobotConnectionException(ex4.getMessage());
                    }
                }
            }

        }finally {
            connection.close();
        }*/

            boolean succues = false;
            for (int i = 0; !succues && i<3; i++){
                try(RobotConnection rc = robotConnectionManager.getConnection()){
                    rc.moveRobotTo(toX, toY);
                    succues = true;
                    break;
                }
            }
            if(!succues){
                throw new RobotConnectionException("");
            }
    }
}
