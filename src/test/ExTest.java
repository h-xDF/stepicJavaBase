package test;

import java.util.Random;

public class ExTest {

    public static void main(String[] args) {

        InitEnum inst1 = InitEnum.ONE;
        InitEnum inst2 = InitEnum.TWO;

        System.out.println(inst1.getValue());
        System.out.println(inst2.getValue());

        System.out.println(InitEnum.values()[new Random().nextInt(InitEnum.values().length)].getValue());
    }
}
