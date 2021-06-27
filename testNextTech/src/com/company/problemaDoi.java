package com.company;

import java.util.Arrays;

public class problemaDoi {
    public static void main(String[] args) {

        int[] A = {1, 12, 4, 6, 104, 56, 104};
        int[] B = {52, 104, 34, 54, 85, 123, 534, 234, 346, 234, 104};

        System.out.println(solution(A, B));
    }



    public static int solution(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;;
        Arrays.sort(A);
        Arrays.sort(B);
        int i = 0;
         int k = 0;
         while (i < n && k < m) {
             if (B[i] < A[k])
                 i += 1;
             if (B[i] > A[k])
                 k += 1;
             if (A[k] == B[i])
                 return A[k];
         }
         return -1;
     }
    }

