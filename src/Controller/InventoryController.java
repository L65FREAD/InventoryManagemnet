package Controller;

import Model.*;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class InventoryController {
    ArrayList<String> availableParts = new ArrayList<>(Arrays
            .asList("Battery","Motor","BodyShell","Shocks","Wheels","RemoteController","Charger"));
    ArrayList<Battery> batteries = new ArrayList<>();
    ArrayList<Motor> motors = new ArrayList<>();
    ArrayList<BodyShell> bodyShells = new ArrayList<>();
    ArrayList<Shocks> shocks = new ArrayList<>();
    ArrayList<Wheels> wheels = new ArrayList<>();
    ArrayList<RemoteController> remoteControllers = new ArrayList<>();
    ArrayList<Charger> chargers = new ArrayList<>();
//
//    Map<String, ArrayList> arrayListOfParts=
//            Map.of("Battery",batteries,"Motor",motors,
//                    "BodyShell",bodyShells,"Shocks",shocks, "Wheels",wheels
//                    ,"RemoteController",remoteControllers,"Chargers",chargers);

    public boolean addBatteries(int count){
        if (count>0) {
            for (int i = 0; i < count; i++) {
                Battery battery = new Battery();
                batteries.add(battery);
            }
            return true;
        }
        return false;
    }

    public boolean addMotors(int count){
        if (count>0) {
            for (int i = 0; i < count; i++) {
                Motor motor = new Motor();
                motors.add(motor);
            }
            return true;
        }
        return false;
    }

//    public boolean add(String itemName, int count){
//        for(String part : availableParts){
//            if (part.equals(itemName)){;
//                switch (itemName){
//                    case "Battery":
//                        addBatteries(count);
//                        break;
//                    case "Motor":
//                        addBatteries(count);
//                        break;
//                    case "BodyShell":
//                        addBatteries(count);
//                        break;
//                    case "Shocks":
//                        addShocks(count);
//                        break;
//                    case "Wheels":
//                        addWheels(count);
//                        break;
//                    case "RemoteController":
//                        addRemoteControllers(count);
//                        break;
//                    case "Chargers":
//                        addChargers(count);
//                        break;
//                }
//            }
//        }
//        return false;
//    }

    public boolean addRemoteControllers(int count){
        if (count>0) {
            for (int i = 0; i < count; i++) {
                RemoteController remoteController = new RemoteController();
                remoteControllers.add(remoteController);
            }
            return true;
        }
        return false;
    }

    public boolean addBodyShell(int count,String bodyShellType,double price){
        if (count>0) {
            for (int i = 0; i < count; i++) {
                BodyShell bodyShell = new BodyShell(bodyShellType,price);
                bodyShells.add(bodyShell);
            }
            return true;
        }
        return false;
    }

    public boolean addBodyShell(int count,String bodyShellType){
        return addBodyShell(count,bodyShellType,0);

    }

    public boolean addShocks(int count){
        if (count>0) {
            for (int i = 0; i < count; i++) {
                Shocks shocks = new Shocks();
                this.shocks.add(shocks);
            }
            return true;
        }
        return false;
    }

    public boolean addWheels(int count, boolean isWide, double price){
        if (count>0) {
            for (int i = 0; i < count; i++) {
                Wheels wheel = new Wheels(isWide,price);
                wheels.add(wheel);
            }
            return true;
        }
        return false;
    }

    public boolean addWheels(int count, boolean isWide){
        return addWheels(count,isWide,0);

    }

    public boolean addChargers(int count){
        if (count>0) {
            for (int i = 0; i < count; i++) {
                Charger charger = new Charger();
                chargers.add(charger);
            }
            return true;
        }
        return false;
    }

    public int getBatteryCount() {
        return batteries.size();
    }

    public int getMotorsCount() {
        return motors.size();
    }

    public int getBodyShellsCount() {
        return bodyShells.size();
    }

    public int getShocksCount() {
        return shocks.size();
    }

    public int getWheelsCount() {
        return wheels.size();
    }

    public int getRemoteControllerCount() {
        return remoteControllers.size();
    }

    public int getChargersCount() {
        return chargers.size();
    }

    public Battery getBattery(){
        if (getBatteryCount()!=0){
            Battery battery = batteries.get(0);
            batteries.remove(battery);
            return battery;
        }
        return null;
    }

    
}
