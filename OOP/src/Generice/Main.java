package Generice;

public class Main {

    public static void main(String[] args) {

        GenericBox<String, String> cutie = new GenericBox<>();
        GenericBox<Integer, String> cutieInteger = new GenericBox<>();

        cutie.add("Vlad");
        cutieInteger.add(2);
        cutie.addKey("Mesesan");

        String nume = cutie.getData();
        int x = cutieInteger.getData();


        GenericBox nespecificat = new GenericBox(); //inlocuieste obiectul "T" din GenericBox cu ob. Object
        // daca nu mentionez tipul intre paranteze
        nespecificat.add("Gabi");

    }
}
