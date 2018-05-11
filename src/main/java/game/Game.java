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
        addPointsForCharachter();
    }

    private Hero createHero() {
        Race race = chooseRace();
        RaceSpeciality raceSpeciality = chooseRaceSpeciality(race);
        Hero hero = new Hero(race,raceSpeciality);
        Messages.chooseHeroName();
        hero.setName(Reader.getString());
        return hero;
    }

    private Race chooseRace() {
        Messages.chooseRacemsg();
        userInput = Reader.getString();
        System.out.println("You chose "+Race.valueOf("RACE"+userInput).getName().toUpperCase());
        return Race.valueOf("RACE"+userInput);
    }

    private RaceSpeciality chooseRaceSpeciality(Race race) {
        Messages.chooseSpecialityOfRace(race);
        userInput = Reader.getString();
        String raceName = race.getName().toUpperCase();
        return RaceSpeciality.valueOf(raceName+"_S"+userInput);
    }

    private void addPointsForCharachter() {
        Messages.addPointsToCharachter();

    }
}
