package Compozitie;

public class cardSIM {

    private String operator;
    private String numeFrecventa;
    private ContacteSim[] contacte;

    public cardSIM(int frecventa, String operator) {
        this.operator = operator;
        this.numeFrecventa = frecventa + "G";
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getNumeFrecventa() {
        return numeFrecventa;
    }

    public void setNumeFrecventa(String numeFrecventa) {
        this.numeFrecventa = numeFrecventa;
    }

    public ContacteSim[] getContacte() {
        return contacte;
    }

    public void setContacte(ContacteSim[] contacte) {
        this.contacte = contacte;
    }
}
