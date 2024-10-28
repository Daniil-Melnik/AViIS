package Etu.memory;

import java.util.ArrayList;

import Etu.memory.cells.ByteCell;

public class Memory {
    private static final int SIZE = 100;
    private ArrayList<ByteCell> bytes;

    public Memory(){
        bytes = new ArrayList<>();
        for (int i = 0; i < SIZE; i++) bytes.add(new ByteCell());
    }
}
