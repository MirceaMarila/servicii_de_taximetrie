package unibuc.servicii_de_taximetrie.model;

import javax.persistence.*;

@Entity
@Table(name = "clients")
public class Client{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;

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

    public Client(){

    }

    public Client(long id, String name, int nrOfRides, double money, double rating, int nrOfReviews) {
        this.id = id;
        this.name = name;
        this.nrOfRides = nrOfRides;
        this.money = money;
        this.rating = rating;
        this.nrOfReviews = nrOfReviews;
    }

    public Client(String name, int nrOfRides, double money, double rating, int nrOfReviews) {
        this.name = name;
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
}
