package Queue;

import java.util.*;

public class DoubleEndedQ {

    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(4);
        deque.addFirst(3);
        deque.addLast(5);
        deque.addLast(6);
        deque.addLast(7);

        System.out.println(deque);

        deque.removeFirst();
        deque.removeLast();

        System.out.println(deque);
    }

}
