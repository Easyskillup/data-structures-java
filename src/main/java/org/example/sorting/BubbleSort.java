package org.example.sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};
        print(arr);
        System.out.println();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
//                System.out.printf("Comparing %s with %s%n", arr[j], arr[j + 1]);
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println("i  = " + i );
            print(arr);
            System.out.println();
        }

        System.out.println();

    }

    static void print(int[] arr) {
        for (int a : arr) {
            System.out.print(a +" ");
        }
        System.out.println();
    }

}
