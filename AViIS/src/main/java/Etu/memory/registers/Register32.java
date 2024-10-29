package Etu.memory.registers;

import java.util.ArrayList;

import Etu.memory.cells.ByteCell;

public class Register32 {
    private byte NUMBER_BYTES = 4;
    private ArrayList<ByteCell> bytes;

    public Register32(ArrayList<ByteCell> list){
        bytes = list;
    }

    public ArrayList<ByteCell> getBytes(){
        return bytes;
    }

    public String toNBinaryString(String str){
        String res = str;
        while (res.length() < 8) {
            res = "0" + res;
        }
        return res;
    }

    @Override
    public String toString() {
        String res = "";
        for (int i = 0; i < NUMBER_BYTES; i++){
            res += toNBinaryString(Integer.toBinaryString(bytes.get(i).getValue()));
        }
        return res;
    }

    public ByteCell getCell(int n){
        return (bytes.get(n));
    }

    public void showRegister(){
        for (int i = 0; i < NUMBER_BYTES; i++){
            System.out.print(toNBinaryString(Integer.toBinaryString(bytes.get(i).getValue())) + " ");
        }
    }
}
