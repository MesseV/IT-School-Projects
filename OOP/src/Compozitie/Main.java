package Compozitie;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Introduceti modelul primului telefon: ");
    Telefon telefon1 = new Telefon(reader.nextLine());
    telefon1.setMemorie(10);
    telefon1.setDiagonala(8);

        System.out.println("Introduceti modelul celui de-al doilea telefon: ");
    Telefon telefon2 = new Telefon(reader.nextLine());
    telefon2.setMemorie(12);
    telefon2.setDiagonala(10);

    cardSIM cardSim1 = new cardSIM(3, "Vodafone");
    cardSIM cardSim2 = new cardSIM(5, "Orange");

    ContacteSim[] contacts = new ContacteSim[2];
        ContacteSim contactAcasa = new ContacteSim("035114141498");
            contactAcasa.setNume("Acasa");
            contactAcasa.setPrenume("");
        ContacteSim contactMircea = new ContacteSim("07561823475");
            contactMircea.setNume("Popescu");
            contactMircea.setPrenume("Mircea");

            contacts[0] = contactAcasa;
            contacts[1] = contactMircea;

            cardSim1.setContacte(contacts);

    telefon1.setSim(cardSim1);
    telefon2.setSim(new cardSIM(5, "Orange")); //asta e echivalent cu "cardSim2"


        afiseaza(telefon1);
        afiseaza(telefon2);


    }

    public static void afiseaza (Telefon telefon) {
        String model = telefon.getModel();
        int diagonala = telefon.getDiagonala();
        String memorie = telefon.getMemorie();
        cardSIM sim = telefon.getSim();
        String operator = sim.getOperator();
        String frecventa = sim.getNumeFrecventa();
        System.out.println("Telefonul " + model + " are diagonala " + diagonala + ", memorie de " + memorie +
                " si este inregistrat la " + operator + " cu frecventa de " + frecventa + ".");

        ContacteSim[] contacts = sim.getContacte();
        if (contacts != null) {
            for (int i = 0; i < contacts.length; i++) {
                ContacteSim contact = contacts[i];
                String nume = contact.getNume();
                String prenume = contact.getPrenume();
                String numarTelefon = contact.getNumarTelefon();
                System.out.println("Contact " + (i+1) + ": " + nume + " " + prenume + " " + numarTelefon);
            }
        }
    }
}
