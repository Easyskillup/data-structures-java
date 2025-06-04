package org.example.searching;

public class Searching {
    // Scan every element one by one till we find the element we are looking for.
    static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    // Works only on sorted array, repeatedly divides the interval
    static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {4, 1, 5, 7, 9, 2};
        int[] sortedArr = {2, 3, 5, 7, 9, 10};
        System.out.println("linearSearch(): Value found at index: " + linearSearch(arr, 5));
        System.out.println("binarySearch(): Value found at index: " + binarySearch(sortedArr, 7));
    }
}
