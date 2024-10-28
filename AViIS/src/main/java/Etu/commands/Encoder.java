package Etu.commands;

import Etu.intructions.Special;
import Etu.memory.cells.ByteCell;
import java.util.ArrayList;

public class Encoder {
    public ArrayList<ByteCell> encodeCommand(String command){
        byte [] cell = new byte[4];
        Operands op = new Operands();
        String[] sp = command.split("\\s+");
        String operands = op.getOperands(sp[0], sp[1], sp[2], sp[3]);
        
        ArrayList<ByteCell> res = new ArrayList<>();

        String[] substrings = new String[4];
        for (int i = 0; i < 4; i++) {
            substrings[i] = operands.substring(i * 8, (i + 1) * 8);
            System.out.print(substrings[i] + " ");
            cell[i] = (byte) Integer.parseInt(substrings[i], 2);
            res.add(new ByteCell(cell[i]));
        }
        System.out.println();

        return res;
    };

    public static void main(){
    }
}
