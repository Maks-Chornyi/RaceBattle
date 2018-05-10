package hero;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor

public enum RaceSpeciality {
    ELF_S1("mage","description"),
    ELF_S2("gunslinger","description"),
    HUMAN_S1("priest","description"),
    HUMAN_S2("paladin","description"),
    DWARF_S1("warrior","description"),
    DWARF_S2("mechanist","description");

    @Getter
    private String name;
    private String desctiption;




}
