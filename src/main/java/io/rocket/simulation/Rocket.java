package io.rocket.simulation;

import io.rocket.simulation.parts.CabinSet;
import io.rocket.simulation.parts.EngineSet;
import io.rocket.simulation.parts.TankSet;
import io.rocket.simulation.util.UserInput;

public class Rocket {

    UserInput input = new UserInput();

    public void prepareRocket() {
        input.getCabinInput();
        input.getEngineInput();
        while (true) {
            input.getTankInput();
            if (TankSet.getId(UserInput.chosenTank).getVolume() > EngineSet.getId(UserInput.choseEngine).getTankSpace()) {
                System.out.println("Your fuel tank is bigger than tank space, please chose smaller fuel tank.");
            } else {
                break;
            }
        }
        input.getNumberOfEngines();
        input.getDestInput();
    }

    public double getFuelCapacity() {
        return TankSet.getId(UserInput.chosenTank).getCapacity() * UserInput.engineNumber;
    }

    public int getWeight() {
        return CabinSet.getId(UserInput.chosenCabin).getWeight() +
                (UserInput.engineNumber * (TankSet.getId(UserInput.chosenTank).getWeight()
                + EngineSet.getId(UserInput.choseEngine).getWeight()));
    }

    public int getVelocity(){
        return getWeight() / (EngineSet.getId(UserInput.choseEngine).getPower() * UserInput.engineNumber);
    }
}
