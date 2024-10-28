package Etu;

import Etu.commands.Operands;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String str = "ADD r1 r2 r3";
        Operands op = new Operands();
        String[] sp = str.split("\\s+");
        System.out.println(op.getOperands(sp[0], sp[1], sp[2], sp[3]));
    }
}
