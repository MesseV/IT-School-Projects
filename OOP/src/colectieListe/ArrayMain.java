package colectieListe;

import java.util.ArrayList;

public class ArrayMain {
    public static void main(String[] args) {

        ArrayList<Produs> lista = new ArrayList<>();

        Produs mere = new Produs();
        mere.setNume("Mere");
        lista.add(mere);

        Produs pere = new Produs();
        pere.setNume("Pere");
        lista.add(pere);

        Produs ananas = new Produs();
        ananas.setNume("Ananas");
        lista.add(ananas);

        for (int i = 0; i < lista.size(); i++) {
            Produs element = lista.get(i);
            System.out.println(element.getNume());
        } //afisare

        lista.remove(pere);

        System.out.println("|||after removal:");
        for (int i = 0; i < lista.size(); i++) {
            Produs element = lista.get(i);
            System.out.println(element.getNume());
        } //afisare



    }
}
