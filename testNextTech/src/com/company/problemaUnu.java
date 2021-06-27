package com.company;

public class problemaUnu {

    public static void main(String[] args) {
        int[] arr = {1, 1000, 80, -91};

        for(int i = 0; i <= arr.length-1; i++) {
            System.out.print(arr[i] + " ");
        }


        System.out.println();
        System.out.println("Sum of all 2 digit numbers is: ");
        int sum = 0;
        for (int i = 0; i <= arr.length-1; i++) {
            if ((arr[i] >=10 && arr[i] <= 99) || (arr[i] <= -10 && arr[i] >= -99)) {
                sum = sum + arr[i];
            }
        }
        System.out.print(sum);
    }

}
