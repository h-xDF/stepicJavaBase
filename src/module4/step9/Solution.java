package module4.step9;

public class Solution {
    public static void main(String[] args) {

        System.out.println( sqrt(-5));

    }

    public static double sqrt(double x) {

        if (x < 0) {
            throw  new java.lang.IllegalArgumentException("Expected non-negative number, got " + x);
        }

        return Math.sqrt(x);
        }
    }

