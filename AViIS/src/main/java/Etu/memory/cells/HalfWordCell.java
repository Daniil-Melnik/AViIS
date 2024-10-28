package Etu.memory.cells;

public class HalfWordCell {
    private short value;

    public HalfWordCell(short val){
        value = val;
    }

    public HalfWordCell(){
        this((short)0);
    }

    public int getValue(){
        return value;
    }
}
