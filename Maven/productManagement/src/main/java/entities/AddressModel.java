package entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class AddressModel {

    @Id
    private int codPostal;
    private String street;
    private String cityCountry;

    public int getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(int codPostal) {
        this.codPostal = codPostal;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getcityCountry() {
        return cityCountry;
    }

    public void setcityCountry(String cityCountry) {
        this.cityCountry = cityCountry;
    }
}
