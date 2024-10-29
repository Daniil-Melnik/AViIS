package Etu.intructions;

public enum OpCodes {
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
    NEG("0010011"),
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
    NOT("0100000"),
    FADD("0100001"),
    FSUB("0100010"),
    FDIV("0100011"),
    FMUL("0100100"),
    FLW("0100101"),
    FSW("0100110"),
    FCVTSW("0100111"),
    FCVTWS("0101000"),
    FMOV("0101001"),
    FSWP("0101010"),
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
    SWP("0111000"),
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
    RET("1000111"),
    NOP("1001000"),
    SF("1001001"),
    CF("1001010");

    private final String description;

    OpCodes(String description) {
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
