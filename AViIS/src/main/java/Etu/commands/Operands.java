package Etu.commands;

import Etu.intructions.IntArithmetic;

public class Operands {
    public String getOperands(String opMnemo, String reg1, String reg2, String c){
        String res = null;

        String opCode;
        String reg1Num;
        String reg2Num;
        String regCNum;

        opCode = IntArithmetic.valueOf(opMnemo).toString();

        if (reg1 != null && reg2 != null && c != null){
            reg1Num = toNBitBinary(reg1, 5);
            reg2Num = toNBitBinary(reg2, 5);
            regCNum = toNBitBinary(c, 15);
            res = opCode + reg1Num + reg2Num + regCNum;
        }

        else if (reg1 != null && reg2 != null && c == null){
            reg1Num = toNBitBinary(reg1, 5);
            reg2Num = toNBitBinary(reg2, 20);
            res = opCode + reg1Num + reg2Num;
        }

        else if (reg1 != null && reg2 == null && c == null){
            reg1Num = toNBitBinary(reg1, 25);
            res = opCode + reg1Num;
        }

        else if (reg1 == null && reg2 == null && c == null){
            res = opCode + "0000000000000000000000000";
        }

        return res;
    }

    public static String toNBitBinary(String input, int N) {
        int number;
        if (input.charAt(0) == 'r'){
            number = Integer.parseInt(input.substring(1));
        }
        else number = Integer.parseInt(input);

        String binaryStr = Integer.toBinaryString(number);

        while (binaryStr.length() < N) {
            binaryStr = "0" + binaryStr;
        }
        return binaryStr;
    }

    public static void main(){
        
    }
}
