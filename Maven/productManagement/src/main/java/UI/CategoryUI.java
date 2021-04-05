package UI;

import entities.CategoryModel;
import entities.ProductModel;
import services.CategoryService;

import java.util.List;
import java.util.Scanner;

public class CategoryUI {

    private CategoryService categoryService;
    private Scanner reader = new Scanner(System.in);

    public CategoryUI(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    public CategoryUI(Scanner reader) {
        this.reader = reader;
    }

    public void startCategoryUI () {
        int optiune = -1;

        while (optiune != 0) {
            System.out.println("1. Display categories.");
            System.out.println("2. Add categories.");
            System.out.println("3. Remove categories.");
            System.out.println("4. Display products from a certain category.");
            optiune = reader.nextInt();
            reader.nextLine();

            if (optiune == 1) {
                categoryService.displayCategories();
            }

            if (optiune == 2) {
                addCategory();
            }

            if (optiune == 3) {
                deleteCategory();
            }

            if (optiune == 4) {
                categoryService.displayCategories();
                System.out.println("Select category by id.");
                int id = reader.nextInt();
                reader.nextLine();
                CategoryModel categoryModel = categoryService.findById(id);
                List<ProductModel> products = categoryModel.getProducts();

                for (ProductModel product : products) {
                    System.out.println(product.getId() + " " + product.getName());
                }
            }


        }

    }

    public void addCategory () {
        System.out.println("Enter name of new category.");
        String name = reader.nextLine();
        CategoryModel category = new CategoryModel();
        category.setName(name);
        categoryService.addCategory(category);
    }

    public void deleteCategory () {
        categoryService.displayCategories();
        System.out.println("Enter ID of category you wish to delete.");
        int id = reader.nextInt();
        reader.nextLine();
        categoryService.deleteCategory(id);
    }

}
