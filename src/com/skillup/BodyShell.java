package com.skillup;

public class BodyShell implements Purchasable{
    private String bodyShellType;
    private final double price;

    public BodyShell(String bodyShellType, double price) {
        this.bodyShellType = bodyShellType;
        this.price = price;
    }

    public String getBodyShellType() {
        return bodyShellType;
    }

    public double getPrice() {
        return price;
    }
}
