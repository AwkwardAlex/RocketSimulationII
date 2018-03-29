package utils;
import java.util.Scanner;

public class ScannerUtil {
    private static Scanner scanner;

    private ScannerUtil() {
    }

    private static Scanner getScanner() {
        if (scanner == null) {
            scanner = new Scanner(System.in);
        }
        return scanner;
    }

    public static String getString() {
        return getScanner().nextLine();
    }

    public static int getInt() {
        return getScanner().nextInt();
    }
}
