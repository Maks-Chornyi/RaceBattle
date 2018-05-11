package util;

import hero.Race;
import hero.RaceSpeciality;

public class Messages {

    public static void greetingMessage() {
        System.out.println("First message to greeting damn player5");
    }

    public static void chooseRacemsg() {
        System.out.println("Choose the number of race you want\n1 [Elf]\t 2 [Human]\t 3 [Dwarf]");
    }

    public static void chooseSpecialityOfRace(Race race) {
        System.out.println("\nNow choose special kind of your "+race.getName());
        String firstSpeciality = RaceSpeciality.valueOf(race.getName().toUpperCase()+"_S1").getName();
        String secondSpeciality = RaceSpeciality.valueOf(race.getName().toUpperCase()+"_S2").getName();
        System.out.println("1 ["+firstSpeciality+"]\t2 ["+secondSpeciality+"]");
    }
}
