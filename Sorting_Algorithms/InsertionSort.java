package Sorting_Algorithms;

import java.util.Arrays;
import java.util.Collections;

public class InsertionSort {

    public static void insertionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.err.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 1, 4, 2, 3 };
        insertionSort(arr);
        printArray(arr);

        // in built sort function
        Arrays.sort(arr);
        Integer num[] = { 4, 6, 2, 3, 7, 4, 2 };
        Arrays.sort(num, Collections.reverseOrder());
    }

}
