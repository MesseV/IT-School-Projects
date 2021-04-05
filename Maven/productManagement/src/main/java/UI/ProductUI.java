package UI;

import entities.CategoryModel;
import entities.ManufacturerModel;
import entities.ProductModel;
import services.CategoryService;
import services.ManufacturerService;
import services.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductUI {

    private ProductService productService;
    private ManufacturerService manufacturerService;
    private CategoryService categoryService;
    private Scanner reader = new Scanner(System.in);

        public ProductUI(ProductService productService, ManufacturerService manufacturerService, CategoryService categoryService){
            this.productService = productService;
            this.manufacturerService = manufacturerService;
            this.categoryService = categoryService;
        }


    public void startProductUI () {
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
            if (optiune == 1) { //add products
                addProductUI();
            }

            if (optiune == 2) { //show products
                productService.displayProducts();
            }

            if (optiune == 3) { //edit product price
                changePriceUI();
            }

            if (optiune == 4) { //delete product
                deleteProductUI();
            }
        }
    }

    public void addProductUI () {
        System.out.println("Enter name of product.");
        String name = reader.nextLine();
        System.out.println("Enter description of product.");
        String description = reader.nextLine();
        System.out.println("Enter price of product.");
        double price = reader.nextDouble();
        reader.nextLine();

        manufacturerService.displayManufacturers();
        System.out.println("Enter CUI of manufacturer.");
        int cui = reader.nextInt();
        reader.nextLine();
        ManufacturerModel manufacturer = manufacturerService.findById(cui);

        categoryService.displayCategories();
        List<CategoryModel> categoryList = new ArrayList<>();
        System.out.println("Enter ID of category and enter '0' when you've added the ones you wish to add.");
        int id = -1;
        while (id != 0) {
            id = reader.nextInt();
            if (id != 0) {
                reader.nextLine();
                CategoryModel category = categoryService.findById(id);
                categoryList.add(category);
            }
        }


        ProductModel product = new ProductModel();
        product.setName(name);
        product.setDescription(description);
        product.setPrice(price);
        product.setManufacturer(manufacturer);
        product.setCategory(categoryList);
        productService.addProduct(product);
    }

    public void changePriceUI () {
        System.out.println("Enter ID of product you want to edit the price of.");
        int id = reader.nextInt();
        reader.nextLine();
        double newPrice = reader.nextDouble();
        productService.editPrice(id, newPrice);
    }

    public void deleteProductUI() {
        System.out.println("Enter ID of product you wish to remove.");
        int id = reader.nextInt();
        reader.nextLine();
        productService.deleteProduct(id);
    }
}
