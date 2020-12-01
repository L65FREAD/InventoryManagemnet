package com.skillup;

public class Wheels {

    private static int totalWheelsCount;
    private static int totalWideWheelsCount;
    private static int totalNormalWheelCount;

    private boolean isWide;
    private final int price;

    public Wheels(boolean isWide) {
        this.isWide = isWide;
        price = decrementWheels(isWide);
        if (price!=0){
            totalWheelsCount--;
        }
    }

    private int decrementWheels(boolean isWide){
        if (isWide){
            if(--totalWideWheelsCount<0){
                System.err.println("Not enough Wide Wheels.");
                totalWideWheelsCount++;
            }else return 200;
        }else {
            if(--totalNormalWheelCount<0){
                System.err.println("Not enough Wide Wheels.");
                totalNormalWheelCount++;
            }else return 100;
        }
        return 0;
    }

    public static void addWheels(int standardWheels, int wideWheels) {
        if (standardWheels>=0&&wideWheels>=0){
            totalNormalWheelCount+=standardWheels;
            totalWideWheelsCount+=wideWheels;
            totalWheelsCount+=(standardWheels+wideWheels);
        }
        else {
            System.err.println("Error, negative value not allowed");
        }
    }

    public int getPrice() {
        return price;
    }

    public static int getTotalWheelsCount() {
        return totalWheelsCount;
    }

    public static int getTotalWideWheelsCount() {
        return totalWideWheelsCount;
    }

    public static int getTotalNormalWheelCount() {
        return totalNormalWheelCount;
    }

    public boolean isWide() {
        return isWide;
    }
}
