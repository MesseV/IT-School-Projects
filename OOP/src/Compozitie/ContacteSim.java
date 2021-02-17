package Compozitie;

public class ContacteSim {

    private String nume;
    private String prenume;
    private String numarTelefon;

    public ContacteSim (String telefon) {
    }

    public void setNume (String nume) {
        this.nume = nume;
    }

    public void setPrenume (String prenume) {
        this.prenume = prenume;
    }

    public void setNumarTelefon (String numarTelefon) {
        this.numarTelefon = numarTelefon;
    }

    public String getNume () {
        return this.nume;
    }

    public String getNumarTelefon() {
        return numarTelefon;
    }

    public String getPrenume() {
        return prenume;
    }
}
