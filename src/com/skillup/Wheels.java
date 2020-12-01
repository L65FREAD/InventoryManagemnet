package com.skillup;

public class Wheels implements Purchasable {
    private boolean isWide;
    private final double price;

    public Wheels(boolean isWide, double price) {
        this.isWide = isWide;
        this.price = price;
    }

    public boolean isWide() {
        return isWide;
    }

    public double getPrice() {
        return price;
    }
}
