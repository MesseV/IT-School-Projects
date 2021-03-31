import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        userService userService = new userService();
        Scanner reader = new Scanner(System.in);
        int optiune = -1;

        while (optiune != 0) {
            System.out.println("---------------");
            System.out.println("1. Display.");
            System.out.println("2. Add.");
            System.out.println("3. Change last name.");
            System.out.println("4. Delete user.");
            System.out.println("0. Exit");
            System.out.println("---------------");
            optiune = reader.nextInt();
            reader.nextLine();

            if (optiune == 1) {
                userService.showUsers();
            }
            if (optiune == 2) {
                System.out.println("Enter name: ");
                String name = reader.nextLine();
                System.out.println("Enter last name: ");
                String lastName = reader.nextLine();
                userModel userModel = new userModel();
                userModel.setFirstName(name);
                userModel.setLastName(lastName);
                userService.addUser(userModel);
            }

            if (optiune == 3) {
                userService.showUsers();
                System.out.println("Enter ID of user you want to update.");
                int id = reader.nextInt();
                reader.nextLine();
                System.out.println("Enter new last name.");
                String newLastName = reader.nextLine();
                userService.editUser(id, newLastName);
            }

            if (optiune == 4) {
                userService.showUsers();
                System.out.println("Enter ID of user you want to delete.");
                int id = reader.nextInt();
                reader.nextLine();
                userService.deleteUser(id);
            }
        }
    }
}
