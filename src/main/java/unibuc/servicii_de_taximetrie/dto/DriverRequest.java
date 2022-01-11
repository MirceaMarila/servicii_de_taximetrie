package unibuc.servicii_de_taximetrie.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class DriverRequest {

    @NotNull
    private CarRequest car;

    @NotEmpty
    private String name;

    @NotNull
    @Min(0)
    private double money;

    public DriverRequest(){

    }

    public DriverRequest(CarRequest car, String name, double money) {
        this.car = car;
        this.name = name;
        this.money = money;
    }

    public CarRequest getCar() {
        return car;
    }

    public void setCar(CarRequest car) {
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String get_car_details(){
        return this.getCar().getBrandModel() + ", " + this.getCar().getYear() + ", " + this.getCar().getColor() + ", " + this.getCar().getPlate();
    }
}
