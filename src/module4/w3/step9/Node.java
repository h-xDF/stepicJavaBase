package module4.w3.step9;

public class Node {

    private int value;
    private Node next;

    public Node(Node next,int value) {

        this.value = value;
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public boolean hasNext() {
        /*if (next != null) {
            return true;
        } else {
            return false;
        }*/

        return next != null ? true : false;
    }

    public void revertALL(Node head) {
        Node newHead = null;
        while (head.hasNext()) {
            newHead = swapNext(head, head.next);
            head.setNext(null);
        }
        System.out.println("ddddd" + newHead.getValue() + "        " + newHead.hasNext());
        while (newHead.hasNext()) {
            System.out.println(newHead.value);
            newHead = newHead.next;
        }

    }


    public Node swapNext(Node before, Node after) {

        if (after != null) {
            Node buf1 = after.next;
            after.setNext(before);
            return swapNext(after, buf1);
        } else {
           return before;
        }

    }
}
