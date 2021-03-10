package Generice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainParcurgere {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Vlad");
        list.add("Gabi");
        list.add("Andrei");

        System.out.println("---------------Afisare prin 'for clasic':");

        for (int i = 0; i< list.size(); i++ ){
            String nume = list.get(i);
            System.out.println(nume);
            //list.remove(nume);  -functioneaza sa eliminam toate elementele asa
/*
    remove in classic for
            if (nume.equals("Gabi")) {
                list.remove(nume);
            } else {
                System.out.println(nume);
            }
*/
        }


        System.out.println("---------------Afisare prin 'Iterator':");

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String nume = it.next();
            System.out.println(nume);
            /*
    remove in iterator - se face prin IT.REMOVE
            if (nume.equals("Gabi")) {
                it.remove();
            } else {
                System.out.println(nume);
            }
*/
        }


        System.out.println("---------------Afisare prin 'Enhanced for' (for-each):");

        for (String nume : list) {
            System.out.println(nume);
/*      IN GENERAL, NU SE STERG ELEMENTE FOLOSING "enhanced for"
            if (nume.equals("Gabi")) {
                list.remove(2); //putem sa punem "nume" sau un index(numarul locului)
            } else {
                System.out.println(nume);
            }
*/
        }
    }
}
