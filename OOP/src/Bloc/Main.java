package Bloc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        Bloc bloc1 = new Bloc("E2");
        System.out.println("Cate etaje are blocul?");
        int etaje = reader.nextInt();
        reader.nextLine();
        System.out.println("Cate apartamente sunt pe etaj?");
        int apartamente = reader.nextInt();
        reader.nextLine();

        etajeSiApartamente[][] etSiAp = new etajeSiApartamente[etaje][apartamente];

        for (int i = 0; i < etSiAp.length; i++) {
            for (int j = 0; j < etSiAp[i].length; j++) {
                System.out.println("Cum se numeste familia de la et." + i + ", ap." + (j+1));
                etajeSiApartamente firstEntry = new etajeSiApartamente(reader.nextLine());
            }
        }
        System.out.println();

    }
}
