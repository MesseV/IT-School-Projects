package com.company;

public class interviuFortech {

    public static void main(String[] args) {

            int[] vector = {9, 3, 1};
            int[] vectorReversed = reverseArray(vector);
            for (int i = 0; i < vectorReversed.length; i++) {
                System.out.print(vectorReversed[i] + " ");
            }
        System.out.println();
            String text = "tout";
        System.out.println(isPalindrome(text));

        }

        public static int[] reverseArray (int[] vector) {
            int[] reversedVector = new int[vector.length];
            for (int i = 0; i < vector.length; i++){
                reversedVector[i] = vector[(vector.length - 1) - i];
            }
            return reversedVector;
        }


        public static boolean isPalindrome (String str) {
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
        }
    }

