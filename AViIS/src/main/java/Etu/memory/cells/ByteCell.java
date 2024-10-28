package Etu.memory.cells;

public class ByteCell {
    private int value;

    public ByteCell(int val){
        value = val;
    }

    public ByteCell(){
        this((byte) 0);
    }

    public String getStrValue(){
        String binaString = Integer.toBinaryString(value);
        while (binaString.length() < 8){
            binaString = "0" + binaString;
        }
        return binaString;
        // return (value + "");
    }

    public int getValue(){
        return value;
    }
}
