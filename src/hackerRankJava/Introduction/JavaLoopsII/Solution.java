package hackerRankJava.Introduction.JavaLoopsII;

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();

        for(int i=0;i<t;i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for(int j = 0; j < n; j++) {

                a += (powerBin(j) * b);
                if (j == n -1 ) {
                    System.out.println(a);
                } else {
                    System.out.print(a + " ");
                }
            }
        }
        in.close();
    }

    private static int powerBin(int exponent) {

        int buf = 1;
        int base = 2;

        for (int i = 1; i <= exponent; i++) {
            buf *= base;
        }

        return buf;
    }
}
