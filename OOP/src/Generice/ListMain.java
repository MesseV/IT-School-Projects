package Generice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
//        list.add("Vlad");
//        list.add("Gabi");
//        list.add("Andrei");
//
//        list.add(1, "Mihai");
//        list.remove(3);
//
//        for (String nume: list) {
//            System.out.println(nume);
//        }

        List<String> linkedList = new LinkedList<>(); //nu foloseste vectori pentru a forma lista
        Node<String> firstNode = new Node<>();
        firstNode.setData("Vlad");

        Node<String> secondNode = new Node<>();
        secondNode.setData("Mihai");
        firstNode.setNextNode(secondNode);

        Node<String> thirdNode = new Node<>();
        thirdNode.setData("Gabi");
        secondNode.setNextNode(thirdNode);

        //etc

        Node<String> elem = firstNode;
        while(elem.getNextNode() != null) {
            String data = elem.getData();
            System.out.println(data);
            elem = elem.getNextNode();
        }


    }
}
