package toString;

public class Persoana {
    private String nume;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() { //am dat override la metoda toString din clasa generala(parinte) Object
        return nume;
    }
}
