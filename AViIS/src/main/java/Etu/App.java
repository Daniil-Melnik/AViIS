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

        String str = "LI r3 100";
        Encoder en = new Encoder();
        Register32 res = en.encodeCommand(str);
        mem.writeCommandToMemory(res);

        // str = "ADD r14 r2 r5";
        // res = en.encodeCommand(str);
        // mem.writeCommandToMemory(res);

        // str = "SUB r10 r12 r5";
        // res = en.encodeCommand(str);
        // mem.writeCommandToMemory(res);

        cpu.step();
        cpu.showRegisters();

        //cpu.step();
        //cpu.step();

    }
}
