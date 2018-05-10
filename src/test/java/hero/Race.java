package hero;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum Race {
    RACE1("elf","description"),
    RACE2("human","description"),
    RACE3("dwarf","description");

    @Getter
    private String name;
    private String description;

}
