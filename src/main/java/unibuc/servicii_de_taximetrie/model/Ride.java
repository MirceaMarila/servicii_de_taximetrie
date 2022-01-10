package unibuc.servicii_de_taximetrie.model;

import javax.persistence.*;
import java.util.Random;


@Entity
@Table(name = "rides")
public class Ride {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "location")
    private String location;

    @Column(name = "destination")
    private String destination;

    @Column(name = "distance")
    private double distance;

    @Column(name = "duration")
    private double duration;

    public Ride(){
        this.distance = get_random_distance();
        this.duration = get_ride_time();
    }

    public Ride(long id, String location, String destination) {
        this.id = id;
        this.location = location;
        this.destination = destination;
        this.distance = get_random_distance();
        this.duration = get_ride_time();
    }

    public Ride(String location, String destination) {
        this.location = location;
        this.destination = destination;
        this.distance = get_random_distance();
        this.duration = get_ride_time();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    private double get_random_distance(){
        Random r = new Random();
        return 3 + 17 * r.nextDouble();
    }

    private double get_ride_time(){
        return (this.distance /6)*5;
    }

}
