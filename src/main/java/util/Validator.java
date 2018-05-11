package util;

public class Validator {
    private Validator() throws IllegalStateException{
        throw new IllegalStateException("Can't create instance of Validator");
    }

    private static int getNumber(String s, int min, int max) {
        System.out.println(s);
        String input;
        while(true) {
            input = Reader.getString();
            if(input.matches("\\d")) {
                int inputNumber = Integer.parseInt(input);
                if(inputNumber >= min && inputNumber <= max)
                    return inputNumber;
            }
            System.out.println("Invalid input, try to put numbers from "+min+" to "+max);
        }
    }
}
