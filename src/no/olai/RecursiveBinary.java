package no.olai;

import java.util.Arrays;

public class RecursiveBinary {
    public static void main(String[] args) {

        int[] arr = { 50, -22, 10, 32, -42 };
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(recursiveBinarySearch(arr, 55));


    }

    public static int recursiveBinarySearch(int[] input, int key) {
        int low = 0;
        int high = input.length - 1;
        return recursiveBinarySearch(input, key, low, high);
    }

    private static int recursiveBinarySearch(int[] input, int key, int low, int high) {

        if (low > high)
            return -1;

        int mid = (low + high) / 2;
        if (key < input[mid])
            return recursiveBinarySearch(input, key, low, mid - 1);
        else if (key == input[mid])
            return mid;
        else
            return recursiveBinarySearch(input, key, mid + 1, high);
    }


}
