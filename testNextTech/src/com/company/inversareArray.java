package com.company;

public class inversareArray {
    public static void main(String[] args) {
        int[] arr = {45, 23, 5, 90, 123};

        System.out.println("Array before reversing: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }

        System.out.println();

        System.out.println("Array after reversing: ");
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

}
