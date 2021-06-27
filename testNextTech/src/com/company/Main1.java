package com.company;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        String[][] matriceParcare = new String[5][5];

        for (int i = 0; i < matriceParcare.length; i++) {
            for (int j = 0; j < matriceParcare[i].length; j++) {
                matriceParcare[i][j] = "0";
                System.out.print(matriceParcare[i][j] + "  ");
            }
            System.out.println();
        }
        int alegere;
        do {

            System.out.println("----------------");
            System.out.println("1. Afisare parcare.");
            System.out.println("2. Alege loc de parcare.");
            System.out.println("0. Iesire.");
            System.out.println("----------------");

            Scanner reader = new Scanner(System.in);

            alegere = reader.nextInt();
            if (alegere == 1) {
                for (int i = 0; i < matriceParcare.length; i++) {
                    for (int j = 0; j < matriceParcare[i].length; j++) {
                        System.out.print(matriceParcare[i][j] + "  ");
                    }
                    System.out.println();
                }
            }

            if (alegere == 2) {
                alegereLocParcare(matriceParcare);
            }
        } while (alegere != 0);
        System.out.println("Programul s-a incheiat.");

    }

//    public static void afisareMatrice(String[][] matrice) {
//
//        for (int i = 0; i < matrice.length; i++) {
//            for (int j = 0; j < matrice[i].length; j++) {
//                matrice[i][j] = "0";
//                System.out.print(matrice[i][j] + "  ");
//            }
//            System.out.println();
//        }
//    }

    public static String[][] alegereLocParcare (String[][] matrice) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Alegeti un loc de parcare prin introducerea coordonatelor X si Y. (0 - 4)");
        int X = reader.nextInt();
        int Y = reader.nextInt();
        if (matrice[Y-1][X-1] == "X") {
            System.out.println("Locul este deja ocupat. Alegeti alt loc.");
        } else {
            matrice[Y-1][X-1] = "X";
            for (int i = 0; i < matrice.length; i++) {
                for (int j = 0; j < matrice[i].length; j++) {
                    System.out.print(matrice[i][j] + "  ");
                }
                System.out.println();
            }
        }
        return matrice;
    }
}