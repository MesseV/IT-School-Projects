package AbstractEx;

public class Car implements Desenabil, Construibil{

    private String colour;


    @Override
    public void deseneaza(String colour) {
        System.out.println("Se deseneaza masina.");
    }


    @Override
    public void construieste(String nume) {

    }
}
