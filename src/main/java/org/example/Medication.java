package org.example;

public class Medication {
    private String name;
    private int price;
    private boolean getAvaliability;
    public Medication(String name, int price, boolean getAvaliability) {
        this.name = name;
        this.price = price;
        this.getAvaliability = getAvaliability;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public boolean getGetAvaliability() {
        return getAvaliability;
    }
}
