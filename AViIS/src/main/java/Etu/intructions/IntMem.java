package Etu.intructions;

public enum IntMem {
    LUI("0101011"),
    LW("0101100"),
    LH("0101101"),
    LB("0101110"),
    LHU("0101111"),
    LBU("0110000"),
    SW("0110001"),
    SH("0110010"),
    SB("0110011"),
    LI("0110100"),
    MOV("0110101"),
    IN("0110110"),
    OUT("0110111"),
    SWP("0111000");

    private final String description;

    IntMem(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return description;
    }
}
