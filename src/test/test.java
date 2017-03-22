package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * мереопределение метода
 */
public class test {


    public static void main(String[] args) {

        newArray<Integer> list = new newArray<Integer>();
        list.addAll(Arrays.asList(1,2,32,4));

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
