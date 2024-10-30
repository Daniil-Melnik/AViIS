package Etu.commands;

import Etu.intructions.OpCodes;

public class Operands {
    public String getOperands(String opMnemo, String reg1, String reg2, String c, boolean flag){
        String res = null;

        String opCode;
        String reg1Num;
        String reg2Num;
        String regCNum;

        opCode = OpCodes.valueOf(opMnemo).toString();

        if (reg1 != null && reg2 != null && c != null){
            reg1Num = toNBitBinary(reg1, 5, true);
            reg2Num = toNBitBinary(reg2, 5, true);
            regCNum = toNBitBinary(c, 15, flag);
            res = opCode + reg1Num + reg2Num + regCNum;
        }

        else if (reg1 != null && reg2 != null && c == null){
            reg1Num = toNBitBinary(reg1, 5, true);
            reg2Num = toNBitBinary(reg2, 20, flag);
            res = opCode + reg1Num + reg2Num;
        }

        else if (reg1 != null && reg2 == null && c == null){
            reg1Num = toNBitBinary(reg1, 25, true);
            res = opCode + reg1Num;
        }

        else if (reg1 == null && reg2 == null && c == null){
            res = opCode + "0000000000000000000000000";
        }

        return res;
    }

    public static String toNBitBinary(String input, int N, boolean flag) {
        int number = 0;
        float fnumber = 0;
        if (input.charAt(0) == 'r'){
            number = Integer.parseInt(input.substring(1));
        }
        else if (flag) number = Integer.parseInt(input);

        else if (!flag) fnumber = Float.parseFloat(input);


        String binaryStr = flag ? Integer.toBinaryString(number) : Integer.toBinaryString(Float.floatToIntBits(fnumber));

        while (binaryStr.length() < N) {
            binaryStr = "0" + binaryStr;
        }
        return binaryStr;
    }

    public static void main(){
        
    }
}
