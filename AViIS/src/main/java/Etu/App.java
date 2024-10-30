package Etu;

import Etu.memory.Memory;
import Etu.memory.registers.Register32;
import Etu.commands.Encoder;
import Etu.cpu.CPU;

public class App 
{
    public static void main( String[] args )
    {
        Memory mem = new Memory();
        CPU cpu = new CPU(mem);

        String str = "LI r1 1";
        Encoder en = new Encoder();
        Register32 res = en.encodeCommand(str);
        mem.writeCommandToMemory(res);

        str = "LI r2 2";
        res = en.encodeCommand(str);
        mem.writeCommandToMemory(res);

        str = "ADD r3 r1 r2";
        res = en.encodeCommand(str);
        mem.writeCommandToMemory(res);

        str = "AND r4 r3 r2";
        res = en.encodeCommand(str);
        mem.writeCommandToMemory(res);

        // str = "ADD r14 r2 r5";
        // res = en.encodeCommand(str);
        // mem.writeCommandToMemory(res);

        // str = "SUB r10 r12 r5";
        // res = en.encodeCommand(str);
        // mem.writeCommandToMemory(res);

        //mem.showMemory();
        cpu.step();
        cpu.step();
        cpu.step();
        cpu.step();

        cpu.showRegisters();

        //cpu.step();
        //cpu.step();

    }
}
