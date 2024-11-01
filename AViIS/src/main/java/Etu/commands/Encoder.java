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

        String operands = op.getOperands(toSend[0], toSend[1], toSend[2], toSend[3], !isInteger(toSend[toSend.length - 1]));
        
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

    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str); // Пытаемся преобразовать строку в int
            return true; // Если успешно, возвращаем true
        } catch (NumberFormatException e) {
            return false; // Если возникло исключение, возвращаем false
        }
    }

    public static void main(){
    }
}
