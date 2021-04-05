package services;

import entities.CategoryModel;
import entities.ManufacturerModel;
import entities.ProductModel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class ProductService {

    private SessionFactory sessionFactory;

    public ProductService (SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void displayProducts () {
        Session session = sessionFactory.openSession();
        List<ProductModel> products = session.createQuery("from entities.ProductModel").getResultList();
        for (ProductModel product : products) {
            System.out.print(product.getId() + ". " + product.getName() + " - "
                    + product.getDescription() + " - " + product.getPrice() + " RON");
            ManufacturerModel productManufacturer = product.getManufacturer();
            if (productManufacturer != null) {
                System.out.print(" ---Manufacturer: " + productManufacturer.getName());
            }
            System.out.println();
        }
        session.close();
    }

    public void addProduct (ProductModel productModel) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(productModel);
        transaction.commit();
        session.close();
    }


    public void editPrice (int id, double price) {
        Session session = sessionFactory.openSession();
        ProductModel productModel = session.find(ProductModel.class,id);
        productModel.setPrice(price);
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(productModel);
        transaction.commit();
        session.close();
    }

    public void deleteProduct (int id) {
        Session session = sessionFactory.openSession();
        ProductModel productModel = session.find(ProductModel.class,id);
        Transaction transaction = session.beginTransaction();
        session.delete(productModel);
        transaction.commit();
        session.close();
    }

}
