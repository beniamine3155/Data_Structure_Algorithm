package ArrayList;

import java.util.ArrayList;

public class MultiDimensionArrayList {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(9);
        list.add(4);
        list.add(1);

        mainList.add(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(11);
        list2.add(22);
        list2.add(99);

        mainList.add(list2);

        System.out.println(mainList);

        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }
    }
}
