package Bloc;

public class Bloc {
    private String numeBloc;
    private etajeSiApartamente etajeSiApartamente;

    public Bloc (String nume) {
        this.numeBloc = nume;
    }

    public String getNumeBloc() {
        return numeBloc;
    }

    public void setNumeBloc(String numeBloc) {
        this.numeBloc = numeBloc;
    }

    public etajeSiApartamente getEtajeSiApartamente() {
        return etajeSiApartamente;
    }

    public void setEtajeSiApartamente(etajeSiApartamente etajeSiApartamente) {
        this.etajeSiApartamente = etajeSiApartamente;
    }
}
