package AgentieTurism;

import java.util.ArrayList;

public class Country {

    private String name;
    private String isoCode;

    ArrayList<City> cities = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    public ArrayList<City> getCities() {
        return cities;
    }

    public void setCities(ArrayList<City> cities) {
        this.cities = cities;
    }

    public void display () {
        System.out.println("T:" + name);
        System.out.println("------------");
        for (int i = 0; i < cities.size(); i++) {
            City city = cities.get(i);
            city.diplay();
        }
        System.out.println("------------");
    }
}
