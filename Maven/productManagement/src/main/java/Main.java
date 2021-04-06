import UI.CategoryUI;
import UI.ManufacturerUI;
import UI.ProductUI;
import UI.UserUI;
import org.hibernate.SessionFactory;
import services.CategoryService;
import services.ManufacturerService;
import services.ProductService;
import services.UserService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        SessionConfig sessionConfig = new SessionConfig();
        SessionFactory sessionFactory = sessionConfig.getSessionFactory();
        ProductService productService = new ProductService(sessionFactory);
        ManufacturerService manufacturerService = new ManufacturerService(sessionFactory);
        CategoryService categoryService = new CategoryService(sessionFactory);
        UserService userService = new UserService(sessionFactory);

        ProductUI productUI = new ProductUI(productService, manufacturerService, categoryService);
        ManufacturerUI manufacturerUI = new ManufacturerUI(manufacturerService);
        CategoryUI categoryUI = new CategoryUI(categoryService);
        UserUI userUI = new UserUI(userService);
        int optiune = -1;
        while (optiune != 0) {
        Scanner reader = new Scanner(System.in);
        System.out.println("1. Manufacturer interface.");
        System.out.println("2. Product interface.");
        System.out.println("3. Category interface.");
        System.out.println("4. User interface.");
        System.out.println("0. Exit.");
        optiune = reader.nextInt();
        reader.nextLine();

        if (optiune == 1) {
            System.out.println("|-|-|-|-|-|-|-|-|-|-|-|-|-|-|");
            manufacturerUI.startManufacturerUI();
        }

        if (optiune == 2) {
            System.out.println("|-|-|-|-|-|-|-|-|-|-|-|-|-|-|");
            productUI.startProductUI();
        }

        if (optiune == 3) {
            System.out.println("|-|-|-|-|-|-|-|-|-|-|-|-|-|-|");
            categoryUI.startCategoryUI();
        }

        if (optiune == 4) {
            System.out.println("|-|-|-|-|-|-|-|-|-|-|-|-|-|-|");
            userUI.startUserUI();
        }
        }
    }
}
