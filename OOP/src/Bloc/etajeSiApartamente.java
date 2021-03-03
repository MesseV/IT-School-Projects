package Bloc;

public class etajeSiApartamente {
    private String numeLocuitor;
    private int etaj;
    private int apartament;

    public etajeSiApartamente (String numeLocuitor) {
        this.numeLocuitor = numeLocuitor;
    }

    public String getNumeLocuitor() {
        return numeLocuitor;
    }

    public void setNumeLocuitor(String numeLocuitor) {
        this.numeLocuitor = numeLocuitor;
    }

    public int getEtaj() {
        return etaj;
    }

    public void setEtaj(int etaj) {
        this.etaj = etaj;
    }

    public int getApartament() {
        return apartament;
    }

    public void setApartament(int apartament) {
        this.apartament = apartament;
    }
}
