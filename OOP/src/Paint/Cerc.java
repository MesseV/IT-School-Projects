package Paint;

public class Cerc extends FormaGeometrica{
    private double raza;

    public double getRaza() {
        return raza;
    }

    public void setRaza(double raza) {
        this.raza = raza;
    }

    @Override
    public void deseneaza() {
        System.out.println("Punctul de desenare");
        System.out.println(super.getStartPointX() + " " + super.getStartPointY());
        System.out.println("Cerc cu raza de: " + raza);
    }
}
