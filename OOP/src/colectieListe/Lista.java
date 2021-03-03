package colectieListe;

public class Lista {
    private Produs[] produse = new Produs[20];
    private int index = 0;

    public void addProdus (Produs product) {
        produse[index] = product;
        index++;
    }

    public void removeProdus (Produs deleteProduct) {
        int foundProduct = 0;
        for (int i = 0; i < produse.length; i++) {
            Produs prod = produse[i];
            if (prod != null) {
                if (prod.equals(deleteProduct)) {
                    foundProduct = i;
                }
            }
        }
        for (int i = foundProduct; i < produse.length - 1; i++) {
            produse[i] = produse[i+1];
        }
        index--;
    }

    public Produs get (int index) {
        return produse[index];
    }

    public int getSize () {
        return  index;
    }

    public Produs[] getProduse() {
        return produse;
    }

    public void setProduse(Produs[] produse) {
        this.produse = produse;
    }
}
