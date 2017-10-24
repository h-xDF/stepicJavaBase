package module_3_5.step7;

import java.util.function.DoubleUnaryOperator;

/**
 * integration function
 */

public class Solution {

    public static void main(String[] args) {

        double a = 0;
        double b = 10;
        DoubleUnaryOperator fun = x -> 1;

        System.out.println(integrate(fun, a, b));
    }

    public static double integrate(DoubleUnaryOperator f, double a, double b) {

        double exp = 1e-1;
        double sumBefore = 1d;
        double sumAfter = 0d;
        double delta = 1e-13;

        while (delta <= Math.abs(sumAfter - sumBefore)) {

            sumAfter = sumBefore;
            sumBefore = 0;
            double start = a;

            while (start <= b) {

                start = start + exp;
                sumBefore += f.applyAsDouble(start) * exp;
            }
            exp =  exp / 2.0;
        }

        System.out.println("exp = " + exp);
        return sumBefore;
    }
}
