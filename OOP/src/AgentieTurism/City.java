package AgentieTurism;

import java.util.ArrayList;

public class City {

    private String name;
    private String descriere;

    private ArrayList<Airport> airports = new ArrayList<Airport>(); //relatie de compozitie cu Aeropoarte
    private ArrayList<Hotel> hotels = new ArrayList<>();

    public ArrayList<Hotel> getHotels() {
        return hotels;
    }

    public void setHotels(ArrayList<Hotel> hotels) {
        this.hotels = hotels;
    }

    public ArrayList<Airport> getAirports() {
        return airports;
    }

    public void setAirports(ArrayList<Airport> airports) {
        this.airports = airports;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public void diplay () {
        System.out.println("O:" + name);
        for (int i = 0; i < airports.size(); i++) {
            Airport airport = airports.get(i);
            airport.display();
        }

        for (int i = 0; i < hotels.size(); i++) {
            Hotel hotel = hotels.get(i);
            hotel.display();
        }
    }
}
