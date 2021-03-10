package Paint;

public class Patrat extends FormaGeometrica{
    private double latura;

    public double getLatura() {
        return latura;
    }

    public void setLatura(double latura) {
        this.latura = latura;
    }

    @Override
    public void deseneaza() {
        System.out.println("Punctul de desenare");
        System.out.println(super.getStartPointX() + " " + super.getStartPointY());
        System.out.println("Patrat cu latura de: " + latura);
    }
}
