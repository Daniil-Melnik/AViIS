package Etu.cpu;

import java.util.ArrayList;

import Etu.commands.Decoder;
import Etu.intructions.IntMemory;
import Etu.memory.Memory;
import Etu.memory.registers.Register32;

public class CPU {
    public static final int INT_REGS_COUNT = 16;
    public static final int FLOAT_REGS_COUNT = 16;

    private Memory memory;
    private ArrayList<Register32> intRegs;
    private ArrayList<Register32> floatRegs;
    private Decoder dc = new Decoder();
    private IntMemory iMem = new IntMemory();

    public CPU(Memory mem){
        memory = mem;
        intRegs = new ArrayList<>();
        floatRegs = new ArrayList<>();
        for (int i = 0; i < INT_REGS_COUNT; i ++) intRegs.add(new Register32());
        for (int i = 0; i < FLOAT_REGS_COUNT; i ++) floatRegs.add(new Register32());
    }

    public void step(){
        Register32 regCom;
        regCom = getCommand();
        int [] params = dc.decodeCommand(regCom);
        if (params[0] >= 43 && params[0] <= 56){
            Register32 [] toSend = {intRegs.get(params[1])};
            intRegs.set(params[1], iMem.execute(params[0], toSend, params[3]));
        }
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

    public void showRegisters(){
        for (int i = 0; i < INT_REGS_COUNT; i++){
            System.out.println();
            intRegs.get(i).showRegister();
        }
    }
}
