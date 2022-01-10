package unibuc.servicii_de_taximetrie.dto;

import unibuc.servicii_de_taximetrie.model.MusicalGenres;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class OrderRequest {

    private int idDriver = 0;
    private int idClient;
    private String location;
    private String destination;
    @Enumerated(EnumType.STRING)
    private MusicalGenres music = MusicalGenres.ANY;
    private int temperature = 0;
    private boolean fastRide;
    private boolean sandwich;
    private boolean water;

    public OrderRequest() {
    }

    public OrderRequest(int idDriver, int idClient, String location, String destination, MusicalGenres music, int temperature, boolean fastRide, boolean sandwich, boolean water) {
        this.idDriver = idDriver;
        this.idClient = idClient;
        this.location = location;
        this.destination = destination;
        this.music = music;
        this.temperature = temperature;
        this.fastRide = fastRide;
        this.sandwich = sandwich;
        this.water = water;
    }

    public int getIdDriver() {
        return idDriver;
    }

    public void setIdDriver(int idDriver) {
        this.idDriver = idDriver;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public MusicalGenres getMusic() {
        return music;
    }

    public void setMusic(MusicalGenres music) {
        this.music = music;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public boolean isFastRide() {
        return fastRide;
    }

    public void setFastRide(boolean fastRide) {
        this.fastRide = fastRide;
    }

    public boolean isSandwich() {
        return sandwich;
    }

    public void setSandwich(boolean sandwich) {
        this.sandwich = sandwich;
    }

    public boolean isWater() {
        return water;
    }

    public void setWater(boolean water) {
        this.water = water;
    }
}
