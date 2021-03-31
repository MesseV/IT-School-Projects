import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    ProductService productService = new ProductService();
        Scanner reader = new Scanner(System.in);

        int optiune = -1;
        while (optiune != 0) {
            System.out.println("1. Add product.");
            System.out.println("2. Display products.");
            System.out.println("3. Edit product price.");
            System.out.println("4. Delete product." );
            System.out.println("0. Exit.");
            optiune = reader.nextInt();
            reader.nextLine();
            if (optiune == 1) {
                System.out.println("Enter name of product.");
                String name = reader.nextLine();
                System.out.println("Enter description of product.");
                String description = reader.nextLine();
                System.out.println("Enter price of product.");
                double price = reader.nextDouble();
                reader.nextLine();
                ProductModel product = new ProductModel();
                product.setName(name);
                product.setDescription(description);
                product.setPrice(price);
                productService.addProduct(product);
            }

            if (optiune == 2) {
                productService.displayProducts();
            }

            if (optiune == 3) {
                System.out.println("Enter ID of product you want to edit the price of.");
                int id = reader.nextInt();
                reader.nextLine();
                double newPrice = reader.nextDouble();
                productService.editPrice(id, newPrice);
            }

            if (optiune == 4) {
                System.out.println("Enter ID of product you wish to remove.");
                int id = reader.nextInt();
                reader.nextLine();
                productService.deleteProduct(id);
            }
        }


    }
}
