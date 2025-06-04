package org.example.sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};
        // Pass 1
        // Unsorted part = {5, 3, 8, 4, 2}
        // Min = 2, Swap it with the first value in unsorted part, {2, 3, 8, 4, 5}

        // Pass 2
        // Unsorted part = { 3, 8, 4, 5}, Sorted part = {2}
        // Min = 3, Swap it with the first value in unsorted part, {2, 3, 8, 4, 5}

        // Pass 3
        // Unsorted part = { 8, 4, 5}, Sorted part = {2,3}
        // Min = 4, Swap it with the first value in unsorted part, {2, 3, 4, 8, 5}

        // Pass 4
        // Unsorted part = { 8, 5}, Sorted part = {2,3, 4}
        // Min = 5, Swap it with the first value in unsorted part, {2, 3, 4, 5, 8}

        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
            System.out.println("Pass: " + i);
            print(arr);
            System.out.println();
        }
        print(arr);
    }
    static void print(int[] arr) {
        for (int a : arr) {
            System.out.print(a +" ");
        }
        System.out.println();
    }
}
