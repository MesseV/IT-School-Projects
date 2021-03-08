package AbstractEx;

public class Patrat implements FormaGeometrica{

    private double lungime;


    @Override
    public double calculateArea() {
        return lungime * lungime;
    }

    @Override
    public double calculatePerimetre() {
        return lungime * 4;
    }

    public void setLungime(double lungime) {
        this.lungime = lungime;
    }

    public double getLungime() {
        return lungime;
    }
}
