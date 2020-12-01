package com.skillup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class BodyShell {

    private static HashMap<String,Integer> bodyShellCount = new HashMap<>();

    private int totalBodyShellCount;

    private static final ArrayList<String> availableShells = new ArrayList<>
            (Arrays.asList("SPORTS","SUV","CLASSIC","ATV","DUNE BUGGY","CRAWLERS","MILITARY","TRUCKS"));

    private final int price;
    private String bodyShellType;

    public BodyShell(String bodyShellType) {
        this.bodyShellType = bodyShellType;
        validateBodyShell(bodyShellType);
        initializeHashMap();

        price =0;
    }

     private void initializeHashMap() {
         for (String i : availableShells) {
             bodyShellCount.put(i, 0);
         }
    }

    public static void addBodyShell(String bodyShellType){

    }
    public boolean validateBodyShell(String bodyShellType){
        if (availableShells.contains(bodyShellType.toUpperCase())){
            return true;
        }
        return false;
    }
}
