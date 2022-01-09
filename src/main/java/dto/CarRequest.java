package dto;

import javax.persistence.*;


public class CarRequest {

    private String marca;
    private String model;
    private String culoare;
    private int an_fabricatie;

    public CarRequest(){

    }

    public CarRequest(String marca, String model, String culoare, int an_fabricatie) {
        this.marca = marca;
        this.model = model;
        this.culoare = culoare;
        this.an_fabricatie = an_fabricatie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public int getAn_fabricatie() {
        return an_fabricatie;
    }

    public void setAn_fabricatie(int an_fabricatie) {
        this.an_fabricatie = an_fabricatie;
    }
}
