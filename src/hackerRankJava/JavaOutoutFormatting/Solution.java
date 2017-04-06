package hackerRankJava.JavaOutoutFormatting;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<1;i++)
        {
            String s1 = sc.next();
            int x = sc.nextInt();
            String bifFormat = String.valueOf(x);
            System.out.printf("%s%15d%03d",s1,"",x);

            //System.out.printf("%07d");
            //Complete this line
        }
        System.out.println("================================");

    }
}
