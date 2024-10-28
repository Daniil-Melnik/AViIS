package Etu;

import java.util.*;
import Etu.memory.cells.ByteCell;
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
        ArrayList<ByteCell> res = en.encodeCommand(str);
        for (int i = 0; i < 4; i++){
            ByteCell bc = res.get(i);
            System.out.println(bc.getStrValue());
        }
    }
}
