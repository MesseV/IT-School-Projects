package com.company;

public class Bloc {
    private String scara;
    private String bloc;
    private int etaje;

    public Bloc(int etaje, String scara, String bloc) {
        this.etaje = etaje;
        this.scara = scara;
        this.bloc = bloc;
    }

    public String getAddress () {
        String adresa = this.bloc + " " + this.scara;
        return adresa;
    }

}
