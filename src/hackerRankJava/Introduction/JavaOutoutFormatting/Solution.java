package hackerRankJava.Introduction.JavaOutoutFormatting;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<1;i++)
        {
            String s1 = sc.next();
            int x = sc.nextInt();
            //String bifFormat = String.valueOf(x);
            //System.out.printf(s1 + "%16s%03d%n","",x);
            System.out.printf("%-15s%03d%n",s1,x);
            System.out.printf("%-15s%03d%n",s1,x);

            //System.out.printf("%07d");
            //Complete this line
        }
        System.out.println("================================");

    }
}
