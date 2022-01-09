package model;

public class Driver extends  Client{

    private Car car;

    public Driver(){

    }

    public Driver(int id, String name, Car car, int nr_of_rides, int rating, int nr_of_reviews, double money) {
        super(id, name, nr_of_rides, money, rating, nr_of_reviews);
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

}
