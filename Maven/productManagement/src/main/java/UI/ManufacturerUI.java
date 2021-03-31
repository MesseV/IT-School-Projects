package UI;

import entities.AddressModel;
import entities.ManufacturerModel;
import services.ManufacturerService;

import java.util.Scanner;

public class ManufacturerUI {

    private ManufacturerService manufacturerService;
    private Scanner reader = new Scanner(System.in);

    public ManufacturerUI(ManufacturerService manufacturerService) {
        this.manufacturerService = manufacturerService;
    }


    public void startManufacturerUI () {

        int optiune = -1;
        while (optiune != 0) {
            System.out.println("1. Add manufacturer.");
            System.out.println("2. Display manufacturers.");
            System.out.println("3. Edit manufacturer name.");
            System.out.println("4. Remove manufacturer." );
            System.out.println("0. Exit.");
            optiune = reader.nextInt();
            reader.nextLine();
            if (optiune == 1) {
                addManufacturerUI();
            }

            if (optiune == 2) {
                manufacturerService.displayManufacturers();
            }

            if (optiune == 3) {
                editManufacturerUI();
            }

            if (optiune == 4) {
                removeManufacturerUI();
            }
        }
    }

    public void addManufacturerUI(){
        System.out.println("Enter manufacturer CUI.");
        int cui = reader.nextInt();
        reader.nextLine();
        System.out.println("Enter manufacturer name.");
        String name = reader.nextLine();

        System.out.println("Enter postal code: ");
        int codPostal = reader.nextInt();
        reader.nextLine();
        System.out.println("Enter street.");
        String street = reader.nextLine();
        System.out.println("Enter city and country.");
        String cityCountry = reader.nextLine();

        AddressModel addressModel = new AddressModel();
        addressModel.setCodPostal(codPostal);
        addressModel.setStreet(street);
        addressModel.setcityCountry(cityCountry);

        ManufacturerModel manufacturer = new ManufacturerModel();
        manufacturer.setCui(cui);
        manufacturer.setName(name);
        manufacturer.setAddress(addressModel);
        manufacturerService.addManufacturer(manufacturer);
    }

    public void editManufacturerUI () {

    }

    public void removeManufacturerUI() {

    }

}
