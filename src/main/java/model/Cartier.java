package model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Cartier {

    private int id;
    private String cartier;

    public Cartier() {
    }

    public Cartier(int id, String cartier) {
        this.id = id;
        this.cartier = cartier;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCartier() {
        return cartier;
    }

    public void setCartier(String cartier) {
        this.cartier = cartier;
    }
}
