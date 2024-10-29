package Etu.intructions;

import Etu.memory.registers.Register32;

public class IntMemory {
    public Register32 execute(int opCode, Register32 [] reg, int cnst){
        String str;
        switch (opCode) {
            case 52:
                str = Integer.toBinaryString(cnst);
                reg[0] = new Register32(toNBiinaryStr(str));
                break;
        
            default:
                break;
        }
        return reg[0];
    }

    private String toNBiinaryStr(String str){
        while (str.length() < 32){
            str = "0" + str;
        }
        return str;
    }
}
