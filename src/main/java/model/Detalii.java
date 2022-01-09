package model;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.time.LocalTime;

public class Detalii {

    private Sofer sofer;
    private Client client;
    private Cursa cursa;
    private double pret;
    private Preferinte preferinte;

    public Detalii(){
        this.pret = get_ride_price();
    }

    public Detalii(Sofer sofer, Client client, Cursa cursa, Preferinte preferinte) {
        this.sofer = sofer;
        this.client = client;
        this.cursa = cursa;
        this.preferinte = preferinte;
        this.pret = get_ride_price();
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

    public Preferinte getPreferinte() {
        return preferinte;
    }

    public void setPreferinte(Preferinte preferinte) {
        this.preferinte = preferinte;
    }

    private double get_ride_price(){
        double pret = this.cursa.getDistanta() * 2;
        LocalTime now = LocalTime.now();

        if(now.getHour() >= 22 || now.getHour() <= 6){
            pret += pret/2;
        }

        if(this.preferinte.getSandwich())
            pret += 10;

        if(this.preferinte.getApa())
            pret += 5;

        return pret;
    }
}
