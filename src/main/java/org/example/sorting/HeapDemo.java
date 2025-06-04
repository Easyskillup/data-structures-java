package org.example.sorting;

public class HeapDemo {
    /**
     * Heap is a complete binary tree that satisfies the heap property
     * Max-Heap: every parent node is greater or equal to it's children
     * Min-Heap: every parent node is less or equal to it's children
     * Heap can be implemented using Arrays
     * Left Child:      2*i+1
     * Right Child:     2*i+2
     * Parent:          (i-1)/2
     * <p>
     * Creating a Max Heap
     * arr = {10, 20, 5, 6, 1, 8, 9}
     * size = 7
     * last leaf node = n/2 -1 = 7/2-1 = 2
     * heapify from index 2, 1, 0 aka bottom-up approach
     * <p>
     * Index:   [0,1,2,3,4,5,6]
     * Array:   [10,20,5,6,1,8,9]
     * <p>
     * Heapify at Level 2:
     * Left Child:      index = 5, 8
     * Right Child:     index = 6, 9
     * Current Value:   5, largest = 9, swap 9 with 5
     * Index:   [0,1,2,3,4,5,6]
     * Array:   [10,20,9,6,1,8,5]
     * <p>
     * Heapify at Level 1:
     * Left Child:      index = 3, 6
     * Right child:     index = 4, 1
     * Current Value:   20
     * No Swap needed
     * Array:   [10,20,9,6,1,8,5]
     * <p>
     * Heapify at Level 0
     * Left Child:      index = 1, 20
     * Right child:     index = 4, 9
     * Current:         10, largest = 20, swap 20 with 10
     * Array:   [20,10,9,6,1,8,5]
     */
    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 6, 1, 8, 9};
        System.out.println("Original Array:");
        print(arr);
        heapSort(arr);
        System.out.println("\nSorted Array:");
        print(arr);
    }

    static void heapSort(int[] arr) {
        int n = arr.length;
        buildHeap(arr);
        System.out.println("\nHeaped Array:");
        print(arr);
        System.out.println();

        for (int i = n - 1; i >= 1; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            System.out.println("\nHeap Swapped:");
            print(arr);
            heapify(arr, i, 0);
        }
    }


    static void buildHeap(int[] arr) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
//            System.out.println("\nBuilding Heap for index: " + i);
            heapify(arr, n, i);
        }
    }

    private static void heapify(int[] arr, int n, int i) {
        int current = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[current]) {
            current = left;
        }
        if (right < n && arr[right] > arr[current]) {
            current = right;
        }
        if (current != i) {
            int temp = arr[i];
            arr[i] = arr[current];
            arr[current] = temp;
            System.out.println("After heapify at index: " + i);
            print(arr);
            heapify(arr, n, current);
        }
    }

    static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
