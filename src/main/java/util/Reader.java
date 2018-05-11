package util;

import java.util.Scanner;

public final class Reader {
    private Reader() throws IllegalStateException{
        throw new IllegalStateException("Can't create instance of Reader");
    }
    private static Scanner sc;

    private static Scanner getScanner() {
        if(sc == null)
            sc = new Scanner(System.in);
        return sc;
    }

    public static String getString() {
        return getScanner().nextLine();
    }
}
