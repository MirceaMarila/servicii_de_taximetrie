package unibuc.servicii_de_taximetrie.model;

public class Preferences {

    private long id;
    private MusicalGenres music;
    private int temperature;
    private boolean fastRide;
    private boolean sandwich;
    private boolean water;

    public Preferences(){
        this.fastRide = false;
        this.sandwich = false;
        this.water = false;
    }

    public Preferences(long id, MusicalGenres music, int temperature, boolean fastRide, boolean sandwich, boolean water) {
        this.id = id;
        this.music = music;
        this.temperature = temperature;
        this.fastRide = fastRide;
        this.sandwich = sandwich;
        this.water = water;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public boolean isFastRide() {
        return fastRide;
    }

    public void setFastRide(boolean fastRide) {
        this.fastRide = fastRide;
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
