package colectieListe;

public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();
        Produs mere = new Produs();
        mere.setNume("Mere");
        lista.addProdus(mere);
        Produs pere = new Produs();
        pere.setNume("Pere");
        lista.addProdus(pere);
        Produs ananas = new Produs();
        ananas.setNume("Ananas");
        lista.addProdus(ananas);

        lista.removeProdus(pere);

        Produs[] produseDinLista = lista.getProduse();
        for (int i = 0; i < produseDinLista.length; i++) {
            Produs produs = produseDinLista[i];
            if (produs != null) {
                System.out.println(produs.getNume());
            }
        }

    }
}
