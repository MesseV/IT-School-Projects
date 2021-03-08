package AbstractEx;

public class Dreptunghi implements FormaGeometrica, Desenabil{ //"implements" pt interface
//o clasa poate extinde o singura clasa, dar poate implementa mai multe interfete
    private double lat;
    private double lun;


    @Override
    public double calculateArea() {
        return lat * lun;
    }

    @Override
    public double calculatePerimetre() {
        return lat * 2 + lun * 2;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLun() {
        return lun;
    }

    public void setLun(double lun) {
        this.lun = lun;
    }

    @Override
    public void deseneaza(String colour) {
        System.out.println("Se deseneaza dreptunghiul in culoarea " + colour);
    }
}
