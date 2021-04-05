package services;

import entities.UserModel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class UserService {

    private SessionFactory sessionFactory;

    public UserService(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void displayUsers () {
        Session session = sessionFactory.openSession();
        List<UserModel> users = session.createQuery("from UserModel").getResultList();
        for (UserModel user : users) {
            System.out.println(user.getId() + " " + user.getName() + " " + user.getSurname());
        }
        session.close();
    }


    public void addUser (UserModel userModel) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(userModel);
        transaction.commit();
        session.close();
    }

    public void removeUser (UserModel userModel) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(userModel);
        transaction.commit();
        session.close();
    }

    public void editUser (int id, String newName) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        UserModel userModel = session.find(UserModel.class, id);
        userModel.setName(newName);
        transaction.commit();
        session.close();
    }
}
