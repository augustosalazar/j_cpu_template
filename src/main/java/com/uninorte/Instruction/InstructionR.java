package com.uninorte.Instruction;

 public class InstructionR extends Instruction {

    protected int idOp1;
    protected int idOp2;
    protected int idRta;

    public InstructionR(int opcode) {
        super(opcode);

    }
    
    public int getIdOp1() {
        return idOp1;
    }

    public int getIdOp2() {
        return idOp2;
    }

    public int getIdRta() {
        return idRta;
    }
}
