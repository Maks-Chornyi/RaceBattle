package hero;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum Race implements RaceStartParameter {
    RACE1("elf", "description", new int [] {elfCharisma,elfStamina,elfIntellect,elfAgility,elfConcentration}),
    RACE2("human","description", new int [] {humanCharisma,humanStamina,humanIntellect,humanAgility,humanConcentration}),
    RACE3("dwarf","description", new int [] {dwarfCharisma,dwarfStamina,dwarfIntellect,dwarfAgility,dwardConcentration});

    @Getter
    private String name;
    private String description;
    public int [] raceParameters;
    public static final String [] raceParametersNames = {"Charisma","Stamina","Intellect","Agility","Concentration"};
}
