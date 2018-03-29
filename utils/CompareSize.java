package main.java.utils;

import engines.EngineSet;
import fuel_tanks.TankSet;

public class CompareSize {

    UserInput input = new UserInput();

    boolean fits = false;
    public void fitTank() {
        while (fits == false) {
            input.getTankInput();
            if (TankSet.getId(UserInput.chosenTank).getVolume() > EngineSet.getId(UserInput.choseEngine).getTankSpace()) {
                System.out.println("Your fuel tank is bigger than tank space, please chose smaller fuel tank.");
            } else {
                fits = true;
            }
        }
    }
}
