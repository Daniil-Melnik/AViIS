package Etu.memory.cells;

public class ByteCell {
    private byte value;

    public ByteCell(byte val){
        value = val;
    }

    public ByteCell(){
        this((byte) 0);
    }

    public int getValue(){
        return value;
    }
}
