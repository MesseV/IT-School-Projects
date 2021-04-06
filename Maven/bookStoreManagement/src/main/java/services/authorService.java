package services;

import entities.authorModel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class authorService {

        private SessionFactory sessionFactory;

        public authorService(SessionFactory sessionFactory) {
                this.sessionFactory = sessionFactory;
        }

        public void displayAuthors () {
                Session session = sessionFactory.openSession();
                List<authorModel> authorModelList = session.createQuery("from authorModel").getResultList();
                for (authorModel authorModel : authorModelList) {
                        System.out.println(authorModel.getId() + " - " + authorModel.getName() + " ,aged " + authorModel.getAge());
                }
                session.close();
        }

        public void addAuthors (authorModel authorModel) {
                Session session = sessionFactory.openSession();
                Transaction transaction = session.beginTransaction();
                session.save(authorModel);
                transaction.commit();
                session.close();
        }

        public void removeAuthor (int id) {
                Session session = sessionFactory.openSession();
                Transaction transaction = session.beginTransaction();
                authorModel authorModel = session.find(entities.authorModel.class, id);
                session.delete(authorModel);
                transaction.commit();
                session.close();
        }
}
