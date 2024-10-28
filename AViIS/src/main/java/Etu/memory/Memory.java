package Etu.memory;

import java.util.ArrayList;

import Etu.memory.cells.ByteCell;
import Etu.memory.registers.Register32;

public class Memory {
    private static final int SIZE = 100;
    private ArrayList<ByteCell> bytes;
    private int cursor;

    public Memory(){
        bytes = new ArrayList<>();
        cursor = 0;
        for (int i = 0; i < SIZE; i++) bytes.add(new ByteCell());
    }

    public void updCursor(int n){
        cursor = cursor + n;
    }

    public void addCommandToMem(){

    }

    public void writeCommandToMemory(Register32 commandReg){
        replaceElements(bytes, cursor, commandReg.getBytes());
        cursor += 4;
    }

    public void showMemory(){
        ByteCell bc;
        for (int i = 0; i < 20; i++){
            if (i % 4 == 0) System.out.println();
            bc = bytes.get(i);
            System.out.print(bc.getStrValue() + " ");
        }
    }

    public void replaceElements(ArrayList<ByteCell> list, int startIndex, ArrayList<ByteCell> newElements) {
        // Проверяем, что индекс и размер списка позволяют выполнить замену
        if (startIndex < 0 || startIndex + newElements.size() > list.size()) {
            throw new IndexOutOfBoundsException("Неверный индекс для замены.");
        }
        
        // Заменяем элементы
        for (int i = 0; i < newElements.size(); i++) {
            list.set(startIndex + i, newElements.get(i));
        }
    }
}
