package rocket.util;

import rocket.locations.Destination;
import rocket.parts.CabinSet;
import rocket.parts.EngineSet;
import rocket.parts.TankSet;

public class UserInput {

    private boolean loopVar = true;
    public static int chosenCabin;
    public static int chosenTank;
    public static int choseEngine;
    public static int engineNumber;
    public static int chosenPlanet;

    public static UserInput userInput;

    public static UserInput getUserInput() {
        if (userInput == null) {
            userInput = new UserInput();
        }
        return userInput;
    }
    public void getCabinInput() {
        while (loopVar) {
            System.out.println("Please chose one of these cabin sets:");
            for (int x = 1; x < CabinSet.values().length + 1; x++) {
                CabinSet.getId(x).printStats(x);
            }
            String cabinInput = ScannerUtil.getString();
            for (int x = 1; x < CabinSet.values().length + 1; x++) {
                if (cabinInput.equalsIgnoreCase(CabinSet.getId(x).getName())) {
                    System.out.println("You have chosen: " + CabinSet.getId(x).getName());
                    chosenCabin = x;
                    loopVar = false;
                }
            }
            if (loopVar) {
                System.out.println("Command not recognized, please try again");
            }
        }
        loopVar = true;
    }
    public void getEngineInput() {
        while (loopVar) {
            System.out.println("Please chose one of these engine sets:");
            for (int x = 1; x < EngineSet.values().length + 1; x++) {
                EngineSet.getId(x).printStats(x);
            }
            String engineInput = ScannerUtil.getString();
            for (int y = 1; y < EngineSet.values().length + 1; y++) {
                if (engineInput.equalsIgnoreCase(EngineSet.getId(y).getName())) {
                    System.out.println("You have chosen: " + EngineSet.getId(y).getName());
                    choseEngine = y;
                    loopVar = false;
                }
            }
            if (loopVar) {
                System.out.println("Command not recognized, please try again");
            }
        }
        loopVar = true;
    }

    public void getNumberOfEngines() {
        while (loopVar) {
            System.out.println("Please enter number of engines: ");
            String num = ScannerUtil.getString();
            engineNumber = Integer.parseInt(num);
            if ((engineNumber >= 3) & (engineNumber <= 5)) {
                System.out.println("You have chosen to have: " + engineNumber + " engines.");
                loopVar = false;
            }
            if (loopVar) {
                System.out.println("Please enter valid number of engines, from 3 to 5");
            }
        }
        loopVar = true;
    }

    public void getTankInput() {
        while (loopVar) {
            System.out.println("Please chose one of these fuel tank sets:");
            for (int x = 1; x < TankSet.values().length + 1; x++) {
                TankSet.getId(x).printStats(x);
            }
            String tankInput = ScannerUtil.getString();
            for (int x = 1; x < TankSet.values().length + 1; x++) {
                if (tankInput.equalsIgnoreCase(TankSet.getId(x).getName())) {
                    System.out.println("You have chosen: " + TankSet.getId(x).getName());
                    chosenTank = x;
                    loopVar = false;
                }
            }
            if (loopVar) {
                System.out.println("Command not recognized, please try again");
            }
        }
        loopVar = true;
    }

    public void getDestInput() {
        while (loopVar) {
            System.out.println("Please chose your destination: ");
            for (int x = 1; x < Destination.values().length + 1; x++) {
                System.out.println(x + ". " + Destination.getId(x).getName());
            }
            String destInput = ScannerUtil.getString();
            for (int x = 1; x < Destination.values().length + 1; x++) {
                if (destInput.equalsIgnoreCase(Destination.getId(x).getName())) {
                    System.out.println("You have chosen: " + Destination.getId(x).getName() + " as your destination.");
                    chosenPlanet = x;
                    loopVar = false;
                }
            }
            if (loopVar) {
                System.out.println("Command not recognized, please try again");
            }
        }
        loopVar = true;
    }
}

