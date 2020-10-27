package no.olai;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {


        int[] arr = { 5, 3, 2, 1 };
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] list) {
        sort(list, 0, list.length - 1);
    }

    public static void sort(int[] list, int low, int high) {
        if (low < high) {
            // Find the smallest number and its index in list[low .. high]
            int indexOfMin = low;
            int min = list[low];
            for(int i = low + 1; i <= high; i++) {
                if (list[i] < min) {
                    min = list[i];
                    indexOfMin = i;
                    System.out.println(indexOfMin);
                }
            }

            // Swap the smallest in list[low .. high] with list[low]
            list[indexOfMin] = list[low];
            list[low] = min;

            // Sort the remaining list[low + 1 .. high]
            sort(list, low + 1, high);
        }
    }
}
