package Etu.cpu;

import java.util.ArrayList;

import Etu.commands.Decoder;
import Etu.intructions.IntArithmetic;
import Etu.intructions.IntLogic;
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
    private IntArithmetic iArit = new IntArithmetic();
    private IntLogic iLog = new IntLogic();

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
        int [] params = dc.decodeCommand(regCom, true);
        int ind;
        if (params[1] >=16){
            params = dc.decodeCommand(regCom, false);
            ind = params[1] - 16;
        }
        else ind = params[1];
        Register32 reSnd = null;


        if (params[0] >= 43 && params[0] <= 56){
            if (params[3] < 16) {
                reSnd = intRegs.get(params[3]);
            }
            else {reSnd = new Register32(0);}
            Register32 [] toSend = {intRegs.get(ind), intRegs.get(params[2]), reSnd, new Register32(params[3])};
            if (params[0] == 52) { intRegs.set(ind, iMem.execute(params[0], toSend, params[3]));}
            else {memory.writeWordToMemory(iMem.execute(params[0], toSend, params[3]), params[3]);}
        }

        if (params[0] > 0 && params[0] <= 19){
            if (params[3] < 16) {
                reSnd = intRegs.get(params[3]);
            }
            else {reSnd = new Register32(0);}
            Register32 [] toSend = {intRegs.get(ind), intRegs.get(params[2]), reSnd};
            intRegs.set(ind, iArit.execute(params[0], toSend, params[3]));
        }

        if (params[0] > 19 && params[0] <= 32){
            if (params[3] < 16) {
                reSnd = intRegs.get(params[3]);
            }
            else {reSnd = new Register32(0);}
            Register32 [] toSend = {intRegs.get(ind), intRegs.get(params[2]), reSnd};
            intRegs.set(ind, iLog.execute(params[0], toSend, params[3]));
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
