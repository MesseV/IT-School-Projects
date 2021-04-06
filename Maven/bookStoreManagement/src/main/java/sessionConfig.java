
import entities.*;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import java.util.Properties;

public class sessionConfig {

    private SessionFactory sessionFactory;

    public sessionConfig() {
        Properties properties = new Properties();
        properties.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
        properties.put(Environment.URL, "jdbc:mysql://localhost:3306/productmanagement"); //serverul pe care il accesam
        properties.put(Environment.USER, "root"); //username
        properties.put(Environment.PASS, "Chicony00ROOT"); //parola
        //properties.put(Environment.SHOW_SQL, true); //asta afiseaza linia de 'Hibernate: ...'
        properties.put(Environment.HBM2DDL_AUTO, "update"); //asta creeaza(daca nu exista) si da update tabelului dupa ce introducem noi in Java

        Configuration configuration = new Configuration();
        configuration.setProperties(properties);

        configuration.addAnnotatedClass(authorModel.class);
        configuration.addAnnotatedClass(bookModel.class);

        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().
                applySettings(configuration.getProperties()).build();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);

    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}

