package com.skillup;

import java.util.ArrayList;
import java.util.Arrays;

//TODO Ignore this Class


public class Cache {
    public static void main(String[] args) {
//        Wheels.addWheels(2,0);
//        Wheels wheels = new Wheels(true);
//        System.out.println(wheels.getPrice());
//        int x = 0;
//        if ((--x)<0) System.out.println(x);



         final ArrayList<String> availableShells = new ArrayList<>
                (Arrays.asList("SPORTS","SUV","CLASSIC","ATV","DUNE BUGGY","CRAWLERS","MILITARY","TRUCKS"));
        String i= "classic";
        if (availableShells.contains(i.toUpperCase())) System.out.print("Hello there mate");
    }
}
