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

    }

    private int decrementWheels(boolean isWide){
        if (isWide){
            try {
                totalWideWheelsCount--;
            } catch (ArithmeticException e){
                System.out.println("Not enough wheels in the inventory!");
            }finally {
                totalWheelsCount--;
                return 300;
            }
        }else {
            try {
                totalNormalWheelCount--;
            } catch (ArithmeticException e){
                System.out.println("Not enough wheels in the inventory!");
            }finally {
                totalWheelsCount--;
                return 200;
            }
        }
    }

    public static void setWheelsCount(int totalWheelsCount, boolean isWide) {
        Wheels.totalWheelsCount = totalWheelsCount;
        if (isWide){
            totalWideWheelsCount++;
        }else {
            totalNormalWheelCount++;
        }
    }
}
