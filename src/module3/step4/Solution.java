package module3.step4;

/**
 * Created by ypereyaslov on 26.09.2017.
 */
public class Solution {

    public static void main(String[] args) {

        ComplexNumber number1 = new ComplexNumber(2, -4);
        ComplexNumber number2 = new ComplexNumber(31, 43222);

        System.out.println("hashCode 1 " + number1.hashCode());
        System.out.println("hashCode 2 " + number2.hashCode());

        System.out.println(number1.equals(number2));
    }
}
