package game;

import hero.Hero;
import hero.Race;
import hero.RaceSpeciality;
import hero.Team;
import util.Messages;
import util.Reader;

public class Game {
    private Team team;
    private String userInput;

    public void start() {
        Messages.greetingMessage();
        Messages.chooseRace();
        team = new Team(createHero(),createHero(),createHero());

    }

    private Hero createHero() {
        Race race = chooseRace();
        RaceSpeciality raceSpeciality = chooseRaceSpeciality(race);
        return new Hero(race,raceSpeciality);

    }

    private Race chooseRace() {
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
