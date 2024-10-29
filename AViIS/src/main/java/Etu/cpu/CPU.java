package Etu.cpu;

import Etu.commands.Decoder;
import Etu.memory.Memory;
import Etu.memory.registers.Register32;

public class CPU {
    private Memory memory;
    Decoder dc = new Decoder();

    public CPU(Memory mem){
        memory = mem;
    }

    public void step(){
        Register32 regCom;
        regCom = getCommand();
        dc.decodeCommand(regCom);
    }

    public Register32 getCommand(){
        Register32 comReg = memory.readCommandFromMemory();
        try {
            //comReg.showRegister();
        } catch (Exception e) {
            System.out.println("Перелёт");
        }
        //System.out.println();
        return comReg;
    }
}
