package AplicatieCumpareProduse;

public abstract class Produs {
    private String nume;
    private double pret;
    private String producator;

    public Produs(String nume, double pret, String producator) {
        this.nume = nume;
        this.pret = pret;
        this.producator = producator;
    }

    public abstract String getCategory ();

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public String getProducator() {
        return producator;
    }

    public void setProducator(String producator) {
        this.producator = producator;
    }
}
