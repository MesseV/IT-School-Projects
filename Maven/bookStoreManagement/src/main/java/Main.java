import org.hibernate.SessionFactory;
import services.authorService;
import services.bookService;

public class Main {
    public static void main(String[] args) {

        sessionConfig sessionConfig = new sessionConfig();
        SessionFactory sessionFactory = sessionConfig.getSessionFactory();
        authorService authorService = new authorService(sessionFactory);
        bookService bookService = new bookService(sessionFactory);


    }
}
