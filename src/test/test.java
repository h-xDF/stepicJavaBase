package test;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * мереопределение метода
 */
public class test {


    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(1);


        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
