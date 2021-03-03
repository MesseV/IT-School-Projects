package AplicatieCumpareProduse;

public class Fruct extends Produs{

    private boolean bio;

    public Fruct(String nume, double pret, String producator, boolean bio) {
        super(nume, pret, producator);
        this.bio = bio;
    }

    public boolean isBio() {
        return bio;
    }

    public void setBio(boolean bio) {
        this.bio = bio;
    }

    @Override
    public String getCategory() {
        return "Fructe";
    }
}
