package Etu.memory;

import java.util.ArrayList;

import Etu.memory.cells.ByteCell;
import Etu.memory.registers.Register32;

public class Memory {
    private static final int SIZE = 100;
    private ArrayList<ByteCell> bytes;
    private int cursor1;
    private int cursor2;
    private int cursor3;

    public Memory(){
        bytes = new ArrayList<>();
        cursor1 = 0;
        cursor2 = 0;
        cursor3 = 0;
        for (int i = 0; i < SIZE; i++) bytes.add(new ByteCell());
    }

    public void updCursor2(int n){
        cursor2 = cursor2 + n;
    }

    public void updCursor3(int n){
        cursor3 = cursor3 + n;
    }

    public void writeCommandToMemory(Register32 commandReg){
        replaceElements(bytes, cursor2, commandReg.getBytes());
        cursor2 += 4;
    }

    public void writeWordToMemory(Register32 word, int cursor3){
        replaceElements(bytes, cursor3, word.getBytes());
    }

    public Register32 readCommandFromMemory(){
        ArrayList<ByteCell> bcL = new ArrayList<>();
        Register32 res = null;
        if (cursor2 > cursor1 || (cursor2 == 0)){
            bcL.add(bytes.get(cursor1));
            bcL.add(bytes.get(cursor1 + 1));
            bcL.add(bytes.get(cursor1 + 2));
            bcL.add(bytes.get(cursor1 + 3));

            cursor1 += 4;
            res = new Register32(bcL);
        }

        return res;
    }

    public void showMemory(){
        ByteCell bc;
        for (int i = 0; i < 28; i++){
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
