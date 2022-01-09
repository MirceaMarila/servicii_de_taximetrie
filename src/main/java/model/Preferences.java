package model;

public class Preferences {

    private int id;
    private MusicalGenres music;
    private int temperature;
    private boolean fast_ride;
    private boolean sandwich;
    private boolean water;

    public Preferences(){
        this.fast_ride = false;
        this.sandwich = false;
        this.water = false;
    }

    public Preferences(int id, MusicalGenres music, int temperature, boolean fast_ride, boolean sandwich, boolean water) {
        this.id = id;
        this.music = music;
        this.temperature = temperature;
        this.fast_ride = fast_ride;
        this.sandwich = sandwich;
        this.water = water;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public boolean isFast_ride() {
        return fast_ride;
    }

    public void setFast_ride(boolean fast_ride) {
        this.fast_ride = fast_ride;
    }

    public boolean getSandwich() {
        return sandwich;
    }

    public void setSandwich(boolean sandwich) {
        this.sandwich = sandwich;
    }

    public boolean getWater() {
        return water;
    }

    public void setWater(boolean water) {
        this.water = water;
    }
}
