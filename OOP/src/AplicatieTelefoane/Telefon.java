package AplicatieTelefoane;

public class Telefon {
    private String tipTelefon;
    private Contact[] contacte = new Contact[10];
    private int nextContact = 0;

    public void addContact (Contact contact) {
       contacte[nextContact] = contact;
       nextContact++;
    }

    public Telefon(String tipTelefon) {
        this.tipTelefon = tipTelefon;
    }

    public String getTipTelefon() {
        return tipTelefon;
    }

    public void setTipTelefon(String tipTelefon) {
        this.tipTelefon = tipTelefon;
    }

    public Contact[] getContact() {
        return contacte;
    }

    public void setContact(Contact[] contact) {
        this.contacte = contact;
    }
}
