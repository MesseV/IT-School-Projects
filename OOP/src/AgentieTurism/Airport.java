package AgentieTurism;

public class Airport {
    private String nume;
    private String isoCode;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    public void display () {
        System.out.println("A:" + nume);
    }
}
