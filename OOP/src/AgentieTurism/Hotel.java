package AgentieTurism;

public class Hotel {
    private String nume;
    private int nrStele;
    private boolean hasSpa;
    private boolean hasParking;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getNrStele() {
        return nrStele;
    }

    public void setNrStele(int nrStele) {
        this.nrStele = nrStele;
    }

    public boolean isHasSpa() {
        return hasSpa;
    }

    public void setHasSpa(boolean hasSpa) {
        this.hasSpa = hasSpa;
    }

    public boolean isHasParking() {
        return hasParking;
    }

    public void setHasParking(boolean hasParking) {
        this.hasParking = hasParking;
    }

    public void display () {
        System.out.println("H:" + nume);
    }
}
