package com.szymonwrobel;

public class TastyPizza implements IPizza {

    private String name;
    private int price;

    public TastyPizza(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

}
