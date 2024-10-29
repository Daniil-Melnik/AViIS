package Etu;

import Etu.memory.Memory;
import Etu.memory.registers.Register32;
import Etu.commands.Encoder;
import Etu.cpu.CPU;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Memory mem = new Memory();
        CPU cpu = new CPU(mem);

        String str = "ADD r1 r2 r3";
        Encoder en = new Encoder();
        Register32 res = en.encodeCommand(str);
        mem.writeCommandToMemory(res);

        str = "ADD r14 r2 r5";
        res = en.encodeCommand(str);
        mem.writeCommandToMemory(res);

        str = "SUB r10 r12 r5";
        res = en.encodeCommand(str);
        mem.writeCommandToMemory(res);

        cpu.step();
        cpu.step();
        cpu.step();

    }
}
