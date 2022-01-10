package unibuc.servicii_de_taximetrie.model;

import javax.persistence.*;

@Entity
@Table(name = "clients")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;

    @Column(name = "name")
    protected String name;

    @Column(name = "nr_of_rides")
    protected int nr_of_rides;

    @Column(name = "money")
    protected double money;

    @Column(name = "rating")
    protected int rating;

    @Column(name = "nr_of_reviews")
    protected int nr_of_reviews;

    public Client(){

    }

    public Client(long id, String name, int nr_of_rides, double money, int rating, int nr_of_reviews) {
        this.id = id;
        this.name = name;
        this.nr_of_rides = nr_of_rides;
        this.money = money;
        this.rating = rating;
        this.nr_of_reviews = nr_of_reviews;
    }

    public Client(String name, int nr_of_rides, double money, int rating, int nr_of_reviews) {
        this.name = name;
        this.nr_of_rides = nr_of_rides;
        this.money = money;
        this.rating = rating;
        this.nr_of_reviews = nr_of_reviews;
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

    public int getNr_of_rides() {
        return nr_of_rides;
    }

    public void setNr_of_rides(int nr_of_rides) {
        this.nr_of_rides = nr_of_rides;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getNr_of_reviews() {
        return nr_of_reviews;
    }

    public void setNr_of_reviews(int nr_of_reviews) {
        this.nr_of_reviews = nr_of_reviews;
    }
}
