package AgentieTurism;

import java.util.ArrayList;

public class Continent extends Object{ //clasele extind clasa Object si cand nu scrii nimic - e default extension

    private String name;
    private ArrayList<Country> countries = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Country> getCountries() {
        return countries;
    }

    public void setCountries(ArrayList<Country> countries) {
        this.countries = countries;
    }

    public void display () {
        System.out.println("C:" + name);
        for (int i = 0; i < countries.size(); i++) {
            Country country = countries.get(i);
            country.display();
        }
        System.out.println("------------");
    }
}
