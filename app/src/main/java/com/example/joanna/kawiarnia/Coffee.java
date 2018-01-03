package com.example.joanna.kawiarnia;

/**
 * Created by Joanna on 2018-01-03.
 */

public class Coffee {

    private String name;



    private int price;

    public Coffee(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
