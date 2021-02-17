package Compozitie;

public class Telefon {

    private String model;
    private int memorie;
    private int diagonala;

    public Telefon (String model) {
        this.model = model;
    }

    public void setModel (String model) {
        this.model = model;
    }

    public String getModel () {
        return this.model;
    }

    public void setMemorie (int memorie) {
        this.memorie = memorie;
    }

    public int getMemorie () {
        return this.memorie;
    }

    public void setDiagonala (int diagonala) {
        this.diagonala = diagonala;
    }

    public int getDiagonala () {
        return this.diagonala;
    }

}
