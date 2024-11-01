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
    public String toString(){
        String str = Integer.toBinaryString(value);
        while (str.length() < 8){
            str = "0" + str;
        }
        return str;
    }
    
    public int getValue(){
        return value;
    }
}
