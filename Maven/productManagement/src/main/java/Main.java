import UI.ManufacturerUI;
import UI.ProductUI;
import org.hibernate.SessionFactory;
import services.ManufacturerService;
import services.ProductService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        SessionConfig sessionConfig = new SessionConfig();
        SessionFactory sessionFactory = sessionConfig.getSessionFactory();
        ProductService productService = new ProductService(sessionFactory);
        ManufacturerService manufacturerService = new ManufacturerService(sessionFactory);

        ProductUI productUI = new ProductUI(productService, manufacturerService);
        ManufacturerUI manufacturerUI = new ManufacturerUI(manufacturerService);

        Scanner reader = new Scanner(System.in);
        System.out.println("1. Manufacturer interface.");
        System.out.println("2. Product interface.");
        System.out.println("0. Exit.");
        int optiune = reader.nextInt();
        reader.nextLine();

        if (optiune == 1) {
            System.out.println("|-|-|-|-|-|-|-|-|-|-|-|-|-|-|");
            manufacturerUI.startManufacturerUI();
        }

        if (optiune == 2) {
            System.out.println("|-|-|-|-|-|-|-|-|-|-|-|-|-|-|");
            productUI.startProductUI();
        }

        if (optiune == 0) {
            return;
        }
    }
}
