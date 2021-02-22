package AplicatieTelefoane;

public class Contact {
    private String name;
    private String prenume;
    private String nrTelefon;

    public Contact(String name, String prenume, String nrTelefon) {
        this.name = name;
        this.prenume = prenume;
        this.nrTelefon = nrTelefon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getNrTelefon() {
        return nrTelefon;
    }

    public void setNrTelefon(String nrTelefon) {
        this.nrTelefon = nrTelefon;
    }
}
