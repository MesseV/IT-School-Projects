package AbstractEx;

public class Patrat extends FormaGeometrica{

    private double lungime;


    @Override
    public double calculareArea() {
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
