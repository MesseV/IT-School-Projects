package Paint;

import java.util.ArrayList;

public class Plansa implements Desenabil{
    private int width;
    private int height;

    private ArrayList<FormaGeometrica> formeGeometrice = new ArrayList<>();

    public void add (FormaGeometrica formaGeometrica) {
        formeGeometrice.add(formaGeometrica);
    }

    @Override
    public void deseneaza() {
        for (int i = 0; i< formeGeometrice.size(); i++) {
            FormaGeometrica formaGeometrica = formeGeometrice.get(i);
            formaGeometrica.deseneaza();
        }
    }
}
