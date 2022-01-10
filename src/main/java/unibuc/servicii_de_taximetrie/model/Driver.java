package unibuc.servicii_de_taximetrie.model;


import javax.persistence.*;

@Entity
@Table(name = "drivers")
public class Driver extends  Client{

    @Column(name = "car_details")
    private String carDetails;

    public Driver(){

    }

    public Driver(long id, String name, String carDetails, int nr_of_rides, int rating, int nr_of_reviews, double money) {
        super(id, name, nr_of_rides, money, rating, nr_of_reviews);
        this.carDetails = carDetails;
    }

    public Driver(String name, String carDetails, int nr_of_rides, int rating, int nr_of_reviews, double money) {
        super(name, nr_of_rides, money, rating, nr_of_reviews);
        this.carDetails = carDetails;
    }

    public String getCarDetails() {
        return carDetails;
    }

    public void setCarDetails(String car_details) {
        this.carDetails = car_details;
    }

}
