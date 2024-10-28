package Etu.intructions;

public enum IntLogic {
    AND("0010100"),
    OR("0010101"),
    XOR("0010110"),
    ANDI("0010111"),
    ORI("0011000"),
    XORI("0011001"),
    SLL("0011010"),
    SRL("0011011"),
    SRA("0011100"),
    SLLI("0011101"),
    SRLI("0011110"),
    SRAI("0011111"),
    NOT("0100000");

    private final String description;

    IntLogic(String description) {
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
