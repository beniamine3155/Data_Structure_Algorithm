package ArrayList;

import java.util.ArrayList;

public class BasicOperations {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        // add operation
        // Time : O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5, 10); // O(n)
        System.out.println(list);

        // Get Operation
        // Time : O(1)
        System.out.println(list.get(2));

        // Remove operation
        // Time: O(n)
        list.remove(2);
        System.out.println(list);

        // Set operation
        // Time : O(n)
        list.set(2, 10);
        System.out.println(list);

        // contains operation
        // Time : O(n)
        System.out.println(list.contains(1));
        System.out.println(list.contains(22));

    }

}
