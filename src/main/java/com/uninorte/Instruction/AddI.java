package com.uninorte.Instruction;

public class AddI extends InstructionI {
    public AddI(int idOp1, int constant, int idRta) {
        super(2);
        this.idOp1 = idOp1;
        this.constant = constant;
        this.idRta = idRta;
    }
    
}
