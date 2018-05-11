package game;

import hero.*;
import util.GameConstant;
import util.Messages;
import util.Reader;

import java.util.ArrayList;
import java.util.List;

public class Game implements RaceStartParameter, GameConstant{
    private Team team;
    private String userInput;

    public void start() {
        Messages.greetingMessage();
        team = new Team(getHeroesList());
        addPointsForCharacter();
    }

    private List<Hero> getHeroesList() {
        List<Hero> heroesList = new ArrayList<Hero>();
        for(int i = 0; i < NUMBER_OF_PLAYERS; i++)
            heroesList.add(createHero());
        System.out.println("Your team looks like this:\n" +
                "");
        return heroesList;
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

    private void addPointsForCharacter() {
        Messages.addPointsToCharacter();
        showMyTeam();
    }

    private void showMyTeam() {
        System.out.println("Your team looks like this:\n" +
                "\t\t\tFirst Hero:"+
                "\t\tName: "+ team.listOfHeroes.get(0).getName()+
                "\t\tRace: "+team.listOfHeroes.get(0).getRace().getName().toUpperCase()+
                "\t\tSpeciality: "+team.listOfHeroes.get(0).getRaceSpeciality().getName().toUpperCase());
    }
}
