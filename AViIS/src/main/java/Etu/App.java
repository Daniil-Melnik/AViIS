package Etu;

import Etu.memory.registers.Register32;
import Etu.commands.Encoder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String str = "ADD r1 r2 r3";
        Encoder en = new Encoder();
        Register32 res = en.encodeCommand(str);
        res.showRegister();
    }
}
