package Etu.commands;

import Etu.memory.registers.Register32;

public class Decoder {
    public int [] decodeCommand(Register32 regCom){
        String regStr = regCom.toString();
        String opCode = regStr.substring(0,7);
        System.out.println(opCode);
        return null;
    }
}
