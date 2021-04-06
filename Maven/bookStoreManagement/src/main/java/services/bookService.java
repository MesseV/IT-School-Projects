package services;

import org.hibernate.SessionFactory;

public class bookService {

    private SessionFactory sessionFactory;

    public bookService(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
