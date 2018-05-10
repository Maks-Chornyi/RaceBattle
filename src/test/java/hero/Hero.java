package hero;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import util.GameConstant;

import java.util.Random;


//@AllArgsConstructor
@RequiredArgsConstructor
@ToString
@Getter
public class Hero implements GameConstant{
    private Race race;
    private RaceSpeciality raceSpeciality;
    private boolean isLeader;
    private int damage = new Random().nextInt(100);
    private int health = 100;
    private int maxHealth;
    private int mana = 100;
    private int level = START_LEVEL;

    public Hero(Race race, RaceSpeciality raceSpeciality){
        this.race = race;
        this.raceSpeciality = raceSpeciality;
        System.out.println("Created "+race.getName()+" "+raceSpeciality.getName());
    }


}
