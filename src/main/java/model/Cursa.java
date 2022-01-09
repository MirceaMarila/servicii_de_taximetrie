package model;

import java.util.Random;

public class Cursa {

    private int id;
    private String locatie;
    private String destinatie;
    private double distanta;
    private double timp;

    public Cursa(){
        this.distanta = get_random_distance();
        this.timp = get_ride_time();
    }

    public Cursa(int id, String locatie, String destinatie) {
        this.id = id;
        this.locatie = locatie;
        this.destinatie = destinatie;
        this.distanta = get_random_distance();
        this.timp = get_ride_time();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocatie() {
        return locatie;
    }

    public void setLocatie(String locatie) {
        this.locatie = locatie;
    }

    public String getDestinatie() {
        return destinatie;
    }

    public void setDestinatie(String destinatie) {
        this.destinatie = destinatie;
    }

    public double getDistanta() {
        return distanta;
    }

    public void setDistanta(double distanta) {
        this.distanta = distanta;
    }

    public double getTimp() {
        return timp;
    }

    public void setTimp(double timp) {
        this.timp = timp;
    }

    private double get_random_distance(){
        Random r = new Random();
        return 3 + 17 * r.nextDouble();
    }

    private double get_ride_time(){
        return (this.distanta/6)*5;
    }

}
