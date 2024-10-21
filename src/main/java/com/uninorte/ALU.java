package com.uninorte;

public class ALU {
    
    public int operate(int instructionOpCode, int op1, int op2) {
        switch (instructionOpCode) {
            case 0:
            case 2:
                return op1 + op2;
            case 1:
            case 3:
                return op1 - op2;
        }
        return -1;
    }

}
