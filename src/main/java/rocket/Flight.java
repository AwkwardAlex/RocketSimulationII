package rocket;

import rocket.util.ScannerUtil;

public final class Flight {

    public void flightStatus() {
        RocketX rocketX = new RocketX();
        while (true) {
            rocketX.launch();
            System.out.println("Press 1 if you want to construct new rocket\nOr press 0 to exit the program.");
            String userChoice = ScannerUtil.getString();
            if (userChoice.equals("1")) {
            } else if (userChoice.equals("0")) {
                System.out.println("Exiting program, farewell!");
                break;
            } else {
                System.out.println("Input not recognized, try again.");
            }
        }
    }
}
