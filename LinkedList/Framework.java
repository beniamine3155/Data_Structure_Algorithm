package LinkedList;

import java.util.LinkedList;

public class Framework {

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(9);
        ll.addLast(10);
        ll.add(7);

        System.err.println(ll);

        ll.remove(5);
        System.out.println(ll);

        ll.removeFirst();
        System.out.println(ll);

        ll.removeLast();
        System.out.println(ll);

    }

}
