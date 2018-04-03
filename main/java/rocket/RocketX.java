package rocket;

import rocket.util.UserInput;
import rocket.locations.Destination;
import rocket.parts.EngineSet;

public class RocketX extends Rocket implements Navigation{

    public void launch() {
        getRocket();
        if (Destination.getId(UserInput.chosenPlanet).getDistance() <= (getFuelCapacity()
                / EngineSet.getId(UserInput.choseEngine).getFuelConsumption() * getVelocity() * 12)) {
            System.out.println("You will reach your destination.");
            System.out.println("You will reach escape velocity in " +
                    (CosmicVelocity.ESCAPE_VELOCITY / getVelocity() * 120) + " seconds.");
        } else {
            System.out.println("You will not reach your destination.");
        }
        System.out.println("Actual distance traveled: " + getFuelCapacity()
                / EngineSet.getId(UserInput.choseEngine).getFuelConsumption() * getVelocity() * 12);
    }
}