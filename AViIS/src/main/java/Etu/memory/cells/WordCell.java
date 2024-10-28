package Etu.memory.cells;

public class WordCell {
    private int value;

    public WordCell(int val){
        value = val;
    }

    public WordCell(){
        this(0);
    }

    public int getValue(){
        return value;
    }
}
