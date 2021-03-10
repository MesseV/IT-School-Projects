package Paint;

public class Dreptunghi extends FormaGeometrica{
    private double lungime;
    private double latime;

    public double getLungime() {
        return lungime;
    }

    public void setLungime(double lungime) {
        this.lungime = lungime;
    }

    public double getLatime() {
        return latime;
    }

    public void setLatime(double latime) {
        this.latime = latime;
    }

    @Override
    public void deseneaza() {
        System.out.println("Punctul de desenare");
        System.out.println(super.getStartPointX() + " " + super.getStartPointY());
        System.out.println("Dreptunghi cu ungimea de: " + lungime + " si latimea de: " + latime);
    }
}
