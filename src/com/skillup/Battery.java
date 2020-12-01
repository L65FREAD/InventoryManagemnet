package com.skillup;

public class Battery implements Purchasable{
    private int capacity;

    public Battery( int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

}
