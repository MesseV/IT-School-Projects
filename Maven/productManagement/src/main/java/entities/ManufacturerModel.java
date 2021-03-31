package entities;

import javax.persistence.*;

@Entity
@Table(name = "manufacturers")
public class ManufacturerModel {

    @Id
    private int cui;
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private AddressModel address;


    public ManufacturerModel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCui() {
        return cui;
    }

    public void setCui(int cui) {
        this.cui = cui;
    }

    public AddressModel getAddress() {
        return address;
    }

    public void setAddress(AddressModel address) {
        this.address = address;
    }
}
