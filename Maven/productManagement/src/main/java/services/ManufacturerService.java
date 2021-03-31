package services;

import entities.ManufacturerModel;
import entities.ProductModel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class ManufacturerService {

    private SessionFactory sessionFactory;

    public ManufacturerService (SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void displayManufacturers() {
        Session session = sessionFactory.openSession();
        List<ManufacturerModel> producatori = session.createQuery("from entities.ManufacturerModel").getResultList();
        for (ManufacturerModel producator : producatori) {
            System.out.println(producator.getCui() + " - " + producator.getName());
        }
        session.close();
    }

    public void addManufacturer (ManufacturerModel manufacturerModel) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(manufacturerModel);
        transaction.commit();
        session.close();
    }

    public ManufacturerModel findById(int cui){
        Session session = sessionFactory.openSession();
        ManufacturerModel manufacturerModel = session.find(ManufacturerModel.class,cui);
        return manufacturerModel;
    }

}
