package Generice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainSet {
    public static void main(String[] args) {
        List<String> nume = new ArrayList<>();
        nume.add("Gabi");
        nume.add("Mihai");
        nume.add("Vlad");
        nume.add("Mihai");
        nume.add(1, "Radu");

        String radu = nume.get(1);
        nume.remove(0);

        for (String num : nume) {
            System.out.println(num);
        }
        System.out.println("---------------");

        Set<String> numeSet = new HashSet<>();
        numeSet.add("Gabi");
        numeSet.add("Vlad");
        numeSet.add("Mihai");
        numeSet.add("Mihai"); //set nu poate contine elemente duplicate
        numeSet.add("Gabi");

        System.out.println(numeSet.size());
        for (String num : numeSet) {
            System.out.println(num);
        }
    }
}
