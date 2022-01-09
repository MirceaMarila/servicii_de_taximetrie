package model;

import org.hibernate.criterion.DetachedCriteria;

import java.time.LocalTime;

public class Detalii {

    private Sofer sofer;
    private Client client;
    private Cursa cursa;
    private double pret;
    private String muzica;
    private int temperatura;
    private boolean cursa_rapida;

    public Detalii(){
        this.pret = get_ride_price();
    }

    public Detalii(Sofer sofer, Client client, Cursa cursa, String muzica, int temperatura, boolean cursa_rapida) {
        this.sofer = sofer;
        this.client = client;
        this.cursa = cursa;
        this.pret = get_ride_price();
        this.muzica = muzica;
        this.temperatura = temperatura;
        this.cursa_rapida = cursa_rapida;
    }

    public Sofer getSofer() {
        return sofer;
    }

    public void setSofer(Sofer sofer) {
        this.sofer = sofer;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Cursa getCursa() {
        return cursa;
    }

    public void setCursa(Cursa cursa) {
        this.cursa = cursa;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public String getMuzica() {
        return muzica;
    }

    public void setMuzica(String muzica) {
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

    private double get_ride_price(){
        double pret = this.cursa.getDistanta() * 2;
        LocalTime now = LocalTime.now();

        if(now.getHour() >= 22 || now.getHour() <= 6){
            pret += pret/2;
        }

        return pret;
    }
}
