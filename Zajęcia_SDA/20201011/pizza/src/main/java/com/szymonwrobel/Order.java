package com.szymonwrobel;

public class Order implements IOrder{

    private IPizza pizza;

    public Order(IPizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public void printOrder() {
        System.out.println("Twoje zamówienie: " + "pizza: " + pizza.getName() + "cena: " + pizza.getPrice());
    }
}
