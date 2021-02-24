package AplicatieCumpareProduse;

public class Haine extends Produs{

    private String marime;

    public Haine(String nume, double pret, String producator) {
        super(nume, pret, producator);
    }

    public String getMarime() {
        return marime;
    }

    public void setMarime(String marime) {
        this.marime = marime;
    }
}
