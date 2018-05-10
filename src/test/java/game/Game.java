package game;

import hero.*;
import util.Messages;
import util.Reader;

public class Game implements RaceStartParameter{
    private Team team;
    private String userInput;

    public void start() {
        Messages.greetingMessage();
        team = new Team(createHero(),createHero(),createHero());

    }

    private Hero createHero() {
        Race race = chooseRace();
        RaceSpeciality raceSpeciality = chooseRaceSpeciality(race);
        return new Hero(race,raceSpeciality);

    }

    private Race chooseRace() {
        Messages.chooseRacemsg();
        userInput = Reader.getString();
        System.out.println("You chose "+Race.valueOf("RACE"+userInput).getName());
        return Race.valueOf("RACE"+userInput);
    }

    private RaceSpeciality chooseRaceSpeciality(Race race) {
        Messages.chooseSpecialityOfRace(race);
        userInput = Reader.getString();
        String raceName = race.getName().toUpperCase();
        return RaceSpeciality.valueOf(raceName+"_S"+userInput);
    }
}
