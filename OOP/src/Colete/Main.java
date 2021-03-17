package Colete;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner reader = new Scanner(System.in);
        int optiune = -1;

        while (optiune != 3) {
            System.out.println("1. Adaugare colet.");
            System.out.println("2. Afisare colete.");
            System.out.println("3. Iesire.");
            optiune = reader.nextInt();
            reader.nextLine();
            FileObjectWriter fileObjectWriter = new FileObjectWriter();

            if (optiune == 1) {
                System.out.println("Introduceti ID-ul coletului.");
                String id = reader.nextLine();
                System.out.println("Introduceti destinatarul coletului.");
                String destinatar = reader.nextLine();
                System.out.println("Introduceti adresa destinatarului.");
                String adresa = reader.nextLine();

                Colet colet = new Colet(id, destinatar, adresa);
                List<Colet> coleteDinFisier = fileObjectWriter.citesteColete();
                coleteDinFisier.add(colet);
                fileObjectWriter.writeObject(coleteDinFisier);
            }

            if (optiune == 2) {
                List<Colet> colete = fileObjectWriter.citesteColete();
                for (Colet colet: colete) {
                    System.out.println(colet.getId() + " " + colet.getDestinatar() + " " + colet.getAdresa());
                }
            }
        }
    }
}
