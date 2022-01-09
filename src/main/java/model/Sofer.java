package model;

public class Sofer extends  Client{

    private Masina masina;

    public Sofer(){

    }

    public Sofer(int id, String prenume, Masina masina, int nr_curse, int rating, int nr_review, double suma_cont_bancar) {
        super(id, prenume, nr_curse, suma_cont_bancar, rating, nr_review);
        this.masina = masina;
    }

    public Masina getMasina() {
        return masina;
    }

    public void setMasina(Masina masina) {
        this.masina = masina;
    }

}
