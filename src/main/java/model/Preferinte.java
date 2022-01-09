package model;

public class Preferinte {

    private int id;
    private GenuriMuzicale muzica;
    private int temperatura;
    private boolean cursa_rapida;
    private boolean sandwich;
    private boolean apa;

    public Preferinte(){
        this.cursa_rapida = false;
        this.sandwich = false;
        this.apa = false;
    }

    public Preferinte(int id, GenuriMuzicale muzica, int temperatura, boolean cursa_rapida, boolean sandwich, boolean apa) {
        this.id = id;
        this.muzica = muzica;
        this.temperatura = temperatura;
        this.cursa_rapida = cursa_rapida;
        this.sandwich = sandwich;
        this.apa = apa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public GenuriMuzicale getMuzica() {
        return muzica;
    }

    public void setMuzica(GenuriMuzicale muzica) {
        this.muzica = muzica;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public boolean isCursa_rapida() {
        return cursa_rapida;
    }

    public void setCursa_rapida(boolean cursa_rapida) {
        this.cursa_rapida = cursa_rapida;
    }

    public boolean getSandwich() {
        return sandwich;
    }

    public void setSandwich(boolean sandwich) {
        this.sandwich = sandwich;
    }

    public boolean getApa() {
        return apa;
    }

    public void setApa(boolean apa) {
        this.apa = apa;
    }
}
