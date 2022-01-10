package unibuc.servicii_de_taximetrie.dto;


import unibuc.servicii_de_taximetrie.model.CarColors;

public class CarRequest {

    private String brandModel;
    private String plate;
    private CarColors color;
    private int year;

    public CarRequest(){

    }

    public CarRequest(String brandModel, String plate, CarColors color, int year) {
        this.brandModel = brandModel;
        this.plate = plate;
        this.color = color;
        this.year = year;
    }

    public String getBrandModel() {
        return brandModel;
    }

    public void setBrandModel(String brandModel) {
        this.brandModel = brandModel;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public CarColors getColor() {
        return color;
    }

    public void setColor(CarColors color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
