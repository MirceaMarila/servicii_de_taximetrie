package model;

public class Masina {

    private int id;
    private String marca;
    private String model;
    private String culoare;
    private int an_fabricatie;

    public Masina(){

    }

    public Masina(int id, String marca, String model, String culoare, int an_fabricatie) {
        this.id = id;
        this.marca = marca;
        this.model = model;
        this.culoare = culoare;
        this.an_fabricatie = an_fabricatie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
