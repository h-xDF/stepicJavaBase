package module3.step3;


public class MapsR {

    //size maps for way step3
    private int Y = 11;
    private int X = 11;
    private int[][] arr = new int[X][Y];

    public void printMaps(){
        //arr[1][1] = 23;

        for (int i = Y - 1; i > -1; i--){
            for (int j = 0; j < X; j++){
                System.out.print(arr[j][i]);
            }
            System.out.println();
        }
    }

    public void getStepRobot(int X, int Y) {
        arr[5 + X][5 + Y] = 1; // метка присутсвия (2;2) - Это начало координат - эквивалентно  (0,0))
    }
}
