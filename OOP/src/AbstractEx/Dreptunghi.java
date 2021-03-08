package AbstractEx;

public class Dreptunghi extends FormaGeometrica{

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
}
