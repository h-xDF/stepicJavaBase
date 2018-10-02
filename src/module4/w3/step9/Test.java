package module4.w3.step9;

import java.util.Iterator;
import java.util.LinkedList;

public class Test {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Iterator<Integer> iterator = list.iterator();

        /*while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }*/

        Node chain = new Node(new Node(new Node(new Node(new Node(null, 5), 4), 3), 2), 1);

        Node chainSWAP = chain;
        while (chain.hasNext()) {
            System.out.println(chain.getValue());
            chain = chain.getNext();
        }

        System.out.println("+++++++++++++");
        chainSWAP.revertALL(chainSWAP);

        /*while (chain2.hasNext()) {
            System.out.println(chain.getValue());
            chain = chain.getNext();
        }*/
    }
}
