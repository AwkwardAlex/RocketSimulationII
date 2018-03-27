import fuel_tanks.TankSet;
import utils.CompareSize;
import utils.UserInput;

public class Assembly  {

    boolean fits = false;
    UserInput input = new UserInput();
    CompareSize comparison = new CompareSize();

    public void prepareRocket() {
        input.getCabinInput();
        input.getEngineInput();
        comparison.fitTank();
        input.getNumberOfEngines();
        input.getDestInput();
    }

    public double fuelCapacity() {
        double totalFuel = TankSet.getId(UserInput.chosenTank).getCapacity() * UserInput.engineNumber;
        return totalFuel;
    }
}
