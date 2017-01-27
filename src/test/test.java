package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * мереопределение метода
 */
public class test {


    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.addAll(Arrays.asList(1,2,32,4));

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
