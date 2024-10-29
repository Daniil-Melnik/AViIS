package Etu.cpu;

import Etu.memory.Memory;
import Etu.memory.registers.Register32;

public class CPU {
    private Memory memory;

    public CPU(Memory mem){
        memory = mem;
    }

    public void step(){
        getCommand();
    }

    public void getCommand(){
        Register32 comReg = memory.readCommandFromMemory();
        try {
            comReg.showRegister();
        } catch (Exception e) {
            System.out.println("Перелёт");
        }
        System.out.println();
    }
}
