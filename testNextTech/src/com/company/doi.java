package com.company;

import java.util.Scanner;

public class doi {
    public static void main(String[] args) {
        Scanner cifra = new Scanner(System.in);
        System.out.println("Introduceti o cifra intre 0 si 1000: ");
        int cifraIntreaga = cifra.nextInt();
        int cifra1 = cifraIntreaga / 100;
        System.out.println(cifra1 + "+");
        int cifra2 = (cifraIntreaga / 10) %10;
        System.out.println(cifra2 + "+");
        int cifra3 = cifraIntreaga % 10;
        System.out.println(cifra3 + "=");
        int suma = cifra1 + cifra2 + cifra3;
        System.out.println(suma);
    }
}