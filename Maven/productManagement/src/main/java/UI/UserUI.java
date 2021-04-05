package UI;

import entities.UserModel;
import services.UserService;

import java.util.Scanner;

public class UserUI {

    private UserService userService;
    private Scanner reader = new Scanner(System.in);

    public UserUI(UserService userService) {
        this.userService = userService;
    }

    public void startUserUI () {
        int optiune = -1;
        while (optiune != 0) {
            System.out.println("1. Display users.");
            System.out.println("2. Add user.");
            System.out.println("3. Remove user.");
            System.out.println("4. Edit user name.");
            optiune = reader.nextInt();
            reader.nextLine();

            if (optiune == 1) {
                userService.displayUsers();
            }

            if (optiune == 2) {
                System.out.println("Enter first name.");
                String name = reader.nextLine();
                System.out.println("Enter last name.");
                String lastName = reader.nextLine();
                UserModel userModel = new UserModel();
                userModel.setName(name);
                userModel.setSurname(lastName);
                userService.addUser(userModel);
            }
        }



    }
}
