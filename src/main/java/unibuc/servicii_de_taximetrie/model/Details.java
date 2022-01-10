package unibuc.servicii_de_taximetrie.model;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
@Table(name = "details")
public class Details {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "driver")
    private String driver;

    @Column(name = "client")
    private String client;

    @Column(name = "ride")
    private String ride;

    @Column(name = "price")
    private double price;

    @Column(name = "preferences")
    private String preferences;

    @Column(name = "car_details")
    private String carDetails;

    public Details(){
    }

    public Details(long id, String driver, String client, String ride, String preferences, double price, String carDetails) {
        this.id = id;
        this.driver = driver;
        this.client = client;
        this.ride = ride;
        this.preferences = preferences;
        this.price = price;
        this.carDetails = carDetails;
    }

    public Details(String driver, String client, String ride, String preferences, double price, String carDetails) {
        this.driver = driver;
        this.client = client;
        this.ride = ride;
        this.preferences = preferences;
        this.price = price;
        this.carDetails = carDetails;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getRide() {
        return ride;
    }

    public void setRide(String ride) {
        this.ride = ride;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPreferences() {
        return preferences;
    }

    public void setPreferences(String preferences) {
        this.preferences = preferences;
    }

    public String getCarDetails() {
        return carDetails;
    }

    public void setCarDetails(String carDetails) {
        this.carDetails = carDetails;
    }
}
