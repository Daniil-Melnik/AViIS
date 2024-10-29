package Etu.commands;

import Etu.memory.cells.ByteCell;
import Etu.memory.registers.Register32;

import java.util.ArrayList;

public class Encoder {
    public Register32 encodeCommand(String command){
        int [] cell = new int[4];
        Operands op = new Operands();
        String[] sp = command.split("\\s+");
        String [] toSend = new String[4];

        for (int i = 0; i < 4; i++){
            toSend[i] = i < sp.length ? sp[i] : null;
        }

        String operands = op.getOperands(sp[0], sp[1], sp[2], sp[3]);
        
        ArrayList<ByteCell> res = new ArrayList<>();
        Register32 regRes;

        String[] substrings = new String[4];
        for (int i = 0; i < 4; i++) {
            substrings[i] = operands.substring(i * 8, (i + 1) * 8);
            // System.out.print(substrings[i] + " ");
            cell[i] = Integer.parseInt(substrings[i], 2);
            res.add(new ByteCell(cell[i]));
        }
        //System.out.println();
        regRes = new Register32(res);
        return regRes;
    };

    public static void main(){
    }
}
