package Etu.intructions;

public enum Stream {
    BEQ("0111001"),
    BNE("0111010"),
    BGE("0111011"),
    BGEU("0111100"),
    BLT("0111101"),
    BLTU("0111110"),
    JAL("0111111"),
    JALR("1000000"),
    INT("1000001"),
    IRET("1000010"),
    CLI("1000011"),
    STI("1000100"),
    JMR("1000101"),
    CALL("1000110"),
    RET("1000111");

    private final String description;

    Stream(String description) {
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
