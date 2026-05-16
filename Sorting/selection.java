package Sorting;

import java.util.Arrays;

public class selection {
    public static void SelectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minValue = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minValue] > arr[j]) {
                    minValue = j;
                }
            }
            int temp = arr[minValue];
            arr[minValue] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 9, 8, 5, 6, 4, 35, 2, 13 };
        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

}
