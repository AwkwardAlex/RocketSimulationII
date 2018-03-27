import fuel.tanks.TankSet;
import engines.EngineSet;
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
    }
}
