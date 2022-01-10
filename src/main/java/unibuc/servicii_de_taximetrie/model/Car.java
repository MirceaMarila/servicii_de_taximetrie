package unibuc.servicii_de_taximetrie.model;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "brand_model")
    private String brandModel;

    @Column(name = "plate")
    private String plate;

    @Column(name = "color")
    @Enumerated(EnumType.STRING)
    private CarColors color;

    @Column(name = "year")
    private int year;

    public Car(){

    }

    public Car(long id, String brandModel, String plate, CarColors color, int year) {
        this.id = id;
        this.brandModel = brandModel;
        this.plate = plate;
        this.color = color;
        this.year = year;
    }

    public Car(String brandModel, String plate, CarColors color, int year) {
        this.brandModel = brandModel;
        this.plate = plate;
        this.color = color;
        this.year = year;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBrandModel() {
        return brandModel;
    }

    public void setBrandModel(String brandModel) {
        this.brandModel = brandModel;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public CarColors getColor() {
        return color;
    }

    public void setColor(CarColors color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
