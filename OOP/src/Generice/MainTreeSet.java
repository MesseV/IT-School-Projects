package Generice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MainTreeSet {
    public static void main(String[] args) {
        System.out.println("----------------------HashSet");
        Set<Double> set = new HashSet<>();
        set.add(2.0);
        set.add(25.0);
        set.add(13.0);
        set.add(3.0); //la set nu exista garantii asupra ordinii elementelor din lista

        for (Double numar : set) {
            System.out.println(numar);
        }
        System.out.println("--------------------TreeSet");
        Set<Double> treeSet = new TreeSet<>();
        treeSet.add(2.0);
        treeSet.add(25.0);
        treeSet.add(13.0);
        treeSet.add(3.0); //treeSet nu pastreaza ordinea de inserare, le sorteaza in ordine crescatoare/alfabetica
        //nu sorteaza metode custom, ex: User
        for (Double num : treeSet) {
            System.out.println(num);
        }
        System.out.println("--------------------LinkedHashSet");
        Set<Double> linkedSet = new LinkedHashSet<>();
        linkedSet.add(2.0);
        linkedSet.add(25.0);
        linkedSet.add(13.0);
        linkedSet.add(3.0); //pastreaza elementele in ordinea inserarii lor

        for (Double numar : linkedSet) {
            System.out.println(numar);
        }
    }
}
