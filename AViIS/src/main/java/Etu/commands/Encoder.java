package Etu.commands;

import Etu.memory.cells.ByteCell;
import java.util.ArrayList;

public class Encoder {
    public void encodeCommand(String command){
        byte [] cell = new byte[4];

        ArrayList<ByteCell> res = new ArrayList<>();

        String[] substrings = new String[4];
        for (int i = 0; i < 4; i++) {
            substrings[i] = command.substring(i * 8, (i + 1) * 8);
            cell[i] = Byte.parseByte(substrings[i]);
            res.add(new ByteCell(cell[i]));
        }
    };

    public static void main(){
        String str = "ADD r1 r2 r3";
        Operands op = new Operands();
        String[] sp = str.split("\\s+");
        System.out.println(op.getOperands(sp[0], sp[1], sp[2], sp[3]));
    }
}
