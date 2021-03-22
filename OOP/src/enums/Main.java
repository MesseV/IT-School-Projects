package enums;

public class Main {
    public static void main(String[] args) {
        //enum e folosit cand avem valori predefinite, daca avem doar tipurile de date din cadrul Enum
        for (ProductType type : ProductType.values()) {
            System.out.println(type);
        }

        Product product = new Product();
        product.setProductType(ProductType.DULCIURI);


        ProductType productType = ProductType.FRUCTE;
        System.out.println(productType);
    }
}
