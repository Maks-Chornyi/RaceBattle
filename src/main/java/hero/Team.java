package hero;

import lombok.AllArgsConstructor;
import util.GameConstant;


@AllArgsConstructor
public class Team implements GameConstant{

    Team() throws IllegalStateException {
        throw new IllegalStateException("Can't create instance of TEAM");
    }

    //List<Hero> listOfHeroes = new ArrayList<>();
    Hero hero1;
    Hero hero2;
    Hero hero3;
}
