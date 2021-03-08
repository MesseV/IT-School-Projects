package AgentieTurism;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Continent Europe = new Continent();
        Europe.setName("Europe");

        ArrayList<Country> countries = new ArrayList<>();
        Country romania = new Country();
        romania.setName("Romania");
        Country franta = new Country();
        franta.setName("France");
        countries.add(romania);
        countries.add(franta);

        ArrayList<City> citiesRO = new ArrayList<>();
        ArrayList<City> citiesFR = new ArrayList<>();
        City bucuresti = new City();
        bucuresti.setName("Bucharest");
        City oradea = new City();
        oradea.setName("Oradea");
        City paris = new City();
        paris.setName("Paris");
        City marseille = new City();
        marseille.setName("Marseille");
        citiesRO.add(bucuresti);
        citiesRO.add(oradea);
        citiesFR.add(paris);
        citiesFR.add(marseille);

        ArrayList<Hotel> hotelsRo = new ArrayList<>();
        ArrayList<Hotel> hotelsFr = new ArrayList<>();
        Hotel ramada = new Hotel();
        ramada.setNume("Ramada");
        Hotel hilton = new Hotel();
        hilton.setNume("Hilton");
        hotelsRo.add(ramada);
        hotelsRo.add(hilton);
        hotelsFr.add(hilton);

        ArrayList<Airport> airportsOradea = new ArrayList<>();
        ArrayList<Airport> airportsBucuresti = new ArrayList<>();
        ArrayList<Airport> airportsParis = new ArrayList<>();
        ArrayList<Airport> airportsMarseille = new ArrayList<>();
        Airport otp = new Airport();
        otp.setNume("OTP Bucharest");
        Airport ora = new Airport();
        ora.setNume("Oradea Airport");
        Airport par = new Airport();
        par.setNume("Paris Airport");
        Airport mar = new Airport();
        mar.setNume("Marseille Airport");

        Europe.setCountries(countries);

        airportsBucuresti.add(otp);
        airportsOradea.add(ora);
        airportsParis.add(par);
        airportsMarseille.add(mar);

        romania.setCities(citiesRO);
        franta.setCities(citiesFR);

        oradea.setAirports(airportsOradea);
        bucuresti.setAirports(airportsBucuresti);
        paris.setAirports(airportsParis);
        marseille.setAirports(airportsMarseille);

        bucuresti.setHotels(hotelsRo);
        paris.setHotels(hotelsFr);



        Europe.display();

    }
}
