package AplicatieTelefoane;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a=3+2;
        int b=2+6;
        int c=a+b;
        Scanner reader = new Scanner(System.in);
        int optiune = -1;


        Telefon[] telefoaneInregistrate = new Telefon[10];
        int index = 0;

        while (optiune != 0) {
            System.out.println("---------------------------------------");
            System.out.println("1. Show all phones.");
            System.out.println("2. Add new phone.");
            System.out.println("3. Show contacts from a certain phone.");
            System.out.println("4. Add a new contact.");
            System.out.println("0. Exit application.");
            System.out.println("---------------------------------------");
            optiune = reader.nextInt();
            reader.nextLine();

            if (optiune == 2) {
                System.out.println("Input a new phone: ");
                String nume = reader.nextLine();
                Telefon telefon = new Telefon(nume);
                telefoaneInregistrate[index] = telefon;
                index++;
            }

            if (optiune == 1) {
                afisareTelefoane(telefoaneInregistrate);
                System.out.println("---");
            }

            if (optiune == 3) {
                afisareTelefoane(telefoaneInregistrate);
                System.out.println("---");
                System.out.println("Select the phone you want to inspect: (1-10)");
                int indexTelefonAles = reader.nextInt();
                reader.nextLine();

                Telefon telefonAles = telefoaneInregistrate[indexTelefonAles - 1];
                Contact[] contacts = telefonAles.getContact();
                afisareContacte(contacts);
            }

            if (optiune == 4) {
                afisareTelefoane(telefoaneInregistrate);
                System.out.println("---");
                System.out.println("Select the phone you want to add a contact to: (1-10)");
                int IndexTelefonAles = reader.nextInt();
                reader.nextLine();

                System.out.println("First name:");
                String prenume = reader.nextLine();
                System.out.println("Last name:");
                String nume = reader.nextLine();
                System.out.println("Phone number:");
                String nrTel = reader.nextLine();

                Contact contact = new Contact(prenume, nume, nrTel);
                Telefon telefonAles = telefoaneInregistrate[IndexTelefonAles - 1];
                telefonAles.addContact(contact);
            }
        }
    }

    public static void afisareTelefoane(Telefon[] telefoaneInregistrate) {
        for (int i = 0; i < telefoaneInregistrate.length; i++) {
            Telefon telefon = telefoaneInregistrate[i];
            if (telefon != null) {
                String nume = telefon.getTipTelefon();
                System.out.println("Telefonul " + (i + 1) + ". " + nume);
            }
        }
    }

    public static void afisareContacte(Contact[] contacts) {
        for (int i = 0; i < contacts.length; i++) {
            Contact contact = contacts[i];
            if (contact != null) {
                String nume = contact.getName();
                String prenume = contact.getPrenume();
                String nrTel = contact.getNrTelefon();
                System.out.println("Contact: " + nume + " " + prenume + " - " + nrTel);
            }
        }
    }
}
