package services;

import entities.CategoryModel;
import entities.ManufacturerModel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class CategoryService {

    private SessionFactory sessionFactory;

    public CategoryService(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void displayCategories () {
        Session session = sessionFactory.openSession();
        List<CategoryModel> categoryModelList = session.createQuery("from CategoryModel").getResultList();

        for (CategoryModel category : categoryModelList) {
            System.out.println(category.getId() + " " + category.getName());
        }
        session.close();
    }

    public void addCategory (CategoryModel categoryToBeAdded) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(categoryToBeAdded);
        transaction.commit();
        session.close();
    }

    public void deleteCategory (int id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        CategoryModel categoryModel = session.find(CategoryModel.class, id);
        session.delete(categoryModel);
        transaction.commit();
        session.close();
    }

    public CategoryModel findById(int id){
        Session session = sessionFactory.openSession();
        CategoryModel categoryModel = session.find(CategoryModel.class, id);
        session.close();
        return categoryModel;
    }
}
