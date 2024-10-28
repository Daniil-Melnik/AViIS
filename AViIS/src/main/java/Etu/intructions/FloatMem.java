package Etu.intructions;

public enum FloatMem {
    FLW("0100101"),
    FSW("0100110"),
    FCVTSW("0100111"),
    FCVTWS("0101000"),
    FMOV("0101001"),
    FSWP("0101010");

    private final String description;

    FloatMem(String description) {
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
