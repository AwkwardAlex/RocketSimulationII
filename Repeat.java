import utils.ScannerUtil;

public final class Repeat {
    public void andEver() {
        Launch launchRocket = new Launch();
        launchRocket.launch();
        while (true) {
            System.out.println("Press 1 if you want to construct new rocket\n Or press 0 to exit the program");
            int userChoice = ScannerUtil.getInt();
            if (userChoice == 1) {
                launchRocket = new Launch();
                launchRocket.launch();
            } else if (userChoice == 0) {
                System.out.println("Exiting program, farewell!");
                break;
            } else {
                System.out.println("Input not recognized, try again.");
            }
        }
    }
}
