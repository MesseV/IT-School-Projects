package com.company;

public class Bloc {
    private String scara;
    private String bloc;
    private int etaje;
    private String numeBloc;

    public Bloc(int etaje, String scara, String bloc) {
        this.etaje = etaje;
        this.scara = scara;
        this.bloc = bloc;
    }

    public String getAddress () {
        return this.bloc + " " + this.scara;
    }

    public void setNumeBloc (String numeBloc) {
        this.numeBloc = numeBloc; 
    }

    public String getNumeBloc () {
        return this.numeBloc;
    }

}
