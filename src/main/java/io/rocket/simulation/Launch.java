package io.rocket.simulation;

import io.rocket.simulation.util.UserInput;
import io.rocket.simulation.locations.Destination;
import io.rocket.simulation.parts.EngineSet;

public class Launch implements Navigation{
    Rocket rocketX = new Rocket();
    public void launch() {
        rocketX.prepareRocket();
        if (Destination.getId(UserInput.chosenPlanet).getDistance() <= (rocketX.getFuelCapacity()
                / EngineSet.getId(UserInput.choseEngine).getFuelConsumption() * rocketX.getVelocity() * 12)) {
            System.out.println("You will reach your destination.");
            System.out.println("You will reach escape velocity in " +
                    (CosmicVelocity.ESCAPE_VELOCITY / rocketX.getVelocity() * 70) + " seconds.");
        } else {
            System.out.println("You will not reach your destination.");
        }
        System.out.println("Actual distance traveled: " + rocketX.getFuelCapacity()
                / EngineSet.getId(UserInput.choseEngine).getFuelConsumption() * rocketX.getVelocity() * 12);
    }
}
