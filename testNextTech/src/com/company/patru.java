package com.company;

import java.util.Scanner;

public class patru {
    public static void main(String[] args) {
        System.out.println("Introduceti un numar intreg: ");
        reverse(readerNumar());
        System.out.println();
    }
    public static long reverse (long numar) {
        while (numar > 0) {
            long i = numar % 10;
            numar = (numar / 10);
            System.out.print(i);
        }
        return numar;
    }

    public static long readerNumar (){
        Scanner reader = new Scanner(System.in);
        return reader.nextLong();
    }
}