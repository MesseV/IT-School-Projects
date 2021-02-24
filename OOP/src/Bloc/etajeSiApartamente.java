package Bloc;

public class etajeSiApartamente {
    private String numeLocuitor;
    private String[][] etajeSiApartamente;

    public etajeSiApartamente (String numeLocuitor) {
        this.numeLocuitor = numeLocuitor;
    }

    public String getNumeLocuitor() {
        return numeLocuitor;
    }

    public void setNumeLocuitor(String numeLocuitor) {
        this.numeLocuitor = numeLocuitor;
    }

    public String[][] getEtajeSiApartamente() {
        return etajeSiApartamente;
    }

    public void setEtajeSiApartamente(String[][] etajeSiApartamente) {
        this.etajeSiApartamente = etajeSiApartamente;
    }
}
