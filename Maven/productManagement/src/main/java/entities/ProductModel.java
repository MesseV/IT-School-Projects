package entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "products")
public class ProductModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String description;
    private double price;

    @ManyToOne
    private ManufacturerModel manufacturer;

    @ManyToMany
    private List<CategoryModel> category;

    public ProductModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ManufacturerModel getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(ManufacturerModel manufacturer) {
        this.manufacturer = manufacturer;
    }

    public List<CategoryModel> getCategory() {
        return category;
    }

    public void setCategory(List<CategoryModel> category) {
        this.category = category;
    }
}
