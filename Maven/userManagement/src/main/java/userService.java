import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;


import java.util.List;
import java.util.Properties;

public class userService {
    private SessionFactory sessionFactory;

    public userService() {
        Properties properties = new Properties();
        properties.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
        properties.put(Environment.URL, "jdbc:mysql://localhost:3306/productmanagement"); //serverul pe care il accesam
        properties.put(Environment.USER, "root"); //username
        properties.put(Environment.PASS, "Chicony00ROOT"); //parola
        properties.put(Environment.SHOW_SQL, true); //asta afiseaza linia de 'Hibernate: ...'
        properties.put(Environment.HBM2DDL_AUTO, "update"); //asta creeaza(daca nu exista) si da update tabelului dupa ce introducem noi in Java

        Configuration configuration = new Configuration();
        configuration.setProperties(properties);

        configuration.addAnnotatedClass(userModel.class);

        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().
                applySettings(configuration.getProperties()).build();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);


    }
    public void showUsers () {
        Session session = sessionFactory.openSession();
        List<userModel> users = session.createQuery("from userModel").getResultList();

        for (userModel user : users) {
            System.out.println(user.getId() + " " + user.getFirstName() + " " + user.getLastName());
        }
        session.close();
    }

    public void addUser (userModel user) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(user);
        transaction.commit();
        session.close();
    }

    public void editUser (int id, String lastName) {
        Session session = sessionFactory.openSession();
        userModel userModel = session.find(userModel.class,id);
        userModel.setLastName(lastName);
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(userModel);
        transaction.commit();
        session.close();
    }

    public void deleteUser (int id) {
        Session session = sessionFactory.openSession();
        userModel userModel = session.find(userModel.class, id);
        Transaction transaction = session.beginTransaction();
        session.delete(userModel);
        transaction.commit();
        session.close();
    }

}
