package model;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "brand")
    private String brand;

    @Column(name = "model")
    private String model;

    @Column(name = "color")
    private String color;

    @Column(name = "manufacturing_year")
    private int manufacturing_year;

    public Car(){

    }

    public Car(int id, String brand, String model, String color, int manufacturing_year) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.manufacturing_year = manufacturing_year;
    }

    public Car(String brand, String model, String color, int manufacturing_year) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.manufacturing_year = manufacturing_year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getManufacturing_year() {
        return manufacturing_year;
    }

    public void setManufacturing_year(int manufacturing_year) {
        this.manufacturing_year = manufacturing_year;
    }
}
