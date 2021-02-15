package com.company;

public class Main {

    public static void main(String[] args) {
	Bloc blocA1 = new Bloc(3, "S45", "A1");
	Bloc blocB1 = new Bloc(5, "S30", "B1");

        System.out.println("Adresa:" + blocA1.getAddress());
        System.out.println("Adresa:" + blocB1.getAddress());

        blocA1.setNumeBloc("Blocul Meu");
        System.out.println("Numele blocului: " + blocA1.getNumeBloc());

    }
}
