package hero;

import lombok.AllArgsConstructor;
import util.GameConstant;

import java.util.List;


@AllArgsConstructor
public class Team implements GameConstant{

    Team() throws IllegalStateException {
        throw new IllegalStateException("Can't create instance of TEAM");
    }

    public Team(List<Hero> listOfHeroes) {
        this.listOfHeroes = listOfHeroes;
    }

    public List<Hero> listOfHeroes;
    Hero hero1;
    Hero hero2;
    Hero hero3;
}
