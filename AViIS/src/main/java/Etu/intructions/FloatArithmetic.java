package Etu.intructions;

public enum FloatArithmetic {
    FADD("0100001"),
    FSUB("0100010"),
    FDIV("0100011"),
    FMUL("0100100");

    private final String description;

    FloatArithmetic(String description) {
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
