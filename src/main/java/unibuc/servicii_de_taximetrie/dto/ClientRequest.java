package unibuc.servicii_de_taximetrie.dto;

import org.hibernate.validator.constraints.NotBlank;

public class ClientRequest {

    @NotBlank
    protected String name;
    protected double money;

    public ClientRequest(){

    }

    public ClientRequest(String name, double money) {
        this.name = name;
        this.money = money;
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

}
