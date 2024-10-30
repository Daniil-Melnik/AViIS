package Etu.memory.registers;

import java.util.ArrayList;

import Etu.memory.cells.ByteCell;

public class Register32 {
    private byte NUMBER_BYTES = 4;
    private ArrayList<ByteCell> bytes;

    public Register32(ArrayList<ByteCell> list){
        bytes = list;
    }

    public Register32(){
        ArrayList<ByteCell> bcL = new ArrayList<>();
        for (int i = 0; i < 4; i++) bcL.add(new ByteCell());
        bytes = bcL;
    }

    public Register32(String str){
        bytes = new ArrayList<>();
        for (int i = 0; i < 4; i++){
            bytes.add(new ByteCell(Integer.parseInt(str.substring(i * 8, (i + 1) * 8),2)));
        }
    }

    public ArrayList<ByteCell> getBytes(){
        return bytes;
    }

    public Register32(int var){
        String str = toNBinaryStringM(Integer.toBinaryString(var));
        bytes = new ArrayList<>();
        for (int i = 0; i < 4; i++){
            bytes.add(new ByteCell(Integer.parseInt(str.substring(i * 8, (i + 1) * 8),2)));
        }
    }

    public int toIntValue(){
        String str = "";
        for (int i = 0; i < 4; i++){
            str += bytes.get(i).toString();
        }
        //System.out.println(str);
        return Integer.parseInt(str,2);
        //return 0;
    }

    public String toNBinaryStringM(String str){
        String res = str;
        while (res.length() < 32) {
            res = "0" + res;
        }
        return res;
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
