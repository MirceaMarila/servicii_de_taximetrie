package unibuc.servicii_de_taximetrie.model;

import java.time.LocalTime;

public class Details {

    private long id;
    private Driver driver;
    private Client client;
    private Ride ride;
    private double price;
    private Preferences preferences;

    public Details(){
        this.price = get_ride_price();
    }

    public Details(long id, Driver driver, Client client, Ride ride, Preferences preferences) {
        this.id = id;
        this.driver = driver;
        this.client = client;
        this.ride = ride;
        this.preferences = preferences;
        this.price = get_ride_price();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Ride getRide() {
        return ride;
    }

    public void setRide(Ride ride) {
        this.ride = ride;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Preferences getPreferences() {
        return preferences;
    }

    public void setPreferences(Preferences preferences) {
        this.preferences = preferences;
    }

    private double get_ride_price(){
        double pret = this.ride.getDistance() * 2;
        LocalTime now = LocalTime.now();

        if(now.getHour() >= 22 || now.getHour() <= 6){
            pret += pret/2;
        }

        if(this.preferences.getSandwich())
            pret += 10;

        if(this.preferences.getWater())
            pret += 5;

        return pret;
    }
}
