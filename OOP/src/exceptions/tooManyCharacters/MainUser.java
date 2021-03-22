package exceptions.tooManyCharacters;

import java.util.Scanner;

public class MainUser {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Enter your name.");
                String nume = reader.nextLine();
                User user = new User();
                user.setName(nume);
            } catch (EmptyNameException ex1) {
                System.out.println("Too few characters.");
            } catch (NameTooLongException ex2) { // aceste 2 catch-uri se pot inlocui daca dam catch la parintele claselor,
                //dar atunci va trebui sa avem un mesaj comun pentru ambele.
                System.out.println("Too many characters.");
            } finally {
                System.out.println("-------");
            }
        }
    }
}
