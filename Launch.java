import locations.Destination;
import utils.UserInput;
import engines.EngineSet;

public class Launch implements Navigation{
    Assembly rocketX = new Assembly();
    public void launch() {
        rocketX.prepareRocket();
        if (Destination.getId(UserInput.chosenPlanet).getDistance() < (rocketX.fuelCapacity()
                / EngineSet.getId(UserInput.choseEngine).getFuelConsumption() * 30)) {
            System.out.println("You will reach your destination.");
        } else {
            System.out.println("You will not reach your destination.");
        }
        System.out.println("Actual distance traveled: " + rocketX.fuelCapacity()
                / EngineSet.getId(UserInput.choseEngine).getFuelConsumption() * 30);
    }
}
