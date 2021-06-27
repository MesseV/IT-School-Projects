package com.company;

import java.util.Scanner;

public class trei {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int punctaj = 0;
        long x1 = (long) (Math.random() * (2000 - 300 + 1) + 300);
        long x2 = (long) (Math.random() * (2000 - 300 + 1) + 300);
        long x3 = (long) (Math.random() * (2000 - 300 + 1) + 300);
        long x4 = (long) (Math.random() * (2000 - 300 + 1) + 300);
        long x5 = (long) (Math.random() * (2000 - 300 + 1) + 300);
        long x6 = (long) (Math.random() * (2000 - 300 + 1) + 300);
        long x7 = (long) (Math.random() * (2000 - 300 + 1) + 300);
        long x8 = (long) (Math.random() * (2000 - 300 + 1) + 300);
        long x9 = (long) (Math.random() * (2000 - 300 + 1) + 300);
        long x0 = (long) (Math.random() * (2000 - 300 + 1) + 300);
        System.out.println(x1 + " + " + x2 + " = ?");
        long raspuns = reader.nextLong();
        if (x1 + x2 == raspuns) {
            System.out.println("Corect!");
            punctaj = punctaj + 1;
        } else {
            System.out.println("Incorect!");
        }
        System.out.println(x3 + " - " + x4 + " = ?");
        long raspuns1 = reader.nextLong();
        if (x3 - x4 == raspuns1) {
            System.out.println("Corect!");
            punctaj = punctaj + 1;
        } else {
            System.out.println("Incorect!");
        }
        System.out.println(x5 + " * " + x6 + " = ?");
        long raspuns2 = reader.nextLong();
        if (x5 * x6 == raspuns2) {
            System.out.println("Corect!");
            punctaj = punctaj + 1;
        } else {
            System.out.println("Incorect!");
        }
        System.out.println(x7 + " * " + x8 + " = ?");
        long raspuns3 = reader.nextLong();
        if (x7 * x8 == raspuns3) {
            System.out.println("Corect!");
            punctaj = punctaj + 1;
        } else {
            System.out.println("Incorect!");
        }
        System.out.println(x9 + " / " + x0 + " = ? (16 zecimale)");
        //String raspuns4 = String.format("%.2f", x9 / x0); - apoi nu pot asocia string cu double sau invers
        double raspuns4 = (double) x9 / x0;
        double raspunsImpartire = reader.nextDouble();
        if (raspuns4 == raspunsImpartire) { //aici nu imi dau seama cum sa fac sa fie raspunsul cu mai putine zecimale
            System.out.println("Corect!");
            punctaj = punctaj + 1;
        } else {
            System.out.println("Incorect!");
        }
        System.out.println();
        System.out.println("Ati raspuns corect la " + punctaj + " intrebari.");
    }
}