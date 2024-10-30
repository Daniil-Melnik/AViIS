package Etu.intructions;

import Etu.memory.registers.Register32;

public class IntArithmetic {
   public Register32 execute(int opCode, Register32 [] reg, int cnst){
    int var1, var2;
    Register32 res = null;
        switch (opCode) {
            case 1:
                var1 = reg[1].toIntValue();
                var2 = reg[2].toIntValue();
                res = new Register32(var2 + var1);
                break;
            
            default:
                break;
        }
        return res;
   }
}
