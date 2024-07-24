package Recursion;

public class LastOccurance {

    public static int lastOccurance(int arr[], int key, int i) {

        if (i == -1) {
            return -1;
        }

        if (arr[i] == key) {
            return i;
        }
        return lastOccurance(arr, key, i - 1);
    }

    public static void main(String[] args) {
        int arr[] = { 7, 8, 3, 9, 8, 6, 2 };
        System.out.println(lastOccurance(arr, 8, arr.length - 1));
    }

}
