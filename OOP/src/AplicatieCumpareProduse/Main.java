package AplicatieCumpareProduse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int optiune = -1;

        Produs[] produse = new Produs[300];
        int index = 0;

        while(optiune != 0) {
            System.out.println("1. Adauga fructe.");
            System.out.println("2. Adauga dulciuri.");
            System.out.println("3. Adauga haine.");
            System.out.println("4. Afiseaza produsele disponibile.");
            System.out.println("0. Iesire.");
            optiune = reader.nextInt();
            reader.nextLine();

            if (optiune == 1 || optiune == 2 || optiune == 3) {
                System.out.println("Introduceti numele produsului.");
                String name = reader.nextLine();
                System.out.println("Introduceti pretul produsului.");
                double pret = reader.nextDouble();
                reader.nextLine();
                System.out.println("Introduceti producatorul produsului.");
                String producator = reader.nextLine();


            if (optiune == 1) {
                System.out.println("Doresti varianta bio a produsului? (Da sau nu)");
                String alegere = reader.nextLine();
                boolean isBio = false;
                if (alegere.equals("Da") || alegere.equals("da")) {
                    isBio = true;
                }
                Fruct fruct = new Fruct(name, pret, producator, isBio);
                produse[index] = fruct;
                index++;
            }

            if (optiune == 2) {
                System.out.println("Introduceti gramajul produsului.");
                int alegere = reader.nextInt();
                Dulciuri dulciuri = new Dulciuri(name, pret, producator);
                dulciuri.setGramaj(alegere);
                produse[index] = dulciuri;
                index++;
            }

            if (optiune == 3) {
                System.out.println("Introduceti marimea hainei. (S, M, L, XL)");
                String marime = reader.nextLine();
                Haine haine = new Haine(name, pret, producator);
                haine.setMarime(marime);
                produse[index] = haine;
                index++;
            }

            }

            if (optiune == 4) {
                afisareProduse(produse);
            }
        }
    }

    public static void afisareProduse (Produs[] produse) {
        for (int i = 0; i < produse.length; i++) {
            Produs produs = produse[i];
            if (produs != null) {
                String name = produs.getNume();
                double pret = produs.getPret();
                String producator = produs.getProducator();
                System.out.println("Produs: " + name + " -Pret: " + pret + " -Producator: " + producator);
            }
        }
    }
}
