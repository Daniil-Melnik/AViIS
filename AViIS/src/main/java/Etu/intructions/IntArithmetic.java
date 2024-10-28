package Etu.intructions;

public enum IntArithmetic {
    ADD("0000001"),
    SUB("0000010"),
    ADDI("0000011"),
    SLT("0000100"),
    SLTI("0000101"),
    SLTU("0000110"),
    SLTIU("0000111"),
    AUIPC("0001000"),
    MUL("0001001"),
    MULH("0001010"),
    MULHSU("0001011"),
    MULHU("0001100"),
    DIV("0001101"),
    DIVU("0001110"),
    REM("0001111"),
    REMU("0010000"),
    RR("0010001"),
    RL("0010010"),
    NEG("0010011");

    private final String description;

    IntArithmetic(String description) {
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
