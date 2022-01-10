package unibuc.servicii_de_taximetrie.model;


import javax.persistence.*;

@Entity
@Table(name = "drivers")
public class Driver{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;

    @Column(name = "car_details")
    private String carDetails;

    @Column(name = "name")
    protected String name;

    @Column(name = "nr_of_rides")
    protected int nrOfRides;

    @Column(name = "money")
    protected double money;

    @Column(name = "rating")
    protected double rating;

    @Column(name = "nr_of_reviews")
    protected int nrOfReviews;

    public Driver(){

    }

    public Driver(long id, String name, String carDetails, int nrOfRides, double money, double rating, int nrOfReviews) {
        this.id = id;
        this.name = name;
        this.carDetails = carDetails;
        this.nrOfRides = nrOfRides;
        this.money = money;
        this.rating = rating;
        this.nrOfReviews = nrOfReviews;
    }

    public Driver(String name, String carDetails, int nrOfRides, double money, double rating, int nrOfReviews) {
        this.name = name;
        this.carDetails = carDetails;
        this.nrOfRides = nrOfRides;
        this.money = money;
        this.rating = rating;
        this.nrOfReviews = nrOfReviews;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNrOfRides() {
        return nrOfRides;
    }

    public void setNrOfRides(int nrOfRides) {
        this.nrOfRides = nrOfRides;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getNrOfReviews() {
        return nrOfReviews;
    }

    public void setNrOfReviews(int nrOfReviews) {
        this.nrOfReviews = nrOfReviews;
    }

    public String getCarDetails() {
        return carDetails;
    }

    public void setCarDetails(String car_details) {
        this.carDetails = car_details;
    }

}
