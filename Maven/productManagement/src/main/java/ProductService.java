import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import java.util.List;
import java.util.Properties;

public class ProductService {

    private SessionFactory sessionFactory;

    public ProductService () {
        Properties properties = new Properties();
        properties.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
        properties.put(Environment.URL, "jdbc:mysql://localhost:3306/productmanagement"); //serverul pe care il accesam
        properties.put(Environment.USER, "root"); //username
        properties.put(Environment.PASS, "Chicony00ROOT"); //parola
        properties.put(Environment.SHOW_SQL, true); //asta afiseaza linia de 'Hibernate: ...'
        properties.put(Environment.HBM2DDL_AUTO, "update"); //asta creeaza(daca nu exista) si da update tabelului dupa ce introducem noi in Java

        Configuration configuration = new Configuration();
        configuration.setProperties(properties);

        configuration.addAnnotatedClass(ProductModel.class);

        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().
                applySettings(configuration.getProperties()).build();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
    }

    public void addProduct (ProductModel productModel) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(productModel);
        transaction.commit();
        session.close();
    }

    public void displayProducts () {
        Session session = sessionFactory.openSession();
        List<ProductModel> products = session.createQuery("from ProductModel").getResultList();

        for (ProductModel product : products) {
            System.out.println(product.getId() + ". " + product.getName() + " - "
                    + product.getDescription() + " - " + product.getPrice() + " RON");
        }
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
