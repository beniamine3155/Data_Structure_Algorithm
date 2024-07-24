package String;

public class PrintLargestString {

    public static void main(String[] args) {
        String fruits[] = { "apple", "mango", "banna" };
        String largest = fruits[0];
        for (int j = 0; j < fruits.length; j++) {
            if (largest.compareTo(fruits[j]) < 0) {
                largest = fruits[j];
            }
        }
        System.out.println(largest);
    }
}
