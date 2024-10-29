package Etu.commands;

import Etu.intructions.NumOper;
import Etu.memory.registers.Register32;

public class Decoder {
    public int [] decodeCommand(Register32 regCom){
        String regStr = regCom.toString();
        String opCode = regStr.substring(0,7);

        int numOper = NumOper.valueOf("r" + opCode).toInt();

        int opCodeInt = Integer.parseInt(opCode, 2);
        int reg1 = -1;
        int reg2 = -1;
        int c = -1;

        switch (numOper) {
            case 3:
                reg1 = Integer.parseInt(regStr.substring(7, 12), 2);
                reg2 = Integer.parseInt(regStr.substring(12, 17), 2);
                c = Integer.parseInt(regStr.substring(17, 32), 2);
                break;

            case 2:
                reg1 = Integer.parseInt(regStr.substring(7, 12), 2);
                c = Integer.parseInt(regStr.substring(12, 32), 2);
                break;

            case 1:
                c = Integer.parseInt(regStr.substring(7, 32), 2);
                break;
            
            case 0:
                break;

            default:
                break;
        }
        System.out.println(opCodeInt + " " + reg1 + " " + reg2 + " " + c);
        //System.out.println(opCode + " " + regStr.substring(7, 12) + " " + regStr.substring(12, 17) + " " + regStr.substring(17, 32));
        //regCom.showRegister();
        int [] res = {opCodeInt, reg1, reg2, c};
        return res;
    }
}
