package model;

public class Client {

    protected int id;
    protected String prenume;
    protected int nr_curse;
    protected double suma_cont_bancar;
    protected int rating;
    protected int nr_review;

    public Client(){

    }

    public Client(int id, String prenume, int nr_curse, double suma_cont_bancar, int rating, int nr_review) {
        this.id = id;
        this.prenume = prenume;
        this.nr_curse = nr_curse;
        this.suma_cont_bancar = suma_cont_bancar;
        this.rating = rating;
        this.nr_review = nr_review;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getNr_curse() {
        return nr_curse;
    }

    public void setNr_curse(int nr_curse) {
        this.nr_curse = nr_curse;
    }

    public double getSuma_cont_bancar() {
        return suma_cont_bancar;
    }

    public void setSuma_cont_bancar(double suma_cont_bancar) {
        this.suma_cont_bancar = suma_cont_bancar;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getNr_review() {
        return nr_review;
    }

    public void setNr_review(int nr_review) {
        this.nr_review = nr_review;
    }
}
