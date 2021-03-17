package Generice;

import java.util.HashMap;
import java.util.Map;

public class MainMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("A", "Animal");
        map.put("B", "Burta");
        map.put("C", "Cozonac");
        map.put("A", "Avion");

        for (Map.Entry<String, String> element : map.entrySet()) {
            String value = element.getValue(); //valoarea poate fi duplicata
            String key = element.getKey(); //cheia trebuie sa fie unica
            System.out.println(key + value);
        }
        System.out.println("---");
        String valoare = map.get("B");
        System.out.println(valoare);
    }
}
