package UserManagement;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner reader = new Scanner(System.in);
        int optiune = -1;
        while (optiune != 4) {
            System.out.println("1. Adaugare utilizator.");
            System.out.println("2. Afisare utilizatori.");
            System.out.println("3. Stergere utilizator.");
            System.out.println("4. Iesire.");
            optiune = reader.nextInt();
            reader.nextLine();
            FileService fileService = new FileService();

            if (optiune == 1) {
                System.out.println("Introduceti numele:");
                String nume = reader.nextLine();
                System.out.println("Introduceti prenumele:");
                String prenume = reader.nextLine();
                User user = new User(nume, prenume);
                List<User> currentUsers = fileService.readFromFile();
                currentUsers.add(user);
                fileService.writeToFile(currentUsers);
            }

            if (optiune == 2) {
                List<User> currentUsers = fileService.readFromFile();
                for (User user : currentUsers) {
                    System.out.println(user.getNume() + " " + user.getPrenume());
                }
            }

            if (optiune == 3) {
                System.out.println("Introduceti ID-ul utilizatorului pe care doriti sa il stergeti.");
                String nume = reader.nextLine();
                List<User> currentUsers = fileService.readFromFile();
                currentUsers.remove(nume);
                fileService.writeToFile(currentUsers);

            }

        }
    }
}
